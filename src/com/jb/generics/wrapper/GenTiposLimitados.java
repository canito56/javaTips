package com.jb.generics.wrapper;

// Tipos limitados (bounded types)
// La clase puede recibir m�s de un par�metro, por ejemplo lo siguiente:
// class GenTiposLimitados <T extends Number, V extends T> { }
class GenTiposLimitados<T extends Number> {
    // En este caso, el argumento de tipo debe ser Number o una subclase en Number.
    T num;

    // Pase al constructor una referencia a un objeto num�rico.
    GenTiposLimitados( T num) {
        this.num = num;
    }

    // Devuelve el rec�proco
    double reciproco() {
        return 1 / num.doubleValue();
    }

    // Devuelve parte fraccionaria
    double fraccion() {
        return num.doubleValue() - num.intValue();
    }
}