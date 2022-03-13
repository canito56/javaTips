package com.jb.metodos.de.referencia;

public class MiDemoIntMetStatic {
	
	// Un m�todo est�tico que devuelve true si un n�mero es primo.
    static boolean esPrimo(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= n/i; i++) {
            if ((n % i) == 0)
                return false;
        }
        return true;
    }

    // Un m�todo est�tico que devuelve verdadero si un n�mero es par.
    static boolean esPar(int n) {
        return (n % 2) == 0;
    }

    // Un m�todo est�tico que devuelve true si un n�mero es positivo.
    static boolean esPositivo(int n){
        return n > 0;
    }
    
}
