package com.jb.methodReference;

public class MetodoRefMetInst {

	public static void main(String[] args) {
     
		boolean resultado;
	
	    MiDemoIntMetInst miNum = new MiDemoIntMetInst(15);
	    MiDemoIntMetInst miNum2 = new MiDemoIntMetInst(18);
	
	    // Aqu�, se crea una referencia del m�todo esDivisor() en miNum.
	    DemoInt di = miNum::esDivisor;
	
	    // Ahora, se usa para llamar a esDivisor() a trav�s de prueba().
	    resultado = di.prueba(3);	    
	    if (resultado) System.out.println("3 es un divisor de " + miNum.getNum());

	    // Obviamente se puede usar directamente el metodo esDivisor() de miNum
	    if (miNum.esDivisor(3)) System.out.println("usando directamente met esDivisor() 3 es un divisor de " + miNum.getNum());
	
	    // Esta vez, se crea una referencia del m�todo esDivisor() en miNum2
	    // y  se usa para llamar a esDivisor() a trav�s de prueba().
	    di = miNum2::esDivisor;
	    
	    resultado = di.prueba(3);	    
	    if (resultado) System.out.println("3 es un divisor de " + miNum2.getNum());
	    
	    // Tambi�n es posible manejar una situaci�n en la que desee especificar un m�todo 
	    // de instancia que pueda usarse con cualquier objeto de una clase determinada, 
	    // no solo un objeto especificado. En este caso, crear� una referencia de m�todo.
	    DemoInt2 di2 = MiDemoIntMetInst::esDivisor;
	    
	    // Lo siguiente llama a esDivisor() en miNum.
	    resultado = di2.prueba(miNum, 3);
	    if (resultado) System.out.println("3 es un divisor de " + miNum.getNum());

	    // Lo siguiente llama a esDivisor() en miNum2.
	    resultado = di2.prueba(miNum2, 3);
	    if (resultado) System.out.println("3 es un divisor de " + miNum2.getNum());
	    
	}

}
