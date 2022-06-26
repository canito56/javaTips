package com.jb.generics.wrapper;

// Usa dos parámetros de tipo
class GenDos<T, V> {
    
    T obj1; //Declara un objeto de tipo T
    V obj2; //Declara un objeto de tipo V

    // Pase al constructor una referencia a un objeto de tipo T y V.
    GenDos(T obj1, V obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    T getObj1() {
        return obj1;
    }

    V getObj2() {
        return obj2;
    }

    //Muestra el tipo de T y V
    void mostrarTipo() {
        System.out.println("El tipo de T es: " + obj1.getClass().getName());
        System.out.println("El tipo de V es: " + obj2.getClass().getName());
    }
}