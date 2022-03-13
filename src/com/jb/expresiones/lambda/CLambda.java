package com.jb.expresiones.lambda;

public class CLambda {

	public static void main(String[] args) {
		// Esta expresión lambda determina si un string es parte de otra.
		CPruebaString esParte = (a,b) -> a.indexOf(b) != -1;

		String str = "Esto es una prueba";

        System.out.println("Probando string: " + str);

        if (esParte.prueba(str, "es una"))
            System.out.println("'es una' encontrado");
        else
            System.out.println("'es una' NO encontrado");

        if (esParte.prueba(str, "xyz"))
            System.out.println("'xyz' encontrado");
        else
            System.out.println("'xyz' NO encontrado");
	}

}
