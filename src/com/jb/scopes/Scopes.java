package com.jb.scopes;

import com.jb.streams.Operacion;

public class Scopes {
	private static double atr1;
	private double atr2;
	
	public static void main(String[] args) {
		Scopes app = new Scopes();
		System.out.println(app.probarLocalVariable());
		System.out.println(app.probarAtributosStaticVariables());
	}
	
	public double probarLocalVariable() {
		double n3 = 3;

		Operacion operacion = (x,y) -> x + y + n3;
		
		return operacion.calcular(1, 1);
	}
	
	public double probarAtributosStaticVariables() {
		Operacion operacion = (x,y) -> {
			atr1 = x + y;
			atr2 = atr1;
			return atr2;
		};
		return operacion.calcular(3, 2);		
	}

}
