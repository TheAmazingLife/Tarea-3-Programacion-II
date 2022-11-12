package tarea3;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelAntiguo extends JPanel {

    private Comprador com;
    private Expendedor exp;

    public PanelAntiguo(JFrame ventana) {
        this.setLayout(null);
        exp = new Expendedor(this);
        com = new Comprador(this);
        this.setBackground(Color.WHITE);
        ventana.getContentPane().add(this);
    }

    public Comprador getComprador() {
        return com;
    }
}
