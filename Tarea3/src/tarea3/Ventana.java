package tarea3;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Ventana extends JFrame {
    public Ventana() {
        crearVentana();
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

}
