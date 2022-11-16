package tarea3;

// Resumen
// clase `DepositoVuelto`
// Constructor DepositoVuelto()
// Atributos
// - ArrayList<Moneda> deposito
// Metodos:
// - add(Moneda vuelto) agrega moneda al ArrayList<Moneda> deposito
// - getVuelto() devuelve una moneda en caso de que hayan en el deposito, en caso contrario retorna `null`
import java.util.ArrayList;
import javax.swing.*;

public class DepositoVuelto {

    private ArrayList<Moneda> deposito;
    private ArrayList<JLabel> depositoVisual;

    public DepositoVuelto() {
        deposito = new ArrayList<Moneda>();
        depositoVisual = new ArrayList<JLabel>();
    }

    public void add(Moneda vuelto) {
        deposito.add(vuelto);
    }

    public void addMonedaLabel(JLabel bebidaLabel) { // agrega bebida al ArrayList<Bebida> deposito
        depositoVisual.add(bebidaLabel);
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

    public JLabel seeMonedaLabel(int i) {
        return depositoVisual.get(i);
    }

    public int getSize() {
        return deposito.size();
    }

    public Moneda getVuelto() {
        if (deposito.isEmpty()) {
            return null;
        } else {
            Moneda vuelto = deposito.get(0);
            deposito.remove(0);
            return vuelto;
        }
    }
}
