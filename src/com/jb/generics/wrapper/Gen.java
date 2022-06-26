package com.jb.generics.wrapper;

/*
Una simple clase genérica.
Aquí, T es un parámetro de tipo que será reemplazado por un tipo real
cuando se crea un objeto de tipo Gen. 
*/
public class Gen<T> {
    // T es el parámetro de tipo genérico.
    T obj; //Declara un objeto de tipo T

    // Pase al constructor una referencia a un objeto de tipo T. 
    // El argumento pasado no puede ser de tipo primitivo. Pero se puede usar un envoltorio (wrapper) para
    // encapsular un tipo primitivo, el autoboxing y el auto-unboxing hacen esto automaticamente.
    Gen(T obj) {
        this.obj = obj;
    }

    T getObj() {
        return obj;
    }

    // Muestra el tipo de T
    void mostrarTipo() {
        System.out.println("El tipo de T es: " + obj.getClass().getName());
    }
}
