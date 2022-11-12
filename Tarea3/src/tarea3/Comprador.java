package tarea3;

/* 
 * colocarPaneDerecho() metodo sustituido por constructor de clase Comprador
 */

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Comprador extends JPanel {
    private JPanel panelMonedas;
    private JPanel panelComprador;

    private Moneda moneda;
    // todos los panelDerecho se sustituyen por this ya que Comprador es un panel derecho
    public Comprador(JPanel panelPrincipal) {
        this.setBounds(640, 0, 640, 680);
        this.setLayout(null);
        moneda = null;
        panelPrincipal.add(this);
        colocarBebidasCompradas();
        colocarPanelMonedas();
        colocarPanelComprador();
    }

    private void colocarBebidasCompradas() {
        JLabel bebidasCompradas = new JLabel(new ImageIcon("src/recursos/depositoBebida.png"));
        bebidasCompradas.setBounds(425, 125, 70, 400);
        this.add(bebidasCompradas);
    }

    private void colocarPanelMonedas() {
        panelMonedas = new JPanel();
        panelMonedas.setBounds(0, 500, 350, 100);
        panelMonedas.setLayout(null);
        panelMonedas.setBackground(Color.ORANGE);
        this.add(panelMonedas);
        colocarMonedas();
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
        
        //ARREGLAR COMPRADOR si es que se suplanta por this

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

    private void colocarPanelComprador() {
        panelComprador = new JPanel();
        panelComprador.setBounds(0, 125, 350, 350);
        panelComprador.setLayout(null);
        panelComprador.setBackground(Color.BLACK);
        this.add(panelComprador);
    }
    
    public void verMoneda(Moneda moneda) { // Metodo puede ser agregado los metodos de moneda???
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
    /* private Moneda moneda; //posible cambio como Moneda moneda en vez de comprador

    public Comprador() {
        this.moneda = null;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    public Moneda getMoneda() {
        return moneda;
    } */
}
