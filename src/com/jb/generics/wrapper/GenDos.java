package com.jb.generics.wrapper;

// Usa dos parámetros de tipo
class GenDos<T, V> {
    
    T ob1; //Declara un objeto de tipo T
    V ob2; //Declara un objeto de tipo V

    // Pase al constructor una referencia a un objeto de tipo T y V.
    GenDos(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    T getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }

    //Muestra el tipo de T y V
    void mostrarTipo() {
        System.out.println("El tipo de T es: " + ob1.getClass().getName());
        System.out.println("El tipo de V es: " + ob2.getClass().getName());
    }
}