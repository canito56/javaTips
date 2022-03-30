package com.jb.expresiones.lambda2;

import java.util.Comparator;

public class ComparatorApp {

	private static Comparator<String> comparator;
	private static String s1;
	private static String s2;
	
	public static void main(String[] args) {
		ComparatorApp app = new ComparatorApp();
		
		comparator = (s1, s2) -> Integer.compare(s1.length(), s2.length());
		
		s1 = "boca";
		s2 = "el mejor del mundo";
		System.out.println("s1: " + s1 + "  s2: " + s2);
		System.out.println("resusltado de la comparacion = " + app.comp(s1, s2));
		
		int result = comparator.compare(s2, s1);
		System.out.println("resultado usando lambda: " + result);

		boolean trueFalse = comparator.compare(s2, s1) == 0;
		System.out.println(trueFalse);

		s1 = "river el mejor del mundo";
		s2 = "river el mejor del mundo";
		System.out.println();
		System.out.println("s1: " + s1 + "  s2: " + s2);
		System.out.println("resusltado de la comparacion = " + app.comp(s1, s2));
		System.out.println("resultado usando lambda: " + comparator.compare(s2, s1));		
		System.out.println(comparator.compare(s2, s1) == 0);
	}
	
	public int comp(String s1, String s2) {
		return Integer.compare(s1.length(), s2.length());
	}

}
