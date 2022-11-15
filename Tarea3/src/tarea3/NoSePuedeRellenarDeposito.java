package tarea3;

public class NoSePuedeRellenarDeposito extends Exception{
    public NoSePuedeRellenarDeposito() {
        super("No se puede rellenar el deposito, aun tiene bebidas");
    }
}
