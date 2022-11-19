package tarea3;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Ventana2 extends JFrame {

    private PanelPrincipal panelPrincipal;

    public Ventana2() {
        crearVentana();
        panelPrincipal = new PanelPrincipal(this);
    }

    private void crearVentana() {
        this.setTitle("Maquina Expenderora"); // Titulo de la ventana
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Tipo de cerrado

        this.setResizable(false); // Evitar que sea reajustada
        this.setSize(1280, 720); // Resolucion de la ventana 1280 x 720
        this.setVisible(true); // set Visibilidad de la ventana como visible

        this.setLocationRelativeTo(null); // Posicion de la ventana al cento de la pantalla

        ImageIcon iconoVentana = new ImageIcon(this.getClass().getResource("/recursos/iconoVentana2.png"));
        this.setIconImage(iconoVentana.getImage()); // set iconoVentana como el icono de Ventana
    }
}
