package src;

import javax.swing.*;
import java.awt.*;

public class ColorWindow extends JFrame {
    private JPanel panel;

    public ColorWindow() {
        setTitle("Cambiar color de fondo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JButton btnRojo = new JButton("Rojo");
        JButton btnVerde = new JButton("Verde");
        JButton btnAzul = new JButton("Azul");

        btnRojo.addActionListener(new ColorChanger(panel, Color.RED, "Rojo"));
        btnVerde.addActionListener(new ColorChanger(panel, Color.GREEN, "Verde"));
        btnAzul.addActionListener(new ColorChanger(panel, Color.BLUE, "Azul"));

        panel.add(btnRojo);
        panel.add(btnVerde);
        panel.add(btnAzul);

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ColorWindow window = new ColorWindow();
            window.setVisible(true);
        });
    }
}
