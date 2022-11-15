package tarea3;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 * ExpendedorNuevo
 */
public class ExpendedorNuevo {

    // FrontEnd
    private JPanel panelPrincipal;
    private int posX, posY;
    private int cocacolaX, cocacolaY;
    private int fantaX, fantaY;
    private int spriteX, spriteY;

    public void graficaExpendedor(JPanel panelPrincipal) {
        expendedorSetXY(145, 90);
        this.panelPrincipal = panelPrincipal;
        visualizarExpendedora();

    }

    public void expendedorSetXY(int x, int y) {
        posX = x;
        posY = y;
    }

    private void visualizarExpendedora() { // Agrega el panel expendedora
        colocarBotones();
        colocarEtiquetas();
        //llenarCocacola();
        // llenarFanta();
        //llenarSprite();
    }
/*
    private void llenarCocacola() {

        //botellaCocacola = setText(new ImageIcon(this.getClass().getResource("/recursos/cocacola.png")));
        JLabel cocacolaa;
        for (int i = 0; i < numBebidas; i++) { // relleno de maquina con bebidas
            cocacolaa = new JLabel(new ImageIcon(this.getClass().getResource("/recursos/cocacola.png")));
            cocacolaa.setBounds(cocacolaX + 17, cocacolaY + 20 * i, 30, 60);
            this.cocacola.addBebidaLabel(cocacolaa);
            panelPrincipal.add(cocacolaa.mostrarBebida(i));
        }
        for (int i = 0; i < numBebidas; i++) {
            cocacolaa.mostrarBebida(i).setBounds(cocacolaX, cocacolaY, 30, 60);
            panelPrincipal.add(cocacolaa.mostrarBebida(i));
        }

    }
*/
    private void colocarBotones() {

        // ventana 1
        JButton ventana1 = new JButton(new ImageIcon(this.getClass().getResource("/recursos/depositoBebida.png")));
        cocacolaX = posX + 30;
        cocacolaY = posY + 15;
        ventana1.setBounds(cocacolaX, cocacolaY, 70, 400);
        panelPrincipal.add(ventana1);

        // ventana 2
        JButton ventana2 = new JButton(new ImageIcon(this.getClass().getResource("/recursos/depositoBebida.png")));
        fantaX = posX + 110;
        fantaY = posY + 15;
        ventana2.setBounds(fantaX, fantaY, 70, 400);
        panelPrincipal.add(ventana2);

        // ventana 3
        JButton ventana3 = new JButton(new ImageIcon(this.getClass().getResource("/recursos/depositoBebida.png")));
        spriteX = posX + 190;
        spriteY = posY + 15;

        ventana3.setBounds(spriteX, spriteY, 70, 400);
        panelPrincipal.add(ventana3);

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
        JButton botonCocacola = new JButton(new ImageIcon(this.getClass().getResource("/recursos/botonCocacola.jpg"))); // tamaño de imagen ya
        // coincide con tamaño del
        // boton
        botonCocacola.setBounds(posX + 270, posY + 180, 60, 30);
        botonCocacola.setEnabled(true);
        botonCocacola.setBackground(Color.red);
        botonCocacola.setMnemonic('c');
        panelPrincipal.add(botonCocacola);

        // boton fanta
        JButton botonFanta = new JButton(new ImageIcon(this.getClass().getResource("/recursos/botonFanta.jpg"))); // tamaño de imagen ya coincide
        // con tamaño del boton
        botonFanta.setBounds(posX + 270, posY + 220, 60, 30);
        botonFanta.setEnabled(true);
        botonFanta.setBackground(Color.red);
        botonFanta.setMnemonic('f');
        panelPrincipal.add(botonFanta);

        // boton sprite
        JButton botonSprite = new JButton(new ImageIcon(this.getClass().getResource("/recursos/botonSprite.jpg"))); // tamaño de imagen ya
        // coincide con tamaño del
        // boton
        botonSprite.setBounds(posX + 270, posY + 260, 60, 30);
        botonSprite.setEnabled(true);
        botonSprite.setBackground(Color.red);
        botonSprite.setMnemonic('s');
        panelPrincipal.add(botonSprite);

        // boton ranura de monedas
        JButton botonRanura = new JButton(new ImageIcon(this.getClass().getResource("/recursos/botonRanura.jpg"))); // tamaño de imagen ya coincide con tamaño
        // del boton
        botonRanura.setBounds(posX + 270, posY + 300, 30, 30);
        botonRanura.setEnabled(true);
        botonRanura.setBackground(Color.black);
        botonRanura.setMnemonic('r');
        panelPrincipal.add(botonRanura);

        // boton vuelto
        JButton botonVuelto = new JButton(new ImageIcon(this.getClass().getResource("/recursos/botonVuelto.jpg"))); // tamaño de imagen ya coincide con tamaño
        // del boton
        botonVuelto.setBounds(posX + 270, posY + 340, 30, 30);
        botonVuelto.setEnabled(true);
        botonVuelto.setBackground(Color.black);
        botonVuelto.setMnemonic('v');
        panelPrincipal.add(botonVuelto);

        MouseListener oyenteVentana1 = new MouseListener() {
            @Override
            public void mouseEntered(MouseEvent me) {
                panelPrincipal.setComponentZOrder(ventana1, 1);
                panelPrincipal.repaint();
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                panelPrincipal.setComponentZOrder(ventana1, 1);
                panelPrincipal.repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                panelPrincipal.setComponentZOrder(ventana1, 1);
                panelPrincipal.repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                panelPrincipal.setComponentZOrder(ventana1, 1);
                panelPrincipal.repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                panelPrincipal.setComponentZOrder(ventana1, 1);
                panelPrincipal.repaint();
            }
        };

        MouseListener oyenteVentana2 = new MouseListener() {
            @Override
            public void mouseEntered(MouseEvent me) {
                panelPrincipal.setComponentZOrder(ventana1, 1);
                panelPrincipal.repaint();
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                panelPrincipal.setComponentZOrder(ventana1, 1);
                panelPrincipal.repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                panelPrincipal.setComponentZOrder(ventana1, 1);
                panelPrincipal.repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                panelPrincipal.setComponentZOrder(ventana1, 1);
                panelPrincipal.repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                panelPrincipal.setComponentZOrder(ventana1, 1);
                panelPrincipal.repaint();
            }
        };

        MouseListener oyenteVentana3 = new MouseListener() {
            @Override
            public void mouseEntered(MouseEvent me) {
                panelPrincipal.setComponentZOrder(ventana1, 1);
                panelPrincipal.repaint();
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                panelPrincipal.setComponentZOrder(ventana1, 1);
                panelPrincipal.repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                panelPrincipal.setComponentZOrder(ventana1, 1);
                panelPrincipal.repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                panelPrincipal.setComponentZOrder(ventana1, 1);
                panelPrincipal.repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                panelPrincipal.setComponentZOrder(ventana1, 1);
                panelPrincipal.repaint();
            }
        };

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

        ActionListener pulsarPull = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                intentarSacarBebida();
            }
        };

        ActionListener pulsarRanuraMonedas = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {

                if (monedaIngresada == null) {
                    ingresarMoneda();
                    comprador.ingresarMoneda();
                } else {
                    System.out.println("No se puede ingresar otra moneda."); //Posible arreglo con exceptions?? :0
                }
            }
        };

        // Boton Vuelto
        ActionListener pulsarBotonRetorno = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                //panelPrincipal.monedaExpendedora();
                intentarRetornarMoneda();
            }
        };

        ventana1.addMouseListener(oyenteVentana1);
        ventana2.addMouseListener(oyenteVentana2);
        ventana3.addMouseListener(oyenteVentana3);
        botonCocacola.addActionListener(pulsarCocacola);
        botonFanta.addActionListener(pulsarFanta);
        botonSprite.addActionListener(pulsarSprite);
        botonPull.addActionListener(pulsarPull);
        botonRanura.addActionListener(pulsarRanuraMonedas);
        botonVuelto.addActionListener(pulsarBotonRetorno);
    }

    private void colocarEtiquetas() {
        JLabel expendedoraVisible = new JLabel(new ImageIcon(this.getClass().getResource("/recursos/expendedor.jpg")));
        expendedoraVisible.setBounds(posX, posY, 350, 500);
        expendedoraVisible.setLayout(null);
        expendedoraVisible.setBackground(Color.orange);
        panelPrincipal.add(expendedoraVisible);

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
    private Comprador comprador;
    private int numBebidas;

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
        numBebidas = 5;
        // ! Temporal
        for (int i = 0; i < numBebidas; i++) { // relleno de maquina con bebidas
            Bebida cocacolaa = new CocaCola(100 + i);
            this.cocacola.addBebida(cocacolaa);
            Bebida spritee = new Sprite(200 + i);
            this.sprite.addBebida(spritee);
            Bebida fantaa = new Fanta(300 + i);
            this.fanta.addBebida(fantaa);
        }
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
                        System.out.print("COCACOLA: ");
                        System.out.println(cocacola.getSize());
                        if (bebida != null) {
                            calcularVuelto(moneda);
                            depositoMonedasCompras.add(moneda);
                            pasarDeposito(bebida);
                        } else {
                            vueltoTotal.add(moneda);
                            throw new NoHayBebidaException("No hay bebida disponible."); // NoHayBebidaException
                        }
                        break;
                    case 2:
                        bebida = sprite.getBebida();
                        System.out.print("SPRITE: ");
                        System.out.println(sprite.getSize());
                        if (bebida != null) {
                            calcularVuelto(moneda);
                            depositoMonedasCompras.add(moneda);
                            pasarDeposito(bebida);
                        } else {
                            vueltoTotal.add(moneda);
                            throw new NoHayBebidaException("No hay bebida disponible."); // NoHayBebidaException
                        }
                        break;

                    case 3:
                        bebida = fanta.getBebida();
                        System.out.print("FANTA: ");
                        System.out.println(fanta.getSize());
                        if (bebida != null) {
                            calcularVuelto(moneda);
                            depositoMonedasCompras.add(moneda);
                            pasarDeposito(bebida);
                        } else {
                            vueltoTotal.add(moneda);
                            throw new NoHayBebidaException("No hay bebida disponible."); // NoHayBebidaException
                        }
                        break;

                    default: // caso numero erroneo
                        vueltoTotal.add(moneda);
                        System.out.println("ay");
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

    public Moneda retornarMoneda() throws NoHayMonedaRetorno { // Metodo Retorno de moneda en depositoRetorno
        depositoRetorno = monedaIngresada;

        if (depositoRetorno != null) {
            Moneda aux = depositoRetorno;
            depositoRetorno = null;
            monedaIngresada = null;
            return aux;
        } else {
            throw new NoHayMonedaRetorno();
        }
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

    public void getBebida() throws NoHayBebidaDeposito { // Llamado por el boton PULL saca la bebida del deposito
        if (depositoEspecial != null) {
            asignarBebida();
            depositoEspecial = null;
        } else {
            throw new NoHayBebidaDeposito();
        }
    }

    public void intentarSacarBebida() {
        try {
            getBebida();
        } catch (NoHayBebidaDeposito e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

    }

    public Moneda intentarRetornarMoneda() {
        try {
            Moneda aux = retornarMoneda(); //metodo retornar moneda deposito
            System.out.println("Moneda retornada. " + aux);
            return aux;
        } catch (NoHayMonedaRetorno e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
            return null;
        }
    }

    private void pasarDeposito(Bebida bebida) {
        depositoEspecial = bebida;
    }

    private void asignarBebida() {
        comprador.setBebida(depositoEspecial);
    }

    private void ingresarMoneda() {
        monedaIngresada = comprador.getMoneda();
        System.out.println("Ingresaste una moneda. " + monedaIngresada);
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }
}
