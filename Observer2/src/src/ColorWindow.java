package src;

import javax.swing.*;
import java.awt.*;

public class ColorWindow extends JFrame {
    private JPanel panel;

    public ColorWindow() {
        setTitle("Cambiar color de fondo");
        setSize(400, 300); // ← aquí estaba el error, ya corregido
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JButton btnRojo = new JButton("Rojo");
        JButton btnVerde = new JButton("Verde");
        JButton btnAzul = new JButton("Azul");

        btnRojo.addActionListener(e -> setBackgroundColor(Color.RED));
        btnVerde.addActionListener(e -> setBackgroundColor(Color.GREEN));
        btnAzul.addActionListener(e -> setBackgroundColor(Color.BLUE));

        panel.add(btnRojo);
        panel.add(btnVerde);
        panel.add(btnAzul);

        add(panel);
    }
    
    public void setBackgroundColor(Color color) {
        panel.setBackground(color);
        System.out.println("Color cambiado a => " + getColorName(color));
    }
    
    public String getColorName(Color color) {
        if (Color.RED.equals(color)) {
            return "Rojo";
        } else if (Color.GREEN.equals(color)) {
            return "Verde";
        } else if (Color.BLUE.equals(color)) {
            return "Azul";
        } else {
            return "Desconocido";
        }
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ColorWindow window = new ColorWindow();
            window.setVisible(true);
        });
    }
}
