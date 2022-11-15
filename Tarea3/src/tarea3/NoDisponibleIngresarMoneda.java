package tarea3;

public class NoDisponibleIngresarMoneda extends Exception {
    public NoDisponibleIngresarMoneda() {
        super("No se puede ingresar otra moneda.");
    }
}
