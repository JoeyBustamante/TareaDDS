package Tarea;

public class Main {
    public static void main(String[] args) {
    	System.out.println(ObserverAspect.aspectOf());  // solo para ver si compila

    	
    	Sensor sensor = new Sensor();

        DisplayDevice pantalla = new DisplayDevice();
        AlertDevice alarma = new AlertDevice();

        ObserverAspect.aspectOf().addObserver(sensor, pantalla);
        ObserverAspect.aspectOf().addObserver(sensor, alarma);

        sensor.setTemperature(25);
        sensor.setTemperature(35);
    }
}
