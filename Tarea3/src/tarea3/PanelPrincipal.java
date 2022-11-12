package tarea3;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelPrincipal extends JPanel {
    private Comprador com;
    private Expendedor exp;

    public PanelPrincipal(JFrame ventana) {
        this.setBackground(Color.WHITE);
        this.setLayout(null);
        exp = new Expendedor(this);
        com = new Comprador(this); 
        ventana.getContentPane().add(this);
    }
}
