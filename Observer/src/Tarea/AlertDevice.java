package Tarea;

public class AlertDevice {
    public void update(int newTemperature) {
        if (newTemperature > 30) {
            System.out.println("Alerta: temperatura alta (" + newTemperature + "°C)!");
        }
    }
}
