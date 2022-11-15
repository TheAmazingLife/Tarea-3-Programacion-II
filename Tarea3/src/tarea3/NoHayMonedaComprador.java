package tarea3;

public class NoHayMonedaComprador extends Exception {
    public NoHayMonedaComprador() {
        super("No tienes una moneda que ingresar");
    }
}
