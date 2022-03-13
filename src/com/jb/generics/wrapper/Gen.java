package com.jb.generics.wrapper;

/*
Una simple clase gen�rica.
Aqu�, T es un par�metro de tipo que ser� reemplazado por un tipo real
cuando se crea un objeto de tipo Gen. 
*/
public class Gen<T> {
    // T es el par�metro de tipo gen�rico.
    T ob; //Declara un objeto de tipo T

    // Pase al constructor una referencia a un objeto de tipo T. 
    // El argumento pasado no puede ser de tipo primitivo. Pero se puede usar un envoltorio (wrapper) para
    // encapsular un tipo primitivo, el autoboxing y el auto-unboxing hacen esto automaticamente.
    Gen(T ob) {
        this.ob = ob;
    }

    T getOb() {
        return ob;
    }

    // Muestra el tipo de T
    void mostrarTipo() {
        System.out.println("El tipo de T es: " + ob.getClass().getName());
    }
}
