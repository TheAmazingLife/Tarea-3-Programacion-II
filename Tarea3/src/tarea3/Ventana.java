package tarea3;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame {
    private JPanel panel;
    public Ventana() {
        crearVentana();
        crearPanel();
    }

    private void crearVentana() {
        this.setTitle("Maquina Expenderora"); // Titulo de la ventana
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Tipo de cerrado

        this.setResizable(false); // Eviar que sea reajustada
        this.setSize(1280, 720); // Resolucion de la ventana 1280 x 720
        this.setVisible(true); // set Visibilidad de la ventana como visible

        this.setLocationRelativeTo(null); // Posicion de la ventana al cento de la pantalla

        ImageIcon iconoVentana = new ImageIcon(this.getClass().getResource("/recursos/iconoVentana.png")); // Creaciom de ImageIcon con el icono de la ventana
        this.setIconImage(iconoVentana.getImage()); // set iconoVentana como el icono de Ventana
        // medoto alternativo this.setIconImage(new ImageIcon(this.getClass().getResource("/recursos/iconoVentana.png")).getImage());
    }

    private void crearPanel() {
        panel = new JPanel();
        this.getContentPane().add(panel);
        JLabel etiqueta = new JLabel();
        etiqueta.setBounds(400, 300, 300, 80);
        etiqueta.setText("Esto es cine"); // Establecer el texto de la etiqueta
        etiqueta.setBounds(85, 10, 300, 80);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER); // Establecemos la alineacion horizontal
        etiqueta.setForeground(Color.BLACK); // Establecer el color de la letra
        panel.add(etiqueta);
    }

}
