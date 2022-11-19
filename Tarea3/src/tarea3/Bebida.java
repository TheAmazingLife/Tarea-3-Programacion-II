package tarea3;

// Resumen
// clase abstracta `Bebida` extiende Sprite, CocaCola, Fanta
// constructores Sprite(int serie), CocaCola(int serie), Fanta(int serie)
// Atributos
// - int serie 
// Metodos
// - getSerie() retorna el numero de serie de la bebida
// - beber() abstracto retorna el sabor de la bebida
abstract class Bebida {

    private int serie;

    public Bebida(int serie) {
        this.serie = serie;
    }

    public int getSerie() { // retorna el numero de serie de la bebida
        return serie;
    }

}

class CocaCola extends Bebida {

    public CocaCola(int serie) {
        super(serie);
    }
}

class Sprite extends Bebida {

    public Sprite(int serie) {
        super(serie);
    }
}

class Fanta extends Bebida {

    public Fanta(int serie) {
        super(serie);
    }
}
