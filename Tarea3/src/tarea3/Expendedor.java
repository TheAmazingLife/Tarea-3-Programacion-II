package tarea3;

/* 
 * addWallpaper() no pasado a este programa
 * colocarPanelIzquierdo() netodo sustituido por constructor de clase Expendedor
 * 
 */

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Expendedor extends JPanel {
    public JPanel panelExpendedora;

    // todos los panelIzquierdo se sustituyen por this ya que Expendedor es un panel izquierdo
    public Expendedor(JPanel panelPrincipal) {
        this.setBounds(0, 0, 640, 680);
        this.setLayout(null);
        panelPrincipal.add(this);
        colocarPanelExpendedora();
    }

    private void colocarPanelExpendedora() { // Agrega el panel expendedora a expendedor (lado izqauierdo)
        panelExpendedora = new JPanel();
        panelExpendedora.setBounds(145, 90, 350, 500);
        panelExpendedora.setLayout(null);
        panelExpendedora.setBackground(Color.ORANGE);
        this.add(panelExpendedora);
        colocarBotones();
        colocarEtiquetas();
        //mostrarBebidad(); no habilitado
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
}
