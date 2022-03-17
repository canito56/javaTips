package com.jb.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ColeccionApp {

	private List<String> lista;

	public static void main(String[] args) {
		ColeccionApp app = new ColeccionApp();
		
		app.llenarLista();
		
		app.usarForEachTradicional();
		app.usarForEachLambda();
		
		app.usarRemoveIfTradicional();
		app.usarForEachLambda();
		app.usarRemoveIfLambda();
		app.usarForEachLambda();
		
		app.usarSortAscendenteLambda();
		app.usarForEachLambda();
		
		app.usarSortDescendenteLambda();
		app.usarForEachLambda();
	}
	
	public void llenarLista() {
		lista = new ArrayList<>();
		
		lista.add("MitoCode");
		lista.add("Mito");
		lista.add("Code");
	}
	
	public void usarForEachTradicional() {
		System.out.println("lista ordenada forma tradicional");
		
		for (String elemento : lista) {
			System.out.println(elemento);
		}
	}
	
	public void usarForEachLambda() {
		System.out.println();
		System.out.println("lista ordenada con lambda");
		
		lista.forEach(x -> System.out.println(x));
		
		System.out.println();
		System.out.println("lista ordenada con lambda usando referencia a método");
		
		lista.forEach(System.out::println);
	}
	
	public void usarRemoveIfTradicional() {
		System.out.println();
		System.out.println("remover elemento de lista forma tradicional");
		
		Iterator<String> it = lista.iterator();
		
		while (it.hasNext()) {
			if (it.next().equalsIgnoreCase("Code")) {
				it.remove();
			}
		}
	}
	
	public void usarRemoveIfLambda() {
		// agrego el valor para tener la lista completa p los ejemplos
		lista.add("Code");
		
		System.out.println();
		System.out.println("remover elemento de lista con lambda");
		
		lista.removeIf(x -> x.equalsIgnoreCase("Code"));

		// agrego el valor para tener la lista completa p los ejemplos
		lista.add("Code");
	}
	
	public void usarSortAscendenteLambda() {
		System.out.println();
		System.out.println("ordenar lista ascendente con lambda");
		
		lista.sort((l1,l2) -> l1.compareToIgnoreCase(l2));
	}
	
	public void usarSortDescendenteLambda() {
		System.out.println();
		System.out.println("ordenar lista descendente con lambda");
		
		lista.sort((l1,l2) -> l2.compareToIgnoreCase(l1));
	}

}
