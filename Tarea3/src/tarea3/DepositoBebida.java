package tarea3;

// Resumen
// clase `DepositoBebida`
// Constructor DepositoBebida()
// Atributos
// - ArrayList<Bebida> deposito
// Metodos:
// - addBebida(Bebida bebida) agrega bebida al ArrayList<Bebida> deposito
// - getBebida() devuelve una bebida en caso de que hayan en el deposito, en caso contrario retorna `null`
import java.util.ArrayList;
import javax.swing.*;

public class DepositoBebida {

    private ArrayList<Bebida> deposito;
    private ArrayList<JLabel> depositoVisual;

    public DepositoBebida() {
        deposito = new ArrayList<Bebida>();
        depositoVisual = new ArrayList<JLabel>();
    }

    public void addBebida(Bebida bebida) { // agrega bebida al ArrayList<Bebida> deposito
        deposito.add(bebida);
    }

    public void addBebidaLabel(JLabel bebidaLabel) { // agrega bebida al ArrayList<Bebida> deposito
        depositoVisual.add(bebidaLabel);
    }

    public Bebida getBebida() { // devuelve una bebida en caso de que hayan en el deposito, en caso contrario retorna `null`
        if (deposito.isEmpty()) {
            return null;
        } else {
            Bebida bebida = deposito.get(0);
            deposito.remove(0);
            return bebida;
        }
    }

    public JLabel getBebidaLabel() {
        System.out.println("Cambio en BEBIDAS: " + depositoVisual.size());
        if (depositoVisual.isEmpty()) {
            return null;
        } else {
            JLabel bebida = depositoVisual.get(0);
            depositoVisual.remove(0);
            return bebida;
        }
    }

    public int getSize() {
        return deposito.size();
    }

    public JLabel seeBebidaLabel(int i) {
        return depositoVisual.get(i);
    }

    public int getSerieOf(int i) {
        return deposito.get(i).getSerie();
    }

}
