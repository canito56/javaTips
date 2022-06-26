package com.jb.generics.wrapper;

import java.util.Optional;

// No se pueden usar tipos primitivos (int, char, etc) como genéricos, solo tipos de clase.
public class Genericos {

	public static void main(String[] args) {
        // Crea una referencia Gen para Integers.
        Gen<Optional<Integer>> iObj;

        // Cree un objeto Gen<Integer> y asigne su referencia a iObj.
        // Observe el uso de autoboxing para encapsular el valor 28 dentro de un objeto Integer.
        iObj = new Gen<Optional<Integer>>(Optional.ofNullable(28));

        // Muestra el tipo de dato utilizado por iObj
        iObj.mostrarTipo();

        // Obtenga el valor en iObj.
        // Fíjese que no se necesita una conversión
        if (iObj.getObj().isPresent()) {
            int v = iObj.getObj().get();
            System.out.println("Valor v: " + v);       	        	
        }
        
        iObj.getObj().ifPresent(o -> {
            System.out.println("Valor o: " + o);
            System.out.println();        	        	
        });

        // Cree un objeto Gen para Strings.
        Gen<String> strObj = new Gen<String>("Prueba de genéricos");

        // Muestra el tipo de dato utilizado por strObj
        strObj.mostrarTipo();

        // Obtenga el valor de strObj.
        // De nuevo, note que no se necesita de conversión
        String str = strObj.getObj();
        System.out.println("Valor str: " + str);
        
        // Demostración de clase GenDos
        System.out.println();
        System.out.println("### Demostración de clase DosGen");

        GenDos<Optional<Integer>, String> genDos; 
        genDos = new GenDos<Optional<Integer>, String>(Optional.ofNullable(28), "Genericos");

        // Mostrar los tipos
         genDos.mostrarTipo();

         // Obtener y mostrar los valores
         if (genDos.getObj1().isPresent()) {
             int v2 = genDos.getObj1().get();
             System.out.println("Valor v2: " + v2);        	 
         }
         
         genDos.getObj1().ifPresent(gd -> {
        	 System.out.println("Valor gd: " + gd);
         });

         String str2 = genDos.getObj2();
         System.out.println("Valor str2: " + str2);

         System.out.println();
         System.out.println("### Demostración de GenTiposLimitados");
         
         GenTiposLimitados<Integer> aObj; 
         aObj = new GenTiposLimitados<Integer>(5);

         System.out.println("El recíproco de 5 es: " + aObj.reciproco());
         System.out.println("La parte fraccionaria de 5 es: " + aObj.fraccion());
         System.out.println();

         GenTiposLimitados<Double> dObj = new GenTiposLimitados<Double>(15.25);

         System.out.println("El recíproco de 15.25 es: " + dObj.reciproco());
         System.out.println("La parte fraccionaria de 15.25 es: " + dObj.fraccion());

         // Lo siguiente compilaria porque String no es una subclase de Number:
         // GenTiposLimitados<String> strOb = new GenTiposLimitados<String>('Error");
	}

}
