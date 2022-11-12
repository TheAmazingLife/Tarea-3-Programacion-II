package tarea3;

/* 
 * colocarPaneDerecho() metodo sustituido por constructor de clase Comprador
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Comprador {

    private JLabel menuMonedas;
    private JLabel compradorVisible;
    private JPanel panelPrincipal;
    private Moneda moneda;
    private int posX, posY;

    // todos los panelDerecho se sustituyen por this ya que Comprador es un panel derecho
    public Comprador(JPanel panelPrincipal) {
        moneda = null;
        compradorSetXY(640, 560);
        this.panelPrincipal = panelPrincipal;
        visualizarComprador();

        colocarBebidasCompradas();
        colocarMenuMonedas();

    }

    public void compradorSetXY(int x, int y) {
        posX = x;
        posY = y;
    }

    private void visualizarComprador() { // Agrega el panel expendedora a expendedor (lado izqauierdo)
        compradorVisible = new JLabel();
        compradorVisible.setBounds(posX, posY, 350, 500);
        compradorVisible.setLayout(null);
        compradorVisible.setBackground(Color.black);
        panelPrincipal.add(compradorVisible);
    }

    private void colocarBebidasCompradas() {
        JLabel bebidasCompradas = new JLabel(new ImageIcon("src/recursos/depositoBebida.png"));
        bebidasCompradas.setBounds(425, 125, 70, 400);
        panelPrincipal.add(bebidasCompradas);
    }

    private void colocarMenuMonedas() {
        menuMonedas = new JLabel();
        menuMonedas.setBounds(posX, posY, 350, 100);
        menuMonedas.setLayout(null);
        menuMonedas.setBackground(Color.ORANGE);
        panelPrincipal.add(menuMonedas);
        colocarMonedas();
    }

    private void colocarMonedas() {

        // moneda100
        JButton moneda100 = new JButton(new ImageIcon("src/recursos/moneda100.png")); // tamaño de imagen ya coincide con tamaño del boton
        moneda100.setBounds(posX + 50, posY + 25, 50, 50);
        moneda100.setEnabled(true);
        moneda100.setBackground(Color.red);
        moneda100.setMnemonic('1');
        panelPrincipal.add(moneda100);

        // moneda500
        JButton moneda500 = new JButton(new ImageIcon("src/recursos/moneda500.png")); // tamaño de imagen ya coincide con tamaño del boton
        moneda500.setBounds(posX + 150, posY + 25, 50, 50);
        moneda500.setEnabled(true);
        moneda500.setBackground(Color.red);
        moneda500.setMnemonic('2');
        panelPrincipal.add(moneda500);

        // moneda1000
        JButton moneda1000 = new JButton(new ImageIcon("src/recursos/moneda1000.png")); // tamaño de imagen ya coincide con tamaño del boton
        moneda1000.setBounds(posX + 250, posY + 25, 50, 50);
        moneda1000.setEnabled(true);
        moneda1000.setBackground(Color.red);
        moneda1000.setMnemonic('1');
        panelPrincipal.add(moneda1000);

        //ARREGLAR COMPRADOR si es que se suplanta por this
        ActionListener pulsarMoneda100 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                moneda = new Moneda100();
                mostrarMoneda(moneda);
            }
        };

        ActionListener pulsarMoneda500 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                moneda = new Moneda500();
                mostrarMoneda(moneda);
            }
        };

        ActionListener pulsarMoneda1000 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                moneda = new Moneda1000();
                mostrarMoneda(moneda);
            }
        };

        moneda100.addActionListener(pulsarMoneda100);
        moneda500.addActionListener(pulsarMoneda500);
        moneda1000.addActionListener(pulsarMoneda1000);
    }

    public void mostrarMoneda(Moneda moneda) { // Metodo puede ser agregado los metodos de moneda???

        String aux = "" + moneda.getClass();
        System.out.println(aux);
        JLabel monedaVisual;
        panelPrincipal.removeAll();
        switch (aux) {
            case "class tarea3.Moneda100":
                monedaVisual = new JLabel(new ImageIcon("src/recursos/moneda100.png"));
                break;
            case "class tarea3.Moneda500":
                monedaVisual = new JLabel(new ImageIcon("src/recursos/moneda500.png"));
                break;
            case "class tarea3.Moneda1000":
                monedaVisual = new JLabel(new ImageIcon("src/recursos/moneda1000.png"));
                break;
            default:
                return;
        }

        monedaVisual.setBounds(0, 0, 50, 50);
        panelPrincipal.add(monedaVisual);
        panelPrincipal.repaint();
    }

    public Moneda getMoneda() { // Para ser usado
        Moneda aux = moneda;
        moneda = null;
        return aux;
    }

    public void addMoneda(Moneda moneda) {
        this.moneda = moneda;
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
