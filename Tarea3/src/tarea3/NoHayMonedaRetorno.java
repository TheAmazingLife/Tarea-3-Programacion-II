package tarea3;

public class NoHayMonedaRetorno extends Exception {
    public NoHayMonedaRetorno() {
        super("No hay moneda que retornar");
    }
}
