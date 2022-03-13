package com.jb.metodos.de.referencia;

public class MiDemoIntMetStatic {
	
	// Un método estático que devuelve true si un número es primo.
    static boolean esPrimo(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= n/i; i++) {
            if ((n % i) == 0)
                return false;
        }
        return true;
    }

    // Un método estático que devuelve verdadero si un número es par.
    static boolean esPar(int n) {
        return (n % 2) == 0;
    }

    // Un método estático que devuelve true si un número es positivo.
    static boolean esPositivo(int n){
        return n > 0;
    }
    
}
