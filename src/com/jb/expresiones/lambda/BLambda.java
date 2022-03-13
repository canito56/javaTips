package com.jb.expresiones.lambda;

public class BLambda {

	public static void main(String[] args) {
	     
		// Esta expresión lambda determina si un número es un divisor de otro.
		BPruebaNum esDivisor = (n,d) -> (n % d) == 0;

		if(esDivisor.prueba(10, 2))
			System.out.println(("2 es un Divisor de 10"));
		if(!esDivisor.prueba(10, 3))
			System.out.println(("3 NO es un Divisor de 10"));

        System.out.println();
        // Esta expresión lambda devuelve true si el primer argumento es menor que el segundo.
        BPruebaNum menorQue = (n,m) -> (n < m);
        if (menorQue.prueba(2, 10))
        	System.out.println("2 es menor que 10");
        if (!menorQue.prueba(10, 2)) 
        	System.out.println("10 NO es menor que 2");

        System.out.println();
        // Esta expresión lambda devuelve true si los valores absolutos de los argumentos son iguales.
        BPruebaNum igualAbs = (n,m) -> (n < 0 ? -n : n) == (m < 0 ? -m : m);

        if (igualAbs.prueba(4, -4))
        	System.out.println("Valores absolutos de 4 y -4 son iguales");
        if (!igualAbs.prueba(4, 5))
            System.out.println("Valores absolutos de 4 y -5 NO son iguales");
	
	}

}
