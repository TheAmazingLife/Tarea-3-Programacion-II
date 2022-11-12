package tarea3;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelPrincipal extends JPanel {

    private Comprador com;
    private Expendedor exp;

    public PanelPrincipal(JFrame ventana) {
        this.setLayout(null);
        exp = new Expendedor(this);
        com = new Comprador(this);
        this.setBackground(Color.WHITE);
        ventana.getContentPane().add(this);
    }

    public Comprador getComprador(PanelPrincipal this) {
        return com;
    }
}
