package com.jb.metodos.de.referencia;

public class MetodoRefMetStatic {
    
	// Este método tiene una interfaz funcional como el tipo de su primer parámetro.
    // Por lo tanto, se puede pasar una referencia a cualquier instancia de esa interfaz,
    // incluida una creada por una referencia de método.
    static boolean pruebaNum(DemoInt p, int v) {
        return p.prueba(v);
    }
	
	public static void main(String[] args) {

		boolean resultado;

        // Aquí, una referencia de método a esPrimo se pasa a pruebaNum().
        resultado = pruebaNum(MiDemoIntMetStatic::esPrimo, 19);
        if (resultado) System.out.println("19 es primo");

        // A continuación, se utiliza una referencia de método a esPar().
        resultado = pruebaNum(MiDemoIntMetStatic::esPar, 10);
        if (resultado) System.out.println("10 es par");

        // Ahora, se pasa una referencia de método a esPositivo.
        resultado = pruebaNum(MiDemoIntMetStatic::esPositivo, 28);
        if (resultado) System.out.println("28 es positivo");

	}

}
