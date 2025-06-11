package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChanger implements ActionListener {
    private final JPanel panel;
    private final Color color;
    private final String colorName;

    public ColorChanger(JPanel panel, Color color, String colorName) {
        this.panel = panel;
        this.color = color;
        this.colorName = colorName;
    }

    public void changeColor() {
        panel.setBackground(color);
        // No imprimimos nada aquí: lo hará el aspect
    }

    public String getColorName() {
        return colorName;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        changeColor();
    }
}
