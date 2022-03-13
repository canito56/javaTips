package com.jb.expresiones.lambda2;

import java.util.function.Function;

public class TestFunction {

	public static void main(String[] args) {
	
		System.out.println(sizeOf.apply("hola viejo"));

	}
	
	static Function<String, Integer> sizeOf = s -> s.length();

}
