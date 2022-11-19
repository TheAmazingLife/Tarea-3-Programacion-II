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

    // BackEnd
    public void add(Moneda vuelto) {
        deposito.add(vuelto);
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

    // FrontEnd
    public void addMonedaLabel(JLabel monedaLabel) { // agrega bebida al ArrayList<Bebida> deposito
        depositoVisual.add(monedaLabel);
    }

    public JLabel seeMonedaLabel(int i) {
        return depositoVisual.get(i);
    }

    public JLabel getMonedaLabel() {
        if (depositoVisual.isEmpty()) {
            return null;
        } else {
            JLabel moneda = depositoVisual.get(0);
            depositoVisual.remove(0);
            return moneda;
        }
    }
}
