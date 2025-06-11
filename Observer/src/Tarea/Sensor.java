package Tarea;

public class Sensor {
    private int temperature;

    public void setTemperature(int newTemperature) {
        System.out.println("Sensor: temperatura actualizada a " + newTemperature + "°C");
        this.temperature = newTemperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
