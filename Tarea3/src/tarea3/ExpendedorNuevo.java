package tarea3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * ExpendedorNuevo
 */
public class ExpendedorNuevo {

    // FrontEnd
    private JLabel expendedoraVisible;
    private JPanel panelPrincipal;
    private int posX, posY;

    public void graficaExpendedor(JPanel panelPrincipal) {
        expendedorSetXY(145, 90);
        this.panelPrincipal = panelPrincipal;
        visualizarExpendedora();
    }

    public void expendedorSetXY(int x, int y) {
        posX = x;
        posY = y;
    }

    private void visualizarExpendedora() { // Agrega el panel expendedora a expendedor (lado izqauierdo)
        expendedoraVisible = new JLabel();
        expendedoraVisible.setBounds(posX, posY, 350, 500);
        expendedoraVisible.setLayout(null);
        expendedoraVisible.setBackground(Color.ORANGE);
        panelPrincipal.add(expendedoraVisible);
        colocarBotones();
        colocarEtiquetas();
        // mostrarBebidas(); no habilitado
    }

    private void colocarBotones() {

        // Boton PULL
        JButton botonPull = new JButton("PULL");
        botonPull.setBounds(posX + 30, posY + 430, 230, 50);
        botonPull.setForeground(Color.white);
        botonPull.setBackground(Color.black);
        botonPull.setFont(new Font("arial", 1, 20));
        botonPull.setEnabled(true); // si es false, el boton esta "apagado"
        botonPull.setMnemonic('p'); // la tecla funciona con alt + letra
        panelPrincipal.add(botonPull);

        // boton cocacola
        JButton botonCocacola = new JButton(new ImageIcon("src/recursos/botonCocacola.jpg")); // tamaño de imagen ya
        // coincide con tamaño del
        // boton
        botonCocacola.setBounds(posX + 270, posY + 180, 60, 30);
        botonCocacola.setEnabled(true);
        botonCocacola.setBackground(Color.red);
        botonCocacola.setMnemonic('c');
        panelPrincipal.add(botonCocacola);

        // boton fanta
        JButton botonFanta = new JButton(new ImageIcon("src/recursos/botonFanta.jpg")); // tamaño de imagen ya coincide
        // con tamaño del boton
        botonFanta.setBounds(posX + 270, posY + 220, 60, 30);
        botonFanta.setEnabled(true);
        botonFanta.setBackground(Color.red);
        botonFanta.setMnemonic('f');
        panelPrincipal.add(botonFanta);

        // boton sprite
        JButton botonSprite = new JButton(new ImageIcon("src/recursos/botonSprite.jpg")); // tamaño de imagen ya
        // coincide con tamaño del
        // boton
        botonSprite.setBounds(posX + 270, posY + 260, 60, 30);
        botonSprite.setEnabled(true);
        botonSprite.setBackground(Color.red);
        botonSprite.setMnemonic('s');
        panelPrincipal.add(botonSprite);

        // boton ranura de monedas
        JButton botonRanura = new JButton(new ImageIcon("src/recursos.jpg")); // tamaño de imagen ya coincide con tamaño
        // del boton
        botonRanura.setBounds(posX + 270, posY + 300, 30, 30);
        botonRanura.setEnabled(true);
        botonRanura.setBackground(Color.black);
        botonRanura.setMnemonic('r');
        panelPrincipal.add(botonRanura);

        // boton vuelto
        JButton botonVuelto = new JButton(new ImageIcon("src/recursos.jpg")); // tamaño de imagen ya coincide con tamaño
        // del boton
        botonVuelto.setBounds(posX + 270, posY + 340, 30, 30);
        botonVuelto.setEnabled(true);
        botonVuelto.setBackground(Color.black);
        botonVuelto.setMnemonic('v');
        panelPrincipal.add(botonVuelto);

        ActionListener pulsarCocacola = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                intentarCompra(monedaIngresada, 1);
            }
        };

        ActionListener pulsarFanta = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                intentarCompra(monedaIngresada, 2);
            }
        };

        ActionListener pulsarSprite = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                intentarCompra(monedaIngresada, 3);
            }
        };

        ActionListener pulsarRanuraMonedas = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                panelPrincipal.monedaComprador();
            }
        };

        // Boton Vuelto
        ActionListener pulsarBotonVuelto = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                panelPrincipal.monedaExpendedora();
            }
        };

        botonCocacola.addActionListener(pulsarCocacola);
        botonFanta.addActionListener(pulsarFanta);
        botonSprite.addActionListener(pulsarSprite);
        botonRanura.addActionListener(pulsarRanuraMonedas);
        botonVuelto.addActionListener(pulsarBotonVuelto);

    }

    private void colocarEtiquetas() {

        // ventana 1
        JLabel ventana1 = new JLabel(new ImageIcon("src/recursos/depositoBebida.png"));
        ventana1.setBounds(posX + 30, posY + 15, 70, 400);
        panelPrincipal.add(ventana1);

        // ventana 2
        JLabel ventana2 = new JLabel(new ImageIcon("src/recursos/depositoBebida.png"));
        ventana2.setBounds(posX + 110, posY + 15, 70, 400);
        panelPrincipal.add(ventana2);

        // ventana 3
        JLabel ventana3 = new JLabel(new ImageIcon("src/recursos/depositoBebida.png"));
        ventana3.setBounds(posX + 190, posY + 15, 70, 400);
        panelPrincipal.add(ventana3);
    }

    // BackEnd
    private DepositoBebida cocacola;
    private DepositoBebida sprite;
    private DepositoBebida fanta;

    private int precioBebidas;

    private DepositoVuelto vueltoTotal;
    private DepositoVuelto depositoMonedasCompras;

    private Bebida depositoEspecial;
    private Moneda monedaIngresada;
    private Moneda depositoRetorno;

    public ExpendedorNuevo() {

        cocacola = new DepositoBebida();
        sprite = new DepositoBebida();
        fanta = new DepositoBebida();
        // this.precioBebidas = precioBebidas; // Seleccionar el precio de las bebidas
        vueltoTotal = new DepositoVuelto();
        depositoMonedasCompras = new DepositoVuelto();
        depositoEspecial = null;
        monedaIngresada = null;
        depositoRetorno = null;
        // ! Temporal
        this.precioBebidas = 800; // Definir precio
        int numBebidas = 5;
        // ! Temporal
        for (int i = 0; i < numBebidas; i++) { // relleno de maquina con bebidas
            Bebida cocacola = new CocaCola(100 + i);
            this.cocacola.addBebida(cocacola);
            Bebida spritee = new Sprite(200 + i);
            this.sprite.addBebida(spritee);
            Bebida fanta = new Fanta(300 + i);
            this.fanta.addBebida(fanta);
        }
    }

    public void addMoneda(Moneda moneda) {
        monedaIngresada = moneda;
    }

    public void intentarCompra(Moneda monedaIngresada, int cualBebida) {
        try {
            // Intenta comprar la bebida e imprime si se realizo con exito
            comprarBebida(monedaIngresada, cualBebida);
            monedaIngresada = null; // la moneda fue gastada
            System.out.println("Compra Realizada con exito.");
        } catch (PagoIncorrectoException | PagoInsuficienteException | NoHayBebidaException e) {
            // En caso de que no se concrete la compra se deja el sabor como null
            depositoRetorno = monedaIngresada;
            monedaIngresada = null;
            System.out.println(e.getMessage());
        }
    }

    public void comprarBebida(Moneda moneda, int cual)
            throws PagoIncorrectoException, NoHayBebidaException, PagoInsuficienteException { // compra la bebida,
        // retorna excepciones en
        // caso de fallas
        Bebida bebida = null;
        if (moneda == null) {
            throw new PagoIncorrectoException("No se puede comprar una bebida sin dinero."); // PagoIncorrectoException
        } else {
            if (moneda.getValor() >= precioBebidas) {
                // en caso de no haber bebidas o numero erroneo NoHayBebidaException y devuelve
                // la moneda al deposito
                switch (cual) {
                    case 1:
                        bebida = cocacola.getBebida();
                        if (bebida != null) {
                            calcularVuelto(moneda);
                            depositoMonedasCompras.add(moneda);
                            addBebida(bebida);
                        } else {
                            vueltoTotal.add(moneda);
                            throw new NoHayBebidaException("No hay bebida disponible."); // NoHayBebidaException
                        }
                    case 2:
                        bebida = sprite.getBebida();
                        if (bebida != null) {
                            calcularVuelto(moneda);
                            depositoMonedasCompras.add(moneda);
                            addBebida(bebida);
                        } else {
                            vueltoTotal.add(moneda);
                            throw new NoHayBebidaException("No hay bebida disponible."); // NoHayBebidaException
                        }
                    case 3:
                        bebida = fanta.getBebida();
                        if (bebida != null) {
                            calcularVuelto(moneda);
                            depositoMonedasCompras.add(moneda);
                            addBebida(bebida);
                        } else {
                            vueltoTotal.add(moneda);
                            throw new NoHayBebidaException("No hay bebida disponible."); // NoHayBebidaException
                        }
                    default: // caso numero erroneo
                        vueltoTotal.add(moneda);
                        throw new NoHayBebidaException("No hay bebida disponible."); // NoHayBebidaException
                }
            } else {
                vueltoTotal.add(moneda);
                throw new PagoIncorrectoException("Saldo insuficiente."); // PagoInsuficienteException
            }
        }
    }

    public void calcularVuelto(Moneda moneda) { // calcula vuelto y lo devuelve al DepositoVuelto vueltoTotal en monedas
        // de 100
        int monedas100 = (moneda.getValor() - precioBebidas) / 100;
        for (int i = 0; i < monedas100; i++) {
            Moneda monedaVuelto = new Moneda100();
            vueltoTotal.add(monedaVuelto);
        }
    }

    public Moneda retornarMoneda() { // Metodo Retorno de moneda en depositoRetorno
        Moneda aux = depositoRetorno;
        depositoRetorno = null;
        return aux;
    }

    public Moneda getVuelto() { // devuelve UNA moneda del deposito en caso de que este vacio retorna null
        return vueltoTotal.getVuelto(); // se rescatan una a una
    }

    public int getPrecioBebidas() { // retorna precioBebidas el precio de las bebidas
        return precioBebidas;
    }

    public void addBebida(Bebida bebida) {
        depositoEspecial = bebida;
    }

    public Bebida getBebida() { // Llamado por el boton PULL saca la bebida del deposito
        Bebida aux = depositoEspecial;
        depositoEspecial = null;
        return aux;
    }
}
