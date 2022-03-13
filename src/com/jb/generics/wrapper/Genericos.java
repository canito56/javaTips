package com.jb.generics.wrapper;

import java.util.Optional;

// No se pueden usar tipos primitivos (int, char, etc) como genéricos, solo tipos de clase.
public class Genericos {

	public static void main(String[] args) {
        // Crea una referencia Gen para Integers.
        Gen<Optional<Integer>> iOb;

        // Cree un objeto Gen<Integer> y asigne su referencia a iOb.
        // Observe el uso de autoboxing para encapsular el valor 28 dentro de un objeto Integer.
        iOb = new Gen<Optional<Integer>>(Optional.ofNullable(28));

        // Muestra el tipo de dato utilizado por iOb
        iOb.mostrarTipo();

        // Obtenga el valor en iOb.
        // Fíjese que no se necesita una conversión
        if (iOb.getOb().isPresent()) {
            int v = iOb.getOb().get();
            System.out.println("Valor v: " + v);       	        	
        }
        
        iOb.getOb().ifPresent(o -> {
            System.out.println("Valor o: " + o);
            System.out.println();        	        	
        });

        // Cree un objeto Gen para Strings.
        Gen<String> strOb = new Gen<String>("Prueba de genéricos");

        // Muestra el tipo de dato utilizado por strOb
        strOb.mostrarTipo();

        // Obtenga el valor de strOb.
        // De nuevo, note que no se necesita de conversión
        String str = strOb.getOb();
        System.out.println("Valor str: " + str);
        
        // Demostración de clase DosGen
        System.out.println();
        System.out.println("### Demostración de clase DosGen");

        GenDos<Optional<Integer>, String> genDos; 
        genDos = new GenDos<Optional<Integer>, String>(Optional.ofNullable(28), "Genericos");

        // Mostrar los tipos
         genDos.mostrarTipo();

         // Obtener y mostrar los valores
         if (genDos.getOb1().isPresent()) {
             int v2 = genDos.getOb1().get();
             System.out.println("Valor v2: " + v2);        	 
         }
         
         genDos.getOb1().ifPresent(gd -> {
        	 System.out.println("Valor gd: " + gd);
         });

         String str2 = genDos.getOb2();
         System.out.println("Valor str2: " + str2);

         System.out.println();
         System.out.println("### Demostración de GenTiposLimitados");
         
         GenTiposLimitados<Integer> aOb; 
         aOb = new GenTiposLimitados<Integer>(5);

         System.out.println("El recíproco de 5 es: " + aOb.reciproco());
         System.out.println("La parte fraccionaria de 5 es: " + aOb.fraccion());
         System.out.println();

         GenTiposLimitados<Double> dOb = new GenTiposLimitados<Double>(15.25);

         System.out.println("El recíproco de 15.25 es: " + dOb.reciproco());
         System.out.println("La parte fraccionaria de 15.25 es: " + dOb.fraccion());

         // Lo siguiente compilaria porque String no es una subclase de Number:
         // GenTiposLimitados<String> strOb = new GenTiposLimitados<String>('Error");
	}

}
