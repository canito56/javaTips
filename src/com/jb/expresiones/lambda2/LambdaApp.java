package com.jb.expresiones.lambda2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaApp {

	private static List<String> lista;
	private static List<String> numeros;
	
	public LambdaApp() {
		lista = new ArrayList<>();	
    	lista.add("Juan");
    	lista.add("Pedro");
    	lista.add("Martin");
    	lista.add("Augusto");
    	lista.add("Mario");

		numeros = new ArrayList<>();
		numeros.add("1");
		numeros.add("2");
		numeros.add("3");
		numeros.add("4");
	}
	
	public static void main( String[] args ) {
		LambdaApp app = new LambdaApp();

		app.ordenar();
		app.calcular();
		app.filtrar();
		app.transformar();
		app.limitar();
		app.contar();
    }
    
    public void ordenar() {
		System.out.println("ordenar clásico o imperativo");

		Collections.sort(lista, (String p1, String p2) -> p1.compareTo(p2));

		for (String e : lista) {
			System.out.println(e);
		}

    	System.out.println();
		System.out.println("ordenar lambda ascendente");
		lista.stream().sorted().forEach(System.out::println);

		System.out.println();
		System.out.println("ordenar lambda descendente");
		lista.stream().sorted((l1, l2) -> l2.compareTo(l1)).forEach(System.out::println);		
    }
	
	public void calcular() {
		Operacion ope = (x, y) -> (x+y)/2;
		
		System.out.println();
		System.out.println("calcular promedio");
		System.out.println(ope.calcularPromedio(2, 3));
	}
	
	public void filtrar() {
		System.out.println();
		System.out.println("filtrar los que empiezan con M");
		lista.stream().filter(x -> x.startsWith("M")).forEach(System.out::println);
	}
	
	public void transformar() {
		System.out.println();
		System.out.println("convertir a mayusculas");
		lista.stream().map(String::toUpperCase).forEach(System.out::println);		

		System.out.println();
		System.out.println("convertir los nros sumandole 1 a c/uno");
		numeros.stream().map(x -> Integer.parseInt(x) + 1).forEach(System.out::println);
	}

	public void limitar() {
		System.out.println();
		System.out.println("limitar lista a 2 elementos");
		lista.stream().limit(2).forEach(System.out::println);
	}
	
	public void contar() {
		long x = lista.stream().count();
		System.out.println();
		System.out.println("contar elementos de lista");
		System.out.println(x);
	}
}
