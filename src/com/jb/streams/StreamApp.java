package com.jb.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamApp {
	private List<String> lista;
	private List<String> numeros;
	
	public StreamApp() {
		lista = new ArrayList<>();
		lista.add("Mito");
		lista.add("Code");
		lista.add("Jaime");
		lista.add("MitoCode");
		
		numeros = new ArrayList<>();
		numeros.add("1");
		numeros.add("2");
	}
	
	public static void main(String[] args) {
		StreamApp app = new StreamApp();
		app.listar();
		app.filtrar();
		app.ordenarAsc();
		app.ordenarDesc();
		app.transformar();
		app.limitar();
		app.contar();
	}
	
	public void filtrar() {
		System.out.println();
		System.out.println("filtrar lo que empieza con M");
		lista.stream().filter(l -> l.startsWith("M")).forEach(System.out::println);;
	}
	
	public void listar() {
		System.out.println("listar lista");
		lista.forEach(System.out::println);
	}
	
	public void ordenarAsc() {
		System.out.println();
		System.out.println("ordenar lista asc");		
		lista.stream().sorted().forEach(System.out::println);
	}
	
	public void ordenarDesc() {
		System.out.println();
		System.out.println("ordenar lista desc");		
		lista.stream().sorted((l1,l2) -> l2.compareToIgnoreCase(l1)).forEach(System.out::println);		
	}

	public void transformar() {
		System.out.println();
		System.out.println("transformar lista a mayúsculas");		
		lista.stream().map(String::toUpperCase).forEach(System.out::println);

		System.out.println();
		System.out.println("transformar numeros a Integer y sumar 1 a cada elemento");
		numeros.stream().map(n -> Integer.parseInt(n) + 1).forEach(System.out::println);
	}
	
	public void limitar() {
		System.out.println();
		System.out.println("limitar lista a 2 elementos");		
		lista.stream().limit(2).forEach(System.out::println);
	}
	
	public void contar() {
		long x = lista.stream().count();
		System.out.println();
		System.out.println("la lista tiene " + x + " elementos");				
	}
	
}
