package tarea3;

abstract class Moneda {

    public Moneda() {
    }

    public abstract int getValor();
}

class Moneda1000 extends Moneda {

    public Moneda1000() {
    }

    public int getValor() {
        return 1000;
    }
}

class Moneda500 extends Moneda {

    public Moneda500() {
    }

    public int getValor() {
        return 500;
    }
}

class Moneda100 extends Moneda {

    public Moneda100() {
    }

    public int getValor() {
        return 100;
    }
}
