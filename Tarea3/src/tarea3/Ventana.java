package tarea3;

import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame {

    public JPanel panel;

    public Ventana() {
        crearVentana();
        iniciarComponentes();
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

    private void iniciarComponentes() {
        colocarPanel();
        colocarBotones();
        colocarEtiquetas();
    }

    private void colocarPanel() {

        // se coloca el fondo
        panel = new JPanel();
        panel.setBackground(Color.lightGray);
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }

    private void colocarEtiquetas() {

        // ventana 1
        JLabel ventana1 = new JLabel();
        ventana1.setBounds(60 + 130 * 0, 50, 120, 400);
        ventana1.setOpaque(true);
        ventana1.setBackground(Color.cyan);
        ventana1.setLayout(null);
        panel.add(ventana1);

        // ventana 2
        JLabel ventana2 = new JLabel();
        ventana2.setBounds(60 + 130 * 1, 50, 120, 400);
        ventana2.setOpaque(true);
        ventana2.setBackground(Color.cyan);
        ventana2.setLayout(null);
        panel.add(ventana2);

        // ventana 3
        JLabel ventana3 = new JLabel();
        ventana3.setBounds(60 + 130 * 2, 50, 120, 400);
        ventana3.setOpaque(true);
        ventana3.setBackground(Color.cyan);
        ventana3.setLayout(null);
        panel.add(ventana3);

        // se coloca la maquina
        JLabel maquina = new JLabel();
        maquina.setBounds(250, 10, 350, 500);
        maquina.setOpaque(true);
        maquina.setBackground(Color.orange);
        maquina.setLayout(null);
        panel.add(maquina);

    }

    private void colocarBotones() {

        // Boton PULL
        JButton botonPull = new JButton("PULL");
        botonPull.setBounds(60, 450 + 50, 380, 100);
        botonPull.setForeground(Color.white);
        botonPull.setBackground(Color.black);
        botonPull.setFont(new Font("arial", 1, 20));
        botonPull.setEnabled(true); // si es false, el boton esta "apagado"
        botonPull.setMnemonic('p'); // la tecla funciona con alt + letra
        panel.add(botonPull);

        // boton cocacola
        JButton botonCocacola = new JButton(new ImageIcon("botonCocacola.png")); // tamaño de imagen ya coincide con tamaño del boton
        botonCocacola.setBounds(490, 100, 80, 40);
        botonCocacola.setEnabled(true);
        botonCocacola.setBackground(Color.red);
        botonCocacola.setMnemonic('c');
        panel.add(botonCocacola);

        // boton fanta
        JButton botonFanta = new JButton(new ImageIcon("botonCocacola.png")); // tamaño de imagen ya coincide con tamaño del boton
        botonFanta.setBounds(490, 170, 80, 40);
        botonFanta.setEnabled(true);
        botonFanta.setBackground(Color.red);
        botonFanta.setMnemonic('c');
        panel.add(botonFanta);

        // boton sprite
        JButton botonSprite = new JButton(new ImageIcon("botonCocacola.png")); // tamaño de imagen ya coincide con tamaño del boton
        botonSprite.setBounds(490, 240, 80, 40);
        botonSprite.setEnabled(true);
        botonSprite.setBackground(Color.red);
        botonSprite.setMnemonic('c');
        panel.add(botonSprite);
    }
}
