package tarea3;

/* 
 * colocarPaneDerecho() metodo sustituido por constructor de clase Comprador
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Comprador {

    private JPanel panelPrincipal;
    private Moneda moneda;
    private JLabel monedaVisual;
    private JLabel monedaVisualNueva;
    private int posX, posY;
    private int posXBilletera, posYBilletera;

    // todos los panelDerecho se sustituyen por this ya que Comprador es un panel derecho
    public Comprador(JPanel panelPrincipal) {
        moneda = null;
        monedaVisual = null;
        monedaVisualNueva = null;
        compradorSetXY(640, 50);
        posXBilletera = 0;
        posYBilletera = 0;
        billeteraSetXY(posX, posY);
        this.panelPrincipal = panelPrincipal;
        visualizarComprador();
        //colocarBebidasCompradas();
        colocarBilletera();
    }

    public void compradorSetXY(int x, int y) {
        posX = x;
        posY = y;
    }

    public void billeteraSetXY(int x, int y) {
        posXBilletera += x;
        posYBilletera += y;
    }

    private void visualizarComprador() {
        JLabel compradorVisible = new JLabel(new ImageIcon("src/recursos/comprador.png"));
        compradorVisible.setLayout(null);
        compradorVisible.setBounds(posX, posY, 350, 350);
        panelPrincipal.add(compradorVisible);
    }

    private void colocarBebidasCompradas() {
        JLabel bebidasCompradas = new JLabel(new ImageIcon("src/recursos/depositoBebida.png"));
        bebidasCompradas.setBounds(425, 125, 70, 400);
        panelPrincipal.add(bebidasCompradas);
    }

    private void colocarBilletera() {
        JLabel menuMonedas = new JLabel(new ImageIcon("src/recursos/billetera.png"));
        menuMonedas.setLayout(null);
        billeteraSetXY(0, 360);
        colocarMonedas();
        menuMonedas.setBounds(posXBilletera, posYBilletera, 350, 213);
        panelPrincipal.add(menuMonedas);
    }

    private void colocarMonedas() {

        // moneda100
        JButton moneda100 = new JButton(new ImageIcon("src/recursos/moneda100.png")); // tamaño de imagen ya coincide con tamaño del boton
        System.out.println(posXBilletera + 50);
        System.out.println(posYBilletera + 25);
        moneda100.setBounds(posXBilletera + 28, posYBilletera + 80, 50, 50);
        moneda100.setEnabled(true);
        moneda100.setMnemonic('1');
        panelPrincipal.add(moneda100);

        // moneda500
        JButton moneda500 = new JButton(new ImageIcon("src/recursos/moneda500.png")); // tamaño de imagen ya coincide con tamaño del boton
        moneda500.setBounds(posXBilletera + 83, posYBilletera + 80, 50, 50);
        moneda500.setEnabled(true);
        moneda500.setMnemonic('2');
        panelPrincipal.add(moneda500);

        // moneda1000
        JButton moneda1000 = new JButton(new ImageIcon("src/recursos/moneda1000.png")); // tamaño de imagen ya coincide con tamaño del boton
        moneda1000.setBounds(posXBilletera + 138, posYBilletera + 80, 50, 50);
        moneda1000.setEnabled(true);
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
        switch (aux) {
            case "class tarea3.Moneda100":
                monedaVisualNueva = new JLabel(new ImageIcon("src/recursos/moneda100.png"));
                break;
            case "class tarea3.Moneda500":
                monedaVisualNueva = new JLabel(new ImageIcon("src/recursos/moneda500.png"));
                break;
            case "class tarea3.Moneda1000":
                monedaVisualNueva = new JLabel(new ImageIcon("src/recursos/moneda1000.png"));
                break;
            default:
                return;
        }
        if (monedaVisual != null) {
            panelPrincipal.remove(monedaVisual);
        }
        monedaVisualNueva.setBounds(posX + 200, posY + 260, 50, 50);
        panelPrincipal.add(monedaVisualNueva);
        monedaVisual = monedaVisualNueva;
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
