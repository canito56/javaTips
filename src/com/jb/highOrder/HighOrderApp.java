package com.jb.highOrder;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class HighOrderApp {

	private Function<String, String> convertirMayusculas = x -> x.toUpperCase();
	private Function<String, String> convMayRef = String::toUpperCase;
	
	private Function<String, String> convertirMinusculas = x -> x.toLowerCase();
	private Function<String, String> convMinRef = String::toLowerCase;
	
	public void imprimir(Function<String, String> funcion, String valor) {
		System.out.println(funcion.apply(valor)); 
	}
	
	public Function<String, String> mostrar(String mensaje) {
		return (String x) -> mensaje + x;		
	}
	
	public void filtrar(List<String> lista, Consumer<String> consumidor, int longitud) {
		lista.stream().filter(this.establecerLogicaFiltro(longitud)).forEach(consumidor);
	}
	
	public Predicate<String> establecerLogicaFiltro(int longitud) {
		return texto -> texto.length() < longitud;
	}
	
	public void filtrar(List<String> lista, Consumer<String> consumidor, String cadena) {
		lista.stream().filter(this.establecerLogicaFiltro(cadena)).forEach(consumidor);
	}
	
	public Predicate<String> establecerLogicaFiltro(String cadena) {
		return texto -> texto.contains(cadena);
	}
	
	public static void main(String[] args) {
		HighOrderApp app = new HighOrderApp();
		
		app.imprimir(app.convertirMayusculas, "mitocode");
		app.imprimir(app.convMayRef, "river es el mejor!");
		
		app.imprimir(app.convertirMinusculas, "MITOCODE");
		app.imprimir(app.convMinRef, "BETO ALONSO");

		System.out.println(app.mostrar("Hola ").apply("MitoCode"));
		
		List<String> lista = new ArrayList<>();
		lista.add("Mito");
		lista.add("Code");
		lista.add("MitoCode");
		app.filtrar(lista, System.out::println, 5);
		app.filtrar(lista, System.out::println, "Mito");
	}

}
