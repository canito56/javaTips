package com.jb.metodos.de.referencia;

//Esta clase almacena un valor int y define el método de instancia esDivisor()
//que devuelve true si su argumento es un divisor del valor almacenado.
public class MiDemoIntMetInst {
    
	private int v;

    MiDemoIntMetInst(int x) { v = x; }
    
    int getNum() { return v; }

    // Devuelve true si n es un divisor de v.
    boolean esDivisor(int n) {
        return (v % n) == 0;
    }
    
}
