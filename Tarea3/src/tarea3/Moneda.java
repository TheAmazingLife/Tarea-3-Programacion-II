package tarea3;

// Resumen
// clase abstracta `Moneda` extiende Moneda100, Moneda500, Moneda1000, Moneda1500
// Constructor Moneda()
// Atributos
// Las monedas no tienen propiedades, no las necesitan
// Metodos:
// - getSerie() devuelve el numero de serie en valor de ubicacion en memoria ram
// - toString() imprime el valor de la moneda y la direccion de memoria ram
// - getValor() devuelve el valor de la moneda en int.

abstract class Moneda {

    public Moneda() {
    }

    public String getSerie() { // retorna su dirección en RAM como número de serie
        return "" + this.hashCode();
    }

    public String toString() { // imprime el valor de la moneda y la direccion de memoria ram
        return "Valor de la moneda " + getValor() + " Nro. de serie: " + getSerie();
    }

    public abstract int getValor(); // retorna la cantidad que vale la moneda
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
