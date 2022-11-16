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
    private int posXdepositoVueltoLabel, posYdepositoVueltoLabel;

    public void graficaExpendedor(JPanel panelPrincipal) {
        expendedorSetXY(145, 90);
        posXdepositoVueltoLabel = 0;
        posYdepositoVueltoLabel = 0;
        depositoVueltoLabelSetXY(posX, posY);
        this.panelPrincipal = panelPrincipal;
        visualizarExpendedora();
    }

    private void expendedorSetXY(int x, int y) {
        posX = x;
        posY = y;
    }

    private void depositoVueltoLabelSetXY(int x, int y) {
        posXdepositoVueltoLabel += x;
        posYdepositoVueltoLabel += y;
    }

    private void visualizarExpendedora() { // Agrega el panel expendedora
        mostrarDepositoVuelto();
        colocarBotones();
        colocarEtiquetas();
        mostrarBebidas();
    }

    private void mostrarDepositoVuelto() {
        JLabel depositoVueltoLabel = new JLabel(new ImageIcon(this.getClass().getResource("/recursos/depositoVueltoExpendedora.png")));
        depositoVueltoLabelSetXY(270, 340);
        depositoVueltoLabel.setBounds(posXdepositoVueltoLabel, posYdepositoVueltoLabel, 60, 60);
        panelPrincipal.add(depositoVueltoLabel);
        panelPrincipal.setComponentZOrder(depositoVueltoLabel, 0);
        panelPrincipal.repaint();
    }

    private void llenarCocacola() {
        JLabel cocacolaLabel;
        for (int i = 0; i < numBebidas; i++) { // relleno de maquina con bebidas
            cocacolaLabel = new JLabel(String.valueOf(cocacola.getSerieOf(i)));
            cocacolaLabel.setOpaque(true);
            cocacolaLabel.setBackground(Color.red);
            cocacola.addBebidaLabel(cocacolaLabel);
        }
    }

    private void llenarSprite() {
        JLabel spriteLabel;
        for (int i = 0; i < numBebidas; i++) { // relleno de maquina con bebidas
            spriteLabel = new JLabel(String.valueOf(sprite.getSerieOf(i)));
            spriteLabel.setOpaque(true);
            spriteLabel.setBackground(Color.green);
            sprite.addBebidaLabel(spriteLabel);
        }
    }

    private void llenarFanta() {
        JLabel fantaLabel;
        for (int i = 0; i < numBebidas; i++) { // relleno de maquina con bebidas
            fantaLabel = new JLabel(String.valueOf(fanta.getSerieOf(i)));
            fantaLabel.setOpaque(true);
            fantaLabel.setBackground(Color.orange);
            fanta.addBebidaLabel(fantaLabel);
        }
    }

    private void mostrarBebidas() {
        JLabel auxLabel;
        // muestra cocacola

        for (int i = 0; i < cocacola.getSize(); i++) { // relleno de maquina con bebidas
            auxLabel = cocacola.seeBebidaLabel(i);
            //auxLabel.setBounds(cocacolaX + 20, cocacolaY + 30 + 70 * i, 30, 60); // serie menor  a mayor
            auxLabel.setBounds(cocacolaX + 20, cocacolaY + 310 - 70 * i, 30, 60);  // serie mayor a menor
            panelPrincipal.add(auxLabel);
            panelPrincipal.setComponentZOrder(auxLabel, 0);
            panelPrincipal.repaint();
        }

        // muestra sprite
        for (int i = 0; i < sprite.getSize(); i++) { // relleno de maquina con bebidas
            auxLabel = sprite.seeBebidaLabel(i);
            //auxLabel.setBounds(spriteX + 20, spriteY + 30 + 70 * i, 30, 60); // serie menor  a mayor
            auxLabel.setBounds(spriteX + 20, spriteY + 310 - 70 * i, 30, 60);  // serie mayor a menor
            panelPrincipal.add(auxLabel);
            panelPrincipal.setComponentZOrder(auxLabel, 0);
            panelPrincipal.repaint();
        }

        // muestra fanta
        for (int i = 0; i < fanta.getSize(); i++) { // relleno de maquina con bebidas
            auxLabel = fanta.seeBebidaLabel(i);
            //auxLabel.setBounds(fantaX + 20, fantaY + 30 + 70 * i, 30, 60); // serie menor  a mayor
            auxLabel.setBounds(fantaX + 20, fantaY + 310 - 70 * i, 30, 60);  // serie mayor a menor
            panelPrincipal.add(auxLabel);
            panelPrincipal.setComponentZOrder(auxLabel, 0);
            panelPrincipal.repaint();
        }
    }

    private void colocarBotones() {

        // ventana 1
        JButton ventana1 = new JButton(new ImageIcon(this.getClass().getResource("/recursos/depositoBebida.png")));
        cocacolaX = posX + 30;
        cocacolaY = posY + 15;
        ventana1.setBounds(cocacolaX, cocacolaY, 70, 400);
        panelPrincipal.add(ventana1);

        // ventana 2
        JButton ventana2 = new JButton(new ImageIcon(this.getClass().getResource("/recursos/depositoBebida.png")));
        spriteX = posX + 110;
        spriteY = posY + 15;

        ventana2.setBounds(spriteX, spriteY, 70, 400);
        panelPrincipal.add(ventana2);

        // ventana 3
        JButton ventana3 = new JButton(new ImageIcon(this.getClass().getResource("/recursos/depositoBebida.png")));
        fantaX = posX + 190;
        fantaY = posY + 15;

        ventana3.setBounds(fantaX, fantaY, 70, 400);
        panelPrincipal.add(ventana3);

        // boton cocacola
        JButton botonCocacola = new JButton(new ImageIcon(this.getClass().getResource("/recursos/botonCocacola.jpg"))); // tamaño de imagen ya coincide con tamaño del boton
        int botonCocacolaX = posX + 270;
        int botonCocacolaY = posY + 140;

        botonCocacola.setBounds(botonCocacolaX, botonCocacolaY, 60, 30);
        botonCocacola.setEnabled(true);
        botonCocacola.setBackground(Color.red);
        botonCocacola.setMnemonic('c');
        panelPrincipal.add(botonCocacola);

        // boton sprite
        JButton botonSprite = new JButton(new ImageIcon(this.getClass().getResource("/recursos/botonSprite.jpg"))); // tamaño de imagen ya coincide con tamaño del boton
        int botonSpriteX = posX + 270;
        int botonSpriteY = posY + 180;

        botonSprite.setBounds(botonSpriteX, botonSpriteY, 60, 30);
        botonSprite.setEnabled(true);
        botonSprite.setBackground(Color.red);
        botonSprite.setMnemonic('s');
        panelPrincipal.add(botonSprite);

        // boton fanta
        JButton botonFanta = new JButton(new ImageIcon(this.getClass().getResource("/recursos/botonFanta.jpg"))); // tamaño de imagen ya coincide con tamaño del boton
        int botonFantaX = posX + 270;
        int botonFantaY = posY + 220;

        botonFanta.setBounds(botonFantaX, botonFantaY, 60, 30);
        botonFanta.setEnabled(true);
        botonFanta.setBackground(Color.red);
        botonFanta.setMnemonic('f');
        panelPrincipal.add(botonFanta);

        // boton ranura de monedas
        JButton botonRanura = new JButton(new ImageIcon(this.getClass().getResource("/recursos/botonRanura.jpg"))); // tamaño de imagen ya coincide con tamaño del boton
        botonRanura.setBounds(posX + 270, posY + 260, 30, 30);
        botonRanura.setEnabled(true);
        botonRanura.setBackground(Color.black);
        botonRanura.setMnemonic('i');
        panelPrincipal.add(botonRanura);

        // boton retorno
        JButton botonRetorno = new JButton(new ImageIcon(this.getClass().getResource("/recursos/botonRetorno.png"))); // tamaño de imagen ya coincide con tamaño de boton
        botonRetorno.setBounds(posX + 270, posY + 300, 30, 30);
        botonRetorno.setEnabled(true);
        botonRetorno.setMnemonic('r');
        panelPrincipal.add(botonRetorno);

        // boton vuelto
        JButton botonVuelto = new JButton(new ImageIcon(this.getClass().getResource("/recursos/botonVuelto.png")));
        botonVuelto.setBounds(posXdepositoVueltoLabel + 30, posYdepositoVueltoLabel + 70, 30, 30);
        botonVuelto.setForeground(Color.white);
        botonVuelto.setBackground(Color.black);
        botonVuelto.setFont(new Font("arial", 1, 5));
        botonVuelto.setEnabled(true);
        botonVuelto.setMnemonic('v');
        panelPrincipal.add(botonVuelto);

        // Boton PULL
        JButton botonPull = new JButton("PULL");
        botonPull.setBounds(posX + 30, posY + 430, 230, 50);
        botonPull.setForeground(Color.white);
        botonPull.setBackground(Color.black);
        botonPull.setFont(new Font("arial", 1, 20));
        botonPull.setEnabled(true); // si es false, el boton esta "apagado"
        botonPull.setMnemonic('p'); // la tecla funciona con alt + letra
        panelPrincipal.add(botonPull);

        MouseListener oyenteVentana1 = new MouseListener() {
            @Override
            public void mouseEntered(MouseEvent me) {
                mostrarBebidas();
                panelPrincipal.repaint();
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                intentarRellenarDeposito(1);
                mostrarBebidas();
                panelPrincipal.repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                mostrarBebidas();
                panelPrincipal.repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                mostrarBebidas();
                panelPrincipal.repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                mostrarBebidas();
                panelPrincipal.repaint();
            }
        };

        MouseListener oyenteVentana2 = new MouseListener() {
            @Override
            public void mouseEntered(MouseEvent me) {
                mostrarBebidas();
                panelPrincipal.repaint();
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                intentarRellenarDeposito(2);
                mostrarBebidas();
                panelPrincipal.repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                mostrarBebidas();
                panelPrincipal.repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                mostrarBebidas();
                panelPrincipal.repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                mostrarBebidas();
                panelPrincipal.repaint();
            }
        };

        MouseListener oyenteVentana3 = new MouseListener() {
            @Override
            public void mouseEntered(MouseEvent me) {
                mostrarBebidas();
                panelPrincipal.repaint();
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                intentarRellenarDeposito(3);
                mostrarBebidas();
                panelPrincipal.repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                mostrarBebidas();
                panelPrincipal.repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                mostrarBebidas();
                panelPrincipal.repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                mostrarBebidas();
                panelPrincipal.repaint();
            }
        };

        ActionListener pulsarCocacola = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                intentarCompra(1);
            }
        };

        ActionListener pulsarSprite = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                intentarCompra(2);
            }
        };

        ActionListener pulsarFanta = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                intentarCompra(3);
            }
        };

        ActionListener pulsarPull = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                intentarSacarBebida();
                comprador.mostrarBebidas();
                panelPrincipal.repaint();
            }
        };

        ActionListener pulsarRanuraMonedas = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                // en caso de que no hayan monedas en el deposito, la ingresa
                intentarIngresarMoneda();
            }
        };

        // Boton Retorno
        ActionListener pulsarBotonRetorno = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                intentarRetornarMoneda();
                mostrarVuelto();
                panelPrincipal.repaint();
            }
        };

        // Boton Vuelto
        ActionListener pulsarBotonVuelto = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                intentarSacarVuelto();
                mostrarVuelto();
                comprador.mostrarVuelto();
                panelPrincipal.repaint();
            }
        };

        ventana1.addMouseListener(oyenteVentana1);
        ventana2.addMouseListener(oyenteVentana2);
        ventana3.addMouseListener(oyenteVentana3);
        botonCocacola.addActionListener(pulsarCocacola);
        botonSprite.addActionListener(pulsarSprite);
        botonFanta.addActionListener(pulsarFanta);
        botonPull.addActionListener(pulsarPull);
        botonRanura.addActionListener(pulsarRanuraMonedas);
        botonRetorno.addActionListener(pulsarBotonRetorno);
        botonVuelto.addActionListener(pulsarBotonVuelto);
    }

    private void colocarEtiquetas() {
        JLabel expendedoraVisible = new JLabel(new ImageIcon(this.getClass().getResource("/recursos/expendedor.jpg")));
        expendedoraVisible.setBounds(posX, posY, 350, 500);
        expendedoraVisible.setLayout(null);
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
    private JLabel depositoEspecialLabel;
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
        depositoEspecialLabel = null;
        monedaIngresada = null;
        depositoRetorno = null;
        // ! Temporal
        this.precioBebidas = 800; // Definir precio
        numBebidas = 5;
        // ! Temporal
        intentarRellenarDeposito(1);
        intentarRellenarDeposito(2);
        intentarRellenarDeposito(3);
    }

    public void intentarCompra(int cualBebida) {
        try {
            // Intenta comprar la bebida e imprime si se realizo con exito
            comprarBebida(cualBebida);
            monedaIngresada = null;
            System.out.println("Compra Realizada con exito.");
        } catch (PagoIncorrectoException | PagoInsuficienteException | NoHayBebidaException | DepositoEspecialLlenoException e) {
            /* depositoRetorno = monedaIngresada;
            monedaIngresada = null; */
            System.out.println(e.getMessage());
        }
    }

    public void comprarBebida(int cual) throws PagoIncorrectoException, NoHayBebidaException, PagoInsuficienteException, DepositoEspecialLlenoException { // compra la bebida,
        // retorna excepciones en caso de fallas
        Bebida bebida = null;
        if (monedaIngresada == null) {
            throw new PagoIncorrectoException("No se puede comprar una bebida sin dinero."); // PagoIncorrectoException
        } else {
            if (depositoEspecial != null) {
                throw new DepositoEspecialLlenoException("Ya hay una bebida en el deposito."); // DepositoEspecialLlenoException
            } else {
                if (monedaIngresada.getValor() >= precioBebidas) {
                    // en caso de no haber bebidas o numero erroneo NoHayBebidaException y devuelve
                    // la monedaIngresada al deposito
                    switch (cual) {
                        case 1:
                            bebida = cocacola.getBebida();
                            if (bebida != null) {
                                JLabel bebida1 = cocacola.getBebidaLabel();
                                pasarDeposito(bebida);
                                pasarDepositoLabel(bebida1);
                                panelPrincipal.remove(bebida1);
                                calcularVuelto(); // calcula vuelto en monedas de 100
                                mostrarVuelto();
                                depositoMonedasCompras.add(monedaIngresada); //deposita la moneda en las monedas usadas
                                monedaIngresada = null; // la monedaIngresada fue gastada 
                            } else {
                                // ! ya no se devuelve al vuelto si no que se queda la monedaIngresada retenida
                                // ! BORRADO vueltoTotal.add(monedaIngresada);
                                throw new NoHayBebidaException("No hay bebida disponible."); // NoHayBebidaException
                            }
                            break;
                        case 2:
                            bebida = sprite.getBebida();
                            if (bebida != null) {
                                JLabel bebida2 = sprite.getBebidaLabel();
                                pasarDeposito(bebida);
                                pasarDepositoLabel(bebida2);
                                panelPrincipal.remove(bebida2);
                                calcularVuelto();
                                mostrarVuelto();
                                depositoMonedasCompras.add(monedaIngresada);
                                monedaIngresada = null; // la monedaIngresada fue gastada
                            } else {
                                // ! ya no se devuelve al vuelto si no que se queda la monedaIngresada retenida
                                // ! BORRADO vueltoTotal.add(monedaIngresada);
                                throw new NoHayBebidaException("No hay bebida disponible."); // NoHayBebidaException
                            }
                            break;
                        case 3:
                            bebida = fanta.getBebida();
                            if (bebida != null) {
                                JLabel bebida3 = fanta.getBebidaLabel();
                                pasarDeposito(bebida);
                                pasarDepositoLabel(bebida3);
                                panelPrincipal.remove(bebida3);
                                calcularVuelto();
                                mostrarVuelto();
                                depositoMonedasCompras.add(monedaIngresada);
                                monedaIngresada = null; // la moneda Ingresada fue gastada
                            } else {
                                // ! ya no se devuelve al vuelto si no que se queda la monedaIngresada retenida
                                // ! BORRADO vueltoTotal.add(monedaIngresada);
                                throw new NoHayBebidaException("No hay bebida disponible."); // NoHayBebidaException
                            }
                    }
                } else {
                    throw new PagoIncorrectoException("Saldo insuficiente."); // PagoInsuficienteException
                }
            }
        }
        mostrarBebidas();
        panelPrincipal.repaint();
    }
    // TODO: arreglar sacar bebida, imprime error inmenso :c

    public void intentarSacarBebida() {
        try {
            getBebida();
        } catch (NoHayBebidaDeposito e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

    }

    public void getBebida() throws NoHayBebidaDeposito { // Llamado por el boton PULL saca la bebida del deposito
        if (depositoEspecial != null) {
            asignarBebida();
            System.out.println("Bebida sacada: " + depositoEspecial);
            depositoEspecial = null;
        } else {
            throw new NoHayBebidaDeposito();
        }
    }

    // MONEDA A RETORNAR en caso de no compra
    public void intentarRetornarMoneda() {
        try {
            Moneda aux = retornarMoneda(); //metodo retornar moneda Ingresada deposito
            JLabel monedaAux = identificarMonedaLabel(aux);
            //comprador.setVuelto(aux);
            vueltoTotal.add(aux);
            vueltoTotal.addMonedaLabel(monedaAux);
        } catch (NoHayMonedaRetorno e) {
            System.out.println(e.getMessage());
        }
    }

    public Moneda retornarMoneda() throws NoHayMonedaRetorno { // Metodo Retorno de moneda en depositoRetorno
        depositoRetorno = monedaIngresada;
        Moneda aux = null;
        if (depositoRetorno != null) {
            aux = depositoRetorno;
            depositoRetorno = null;
            monedaIngresada = null;
            return aux;
        } else {
            throw new NoHayMonedaRetorno();
        }
    }

    public JLabel identificarMonedaLabel(Moneda moneda) {
        String aux = "" + moneda.getClass();
        JLabel monedaVisual = null;
        switch (aux) {
            case "class tarea3.Moneda100":
                monedaVisual = new JLabel(new ImageIcon(this.getClass().getResource("/recursos/moneda100Vuelto.png")));
                break;
            case "class tarea3.Moneda500":
                monedaVisual = new JLabel(new ImageIcon(this.getClass().getResource("/recursos/moneda500Vuelto.png")));
                break;
            case "class tarea3.Moneda1000":
                monedaVisual = new JLabel(new ImageIcon(this.getClass().getResource("/recursos/moneda1000Vuelto.png")));
                break;
        }
        return monedaVisual;
    }

    // VUELTO
    private void intentarSacarVuelto() {
        try {
            Moneda aux = sacarVuelto();
            JLabel monedaAux = identificarMonedaLabel(aux);
            JLabel monedaAuxVisual = vueltoTotal.getMonedaLabel();
            panelPrincipal.remove(monedaAuxVisual);
            comprador.setVuelto(aux);
            comprador.setVueltoLabel(monedaAux);
        } catch (NoHayVuelto e) {
            System.out.println(e.getMessage());
        }
    }

    private Moneda sacarVuelto() throws NoHayVuelto { // Metodo Retorno de moneda en depositoRetorno
        if (vueltoTotal.getSize() != 0) {
            return getVuelto();
        } else {
            throw new NoHayVuelto();
        }
    }

    private void calcularVuelto() { // calcula vuelto y lo devuelve al DepositoVuelto vueltoTotal en monedas de 100
        int monedas100 = (monedaIngresada.getValor() - precioBebidas) / 100;
        for (int i = 0; i < monedas100; i++) {
            Moneda monedaVuelto = new Moneda100();
            JLabel monedaVueltoLabel = new JLabel(new ImageIcon(this.getClass().getResource("/recursos/moneda100Vuelto.png")));
            vueltoTotal.add(monedaVuelto);
            vueltoTotal.addMonedaLabel(monedaVueltoLabel);

        }
    }

    private Moneda getVuelto() { // devuelve UNA moneda del deposito en caso de que este vacio retorna null
        return vueltoTotal.getVuelto(); // se rescatan una a una
    }

    private void mostrarVuelto() {
        JLabel auxLabel = null;
        int aux1 = 0;
        int aux2 = 0;

        for (int i = 0; i < vueltoTotal.getSize(); i++) {
            auxLabel = vueltoTotal.seeMonedaLabel(i);
            if (i < 3) {
                auxLabel.setBounds(posXdepositoVueltoLabel, posYdepositoVueltoLabel + 20 * i, 20, 20);
            } else if (i < 6) {
                auxLabel.setBounds(posXdepositoVueltoLabel + 20, posYdepositoVueltoLabel + 20 * aux1, 20, 20);
                aux1++;
            } else {
                auxLabel.setBounds(posXdepositoVueltoLabel + 40, posYdepositoVueltoLabel + 20 * aux2, 20, 20);
                aux2++;
            }
            panelPrincipal.add(auxLabel);
            panelPrincipal.setComponentZOrder(auxLabel, 0);
            panelPrincipal.repaint();
        }
    }

    private void intentarIngresarMoneda() {
        try {
            ingresarMoneda();
        } catch (NoDisponibleIngresarMoneda | NoHayMonedaComprador e) {
            System.out.println(e.getMessage());
        }
    }

    private void ingresarMoneda() throws NoDisponibleIngresarMoneda, NoHayMonedaComprador {
        Moneda monedaComprador = comprador.getMoneda();
        if (monedaComprador != null) { // En caso de que el comprador tenga moneda en la mano
            if (monedaIngresada == null) { // Y si no hay monedaIngresada, ingresa la moneda
                monedaIngresada = monedaComprador;
                System.out.println("Ingresaste una moneda. " + monedaIngresada);
                comprador.ingresarMoneda(); // Acualiza Frame de la mano del comprador
            } else {
                comprador.addMoneda(monedaComprador); //Le retorna la moneda al comprador en caso de no ingresarse
                throw new NoDisponibleIngresarMoneda();
            }
        } else {
            throw new NoHayMonedaComprador();
        }
    }

    public int getPrecioBebidas() { // retorna precioBebidas el precio de las bebidas
        return precioBebidas;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    private void pasarDeposito(Bebida bebida) {
        depositoEspecial = bebida;
    }

    private void pasarDepositoLabel(JLabel bebida) {
        depositoEspecialLabel = bebida;
        comprador.setBebidaLabel(depositoEspecialLabel);
    }

    private void asignarBebida() {
        comprador.setBebida(depositoEspecial);
    }

    private void intentarRellenarDeposito(int cualDeposito) {
        try {
            rellenarDeposito(cualDeposito);
        } catch (NoSePuedeRellenarDeposito e) {
            System.out.println(e.getMessage());
        }
    }

    private void rellenarDeposito(int cualDeposito) throws NoSePuedeRellenarDeposito {
        switch (cualDeposito) {
            case 1:
                if (cocacola.tieneBebidas() != true) {
                    for (int i = 0; i < numBebidas; i++) {
                        Bebida cocacolaa = new CocaCola(100 + i);
                        this.cocacola.addBebida(cocacolaa);
                    }
                    llenarCocacola();

                } else {
                    throw new NoSePuedeRellenarDeposito();
                }
                break;
            case 2:
                if (sprite.tieneBebidas() != true) {
                    for (int i = 0; i < numBebidas; i++) {
                        Bebida spritee = new Sprite(200 + i);
                        this.sprite.addBebida(spritee);
                    }
                    llenarSprite();
                } else {
                    throw new NoSePuedeRellenarDeposito();
                }
                break;
            case 3:
                if (fanta.tieneBebidas() != true) {
                    for (int i = 0; i < numBebidas; i++) { // relleno de maquina con bebidas
                        Bebida fantaa = new Fanta(300 + i);
                        this.fanta.addBebida(fantaa);
                    }
                    llenarFanta();
                } else {
                    throw new NoSePuedeRellenarDeposito();
                }
                break;
        }
    }
}
