package com.jb.generics.wrapper;

/*
Además del caso simple de asignaciones, el autoboxing se produce automáticamente siempre que 
un tipo primitivo se debe convertir en un objeto, y el auto-unboxing tiene lugar cada vez que 
un objeto se debe convertir a un tipo primitivo. Por lo tanto, el autoboxing/unboxing puede ocurrir 
cuando un argumento se pasa a un método o cuando un método devuelve un valor.  
*/
public class Autobox {
	
	//Este método tiene un parámetro Integer.
    static void m(Integer v) {
        System.out.println("m() recive " + v);
    }

    //Este método devuelve un int
    static int m2() {
        return 10;
    }

    //Este método devuelve un Integer
    static Integer m3() {
        return 99;
    }
    
	public static void main(String[] args) {
        //Pasar una int a m().
        //Debido a que m() tiene un parámetro Integer,
        //el valor int pasado es automáticamente encapsulado.
        m(199);

        //Aquí, iOb recibe el valor int devuelto por m2().
        //Este valor se encapsula automáticamente
        //para que pueda asignarse a iOb
        Integer iOb = m2();
        System.out.println("El valor de retorno de m2() es: " + iOb);

        //A continuación, se llama m3().
        //Esto devuelve un valor Integer
        //que se desencapsula automáticamente en un int.
        int i = m3();
        System.out.println("El valor de retorno de m3() es: " + i);

        //A continuación, se llama a Math.sqrt() con iOb como argumento.
        //En este caso, iOb se desencapsula automáticamente
        //y su valor se promociona a double, que es el tipo que necesita sqrt().
        iOb = 100;
        System.out.println("La raíz cuadrada de iOb es: " + Math.sqrt(iOb));
        
        // Autoboxing en expresiones
        System.out.println();
        System.out.println("### Autoboxing en expresiones");
        
        Integer jOb, jOb2;
        int j;
        
        jOb = 99;
        System.out.println("Valor original de jOb: " + jOb);

        //Lo siguiente desencapsula automáticamente jOb, realiza el incremento,
        //y luego vuelve a re-capsular el resultado en jOb.
        ++jOb;
        System.out.println("Después de ++jOb: " + jOb);

        //Aquí, jOb es desencapsulado, su valor se incrementa en 10,
        //y el resultado es encapsulado y almacenado de nuevo en jOb.
        jOb += 10;
        System.out.println("Después de jOb += 10: " + jOb);

        //Aquí, jOb es desencapsulado, la expresión es evaluada,
        //y el resultado es re-encapsulado y asignado a jOb2.
        jOb2 = jOb + (jOb/3);
        System.out.println("jOb2 después de la expresión: " + jOb2);

        //Se evalúa la misma expresión, pero el resultado no se vuelve a encapsular.
        j = jOb + (jOb/3);
        System.out.println("j después de la expresión: " + j);
        
        // Debido al desencapsulado automático, puede usar objetos numéricos enteros, 
        // como un Integer, para controlar una declaración switch.
        System.out.println();
        System.out.println("### Autoboxing en switch");

        Integer kOb = 2;
        switch (kOb) {
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("dos");
                break;
             default:
                 System.out.println("error");
        }
        
    }

}
