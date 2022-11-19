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

    // BackEnd
    public DepositoBebida() {
        deposito = new ArrayList<Bebida>();
        depositoVisual = new ArrayList<JLabel>();
    }

    public void addBebida(Bebida bebida) {
        deposito.add(bebida);
    }

    public Bebida getBebida() {
        if (deposito.isEmpty()) {
            return null;
        } else {
            Bebida bebida = deposito.get(0);
            deposito.remove(0);
            return bebida;
        }
    }

    public int getSize() {
        return deposito.size();
    }

    public boolean tieneBebidas() {
        if (deposito.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    // FrontEnd
    public void addBebidaLabel(JLabel bebidaLabel) {
        depositoVisual.add(bebidaLabel);
    }

    public JLabel getBebidaLabel() {
        if (depositoVisual.isEmpty()) {
            return null;
        } else {
            JLabel bebida = depositoVisual.get(0);
            depositoVisual.remove(0);
            return bebida;
        }
    }

    public JLabel seeBebidaLabel(int i) {
        return depositoVisual.get(i);
    }

    public int getSerieOf(int i) {
        return deposito.get(i).getSerie();
    }
}
