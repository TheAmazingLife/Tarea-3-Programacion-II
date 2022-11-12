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

public class DepositoVuelto {

    private ArrayList<Moneda> deposito;

    public DepositoVuelto() {
        deposito = new ArrayList<Moneda>();
    }

    public void add(Moneda vuelto) {
        deposito.add(vuelto);
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
