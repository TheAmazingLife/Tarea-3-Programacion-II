package tarea3;

import javax.swing.*;

public class PanelPrincipal extends JPanel {

    private Comprador com;
    private ExpendedorNuevo exp;

    public PanelPrincipal(JFrame ventana) {
        this.setLayout(null);
        exp = new ExpendedorNuevo();
        exp.graficaExpendedor(this);
        com = new Comprador(this);

        exp.setComprador(com); // Entregamos comprador a la expendedora

        JLabel wallpaper = new JLabel(new ImageIcon(this.getClass().getResource("/recursos/wallpaperExpendedora.jpg")));
        wallpaper.setLayout(null);
        wallpaper.setBounds(0, 0, 1280, 720);
        add(wallpaper);

        ventana.getContentPane().add(this);
    }

    /* public void monedaComprador() {
        System.out.println("BANANA");
        exp.addMoneda(com.getMoneda());
    }

    public void monedaExpendedora() {
        System.out.println("Amongu");
        com.addMoneda(exp.retornarMoneda());
    } */
}
