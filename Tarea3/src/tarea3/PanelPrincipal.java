package tarea3;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelPrincipal extends JPanel {

    private Comprador com;
    private ExpendedorNuevo exp;

    public PanelPrincipal(JFrame ventana) {
        this.setLayout(null);
        exp = new ExpendedorNuevo();
        com = new Comprador(this);
        this.setBackground(Color.white);
        ventana.getContentPane().add(this);
        inicializarTodo();
    }

    public void inicializarTodo() {
        exp.graficaExpendedor(this);
    }

    public void monedaComprador() {
        System.out.println("BANANA");
        exp.addMoneda(com.getMoneda());
    }
    
    public void monedaExpendedora() {
        System.out.println("Amongu");
        com.addMoneda(exp.retornarMoneda());
    }
}
