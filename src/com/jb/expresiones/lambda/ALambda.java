package com.jb.expresiones.lambda;

public class ALambda {

	public static void main(String[] args) {
		
        AMiValor miValor; // declarar una referencia de interfaz

        // Aqu�, la expresi�n lambda es simplemente una expresi�n constante.
        // Cuando se asigna a miValor, se construye una instancia de clase
        // en la que la expresi�n lambda implementa el m�todo getValor() en MiValor.
        miValor = () -> 28.6; //Una simple expresi�n lambda

        // Llama a getValor(), el cual es provisto por la expresi�n lambda previamente asignada.
        System.out.println("Un valor constante: " + miValor.getValor());

        // Ahora, se crea una expresi�n lambda parametrizada y se le asigna a una referencia 
        // MiValParam. Esta expresi�n lambda devuelve lo rec�proco de su argumento.
        AMiValParam miValParam = (n) -> 1.0/n;

        // Llama a getValor(v) a trav�s de la referencia miValParam.
        System.out.println("El rec�proco de 4 es: " + miValParam.getValor(4.0));
        System.out.println("El rec�proco de 5 es: " + miValParam.getValor(5.0));

        // Una expresi�n lambda debe ser compatible con el m�todo definido en la interfaz funcional.
        // Por lo tanto, esto no funcionar�:
        // miValor = () -> "Tres";           // Error! String no compatible con double!
        // miValParam = () -> Math.random(); // Error! Par�metro requerido!
	}
}
