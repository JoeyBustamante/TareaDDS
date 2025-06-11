package src;

import java.awt.Color;

public aspect ClickcounterAspect {
    private int redCount = 0;
    private int greenCount = 0;
    private int blueCount = 0;

    pointcut colorChange(Color color): execution(* ColorWindow.setBackgroundColor(Color)) && args(color);

    after(Color color): colorChange(color) {
        if (Color.RED.equals(color)) {
            redCount++;
            System.out.println("[Contador] Rojo clickeado " + redCount + " veces.");
        } else if (Color.GREEN.equals(color)) {
            greenCount++;
            System.out.println("[Contador] Verde clickeado " + greenCount + " veces.");
        } else if (Color.BLUE.equals(color)) {
            blueCount++;
            System.out.println("[Contador] Azul clickeado " + blueCount + " veces.");
        }
    }
}
