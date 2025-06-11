package Tarea;

import java.util.*;

public aspect ObserverAspect {
    private Map<Sensor, List<Object>> observers = new WeakHashMap<>();

    after(Sensor s): execution(void Sensor.setTemperature(int)) && this(s) {
        notifyObservers(s);
    }

    public void ObserverAspect.addObserver(Sensor s, Object observer) {
        observers.computeIfAbsent(s, k -> new ArrayList<>()).add(observer);
    }

    private void notifyObservers(Sensor s) {
        int temp = s.getTemperature();
        List<Object> list = observers.get(s);
        if (list != null) {
            for (Object obs : list) {
                try {
                    obs.getClass().getMethod("update", int.class).invoke(obs, temp);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
