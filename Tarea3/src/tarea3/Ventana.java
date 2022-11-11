package tarea3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ventana extends JFrame {

    public JPanel panelPrincipal;
    public JPanel panelIzquierdo;
    public JPanel panelDerecho;
    public JPanel panelExpendedora;
    public JPanel panelComprador;
    public JPanel panelMonedas;

    public JLabel monedaVisible;

    private Comprador comprador;
    //private Expendedor expendedor;

    public Ventana() {
        comprador = new Comprador();
        //expendedor = new Expendedor();
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

        ImageIcon iconoVentana = new ImageIcon(this.getClass().getResource("/recursos/iconoVentana2.png")); // Creaciom de ImageIcon con el icono de la ventana
        this.setIconImage(iconoVentana.getImage()); // set iconoVentana como el icono de Ventana
        // medoto alternativo this.setIconImage(new ImageIcon(this.getClass().getResource("/recursos/iconoVentana.png")).getImage());
    }

    private void iniciarComponentes() {
        //colocarPanelPrincipal();
        //colocarPanelIzquierdo();
        //colocarPanelExpendedora();
        //colocarPanelDerecho();
        //colocarPanelMonedas();
        //colocarPanelComprador();
    }

    private void colocarPanelPrincipal() {

        // se coloca el fondo
        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(null);
        this.getContentPane().add(panelPrincipal);
        //addWallpaper();
    }

    private void colocarPanelIzquierdo() {

        panelIzquierdo = new JPanel();
        panelIzquierdo.setBounds(0, 0, 640, 680);
        panelIzquierdo.setLayout(null);
        panelPrincipal.add(panelIzquierdo);
    }

    private void colocarPanelDerecho() {

        panelDerecho = new JPanel();
        panelDerecho.setBounds(640, 0, 640, 680);
        panelDerecho.setLayout(null);
        panelPrincipal.add(panelDerecho);
        colocarBebidasCompradas();
    }

    private void colocarBebidasCompradas() {
        JLabel bebidasCompradas = new JLabel(new ImageIcon("src/recursos/depositoBebida.png"));
        bebidasCompradas.setBounds(425, 125, 70, 400);
        panelDerecho.add(bebidasCompradas);
    }

    private void addWallpaper() {

        JLabel wallpaper = new JLabel(new ImageIcon("src/recursos/wallpaperExpendedora.jpg"));
        wallpaper.setBounds(0, 0, 1280, 720);
        panelPrincipal.add(wallpaper);
    }

    private void colocarPanelExpendedora() {
        // se coloca la maquina
        panelExpendedora = new JPanel();
        panelExpendedora.setBounds(145, 90, 350, 500);
        panelExpendedora.setLayout(null);
        panelExpendedora.setBackground(Color.orange);
        panelIzquierdo.add(panelExpendedora);
        colocarBotones();
        colocarEtiquetas();
        //mostrarBebidas();
    }

    private void colocarPanelMonedas() {
        panelMonedas = new JPanel();
        panelMonedas.setBounds(0, 500, 350, 100);
        panelMonedas.setLayout(null);
        panelMonedas.setBackground(Color.orange);
        panelDerecho.add(panelMonedas);
        colocarMonedas();
    }

    private void colocarPanelComprador() {
        panelComprador = new JPanel();
        panelComprador.setBounds(0, 125, 350, 350);
        panelComprador.setLayout(null);
        panelComprador.setBackground(Color.black);
        panelDerecho.add(panelComprador);
    }

    private void colocarEtiquetas() {

        // ventana 1
        JLabel ventana1 = new JLabel(new ImageIcon("src/recursos/depositoBebida.png"));
        ventana1.setBounds(30, 15, 70, 400);
        panelExpendedora.add(ventana1);

        // ventana 2
        JLabel ventana2 = new JLabel(new ImageIcon("src/recursos/depositoBebida.png"));
        ventana2.setBounds(110, 15, 70, 400);
        panelExpendedora.add(ventana2);

        // ventana 3
        JLabel ventana3 = new JLabel(new ImageIcon("src/recursos/depositoBebida.png"));
        ventana3.setBounds(190, 15, 70, 400);
        panelExpendedora.add(ventana3);
    }

    private void colocarBotones() {

        // Boton PULL
        JButton botonPull = new JButton("PULL");
        botonPull.setBounds(30, 430, 230, 50);
        botonPull.setForeground(Color.white);
        botonPull.setBackground(Color.black);
        botonPull.setFont(new Font("arial", 1, 20));
        botonPull.setEnabled(true); // si es false, el boton esta "apagado"
        botonPull.setMnemonic('p'); // la tecla funciona con alt + letra
        panelExpendedora.add(botonPull);

        // boton cocacola
        JButton botonCocacola = new JButton(new ImageIcon("src/recursos/botonCocacola.jpg")); // tamaño de imagen ya coincide con tamaño del boton
        botonCocacola.setBounds(270, 180, 60, 30);
        botonCocacola.setEnabled(true);
        botonCocacola.setBackground(Color.red);
        botonCocacola.setMnemonic('c');
        panelExpendedora.add(botonCocacola);

        // boton fanta
        JButton botonFanta = new JButton(new ImageIcon("src/recursos/botonFanta.jpg")); // tamaño de imagen ya coincide con tamaño del boton
        botonFanta.setBounds(270, 220, 60, 30);
        botonFanta.setEnabled(true);
        botonFanta.setBackground(Color.red);
        botonFanta.setMnemonic('f');
        panelExpendedora.add(botonFanta);

        // boton sprite
        JButton botonSprite = new JButton(new ImageIcon("src/recursos/botonSprite.jpg")); // tamaño de imagen ya coincide con tamaño del boton
        botonSprite.setBounds(270, 260, 60, 30);
        botonSprite.setEnabled(true);
        botonSprite.setBackground(Color.red);
        botonSprite.setMnemonic('s');
        panelExpendedora.add(botonSprite);

        // boton ranura de monedas
        JButton botonRanura = new JButton(new ImageIcon("src/recursos.jpg")); // tamaño de imagen ya coincide con tamaño del boton
        botonRanura.setBounds(270, 300, 30, 30);
        botonRanura.setEnabled(true);
        botonRanura.setBackground(Color.black);
        botonRanura.setMnemonic('r');
        panelExpendedora.add(botonRanura);

        // boton vuelto
        JButton botonVuelto = new JButton(new ImageIcon("src/recursos.jpg")); // tamaño de imagen ya coincide con tamaño del boton
        botonVuelto.setBounds(270, 340, 30, 30);
        botonVuelto.setEnabled(true);
        botonVuelto.setBackground(Color.black);
        botonVuelto.setMnemonic('v');
        panelExpendedora.add(botonVuelto);
    }

    private void colocarMonedas() {

        // moneda100
        JButton moneda100 = new JButton(new ImageIcon("src/recursos/moneda100.png")); // tamaño de imagen ya coincide con tamaño del boton
        moneda100.setBounds(50, 25, 50, 50);
        moneda100.setEnabled(true);
        moneda100.setBackground(Color.red);
        moneda100.setMnemonic('1');
        panelMonedas.add(moneda100);

        // moneda500
        JButton moneda500 = new JButton(new ImageIcon("src/recursos/moneda500.png")); // tamaño de imagen ya coincide con tamaño del boton
        moneda500.setBounds(150, 25, 50, 50);
        moneda500.setEnabled(true);
        moneda500.setBackground(Color.red);
        moneda500.setMnemonic('2');
        panelMonedas.add(moneda500);

        // moneda1000
        JButton moneda1000 = new JButton(new ImageIcon("src/recursos/moneda1000.png")); // tamaño de imagen ya coincide con tamaño del boton
        moneda1000.setBounds(250, 25, 50, 50);
        moneda1000.setEnabled(true);
        moneda1000.setBackground(Color.red);
        moneda1000.setMnemonic('1');
        panelMonedas.add(moneda1000);

        ActionListener pulsarMoneda100 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                comprador.setMoneda(new Moneda100());
                verMoneda(comprador.getMoneda());
            }
        };

        ActionListener pulsarMoneda500 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                comprador.setMoneda(new Moneda500());
                verMoneda(comprador.getMoneda());
            }
        };

        ActionListener pulsarMoneda1000 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                comprador.setMoneda(new Moneda1000());
                verMoneda(comprador.getMoneda());
            }
        };

        moneda100.addActionListener(pulsarMoneda100);
        moneda500.addActionListener(pulsarMoneda500);
        moneda1000.addActionListener(pulsarMoneda1000);
    }

    public void verMoneda(Moneda moneda) {
        String aux = "" + moneda.getClass();    
        JLabel monedaVisual = null;
        switch (aux) {
            case "Moneda100":
                monedaVisual = new JLabel(new ImageIcon("src/recursos/moneda100.png"));
                break;
            case "Moneda500":
                monedaVisual = new JLabel(new ImageIcon("src/recursos/moneda500.png"));
                break;
            case "Moneda1000":
                monedaVisual = new JLabel(new ImageIcon("src/recursos/moneda1000.png"));
                break;
        }

        if (monedaVisual != null) {
            monedaVisual.setBounds(0, 0, 50, 50);
            panelComprador.add(monedaVisual);
        }

    }
    /*
    mostrarBebidas(){
    }
     */
}
