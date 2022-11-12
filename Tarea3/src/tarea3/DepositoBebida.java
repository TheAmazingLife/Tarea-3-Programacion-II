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

public class DepositoBebida {

    private ArrayList<Bebida> deposito;

    public DepositoBebida() {
        deposito = new ArrayList<Bebida>();
    }

    public void addBebida(Bebida bebida) { // agrega bebida al ArrayList<Bebida> deposito
        deposito.add(bebida);
    }

    public Bebida getBebida() { // devuelve una bebida en caso de que hayan en el deposito, en caso contrario
                                // retorna `null`
        if (deposito.isEmpty()) {
            return null;
        } else {
            Bebida bebida = deposito.get(0);
            deposito.remove(0);
            return bebida;
        }
    }
}