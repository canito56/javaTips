package com.jb.streams;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {

	private List<Integer> numeros;
	
	public static void main(String[] args) {
		ParallelStream app = new ParallelStream();
		app.llenar();
		app.probarStream();
		app.probarStreamParalelo();
	}
	
	public void llenar() {
		numeros = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			numeros.add(i);
		}
	}
	
	public void probarStream() {
		System.out.println("probarStream");
		numeros.stream().forEach(System.out::println);
	}
	
	public void probarStreamParalelo() {
		System.out.println();
		System.out.println("probarStreamParalelo, cada vez que ejecuto los nros aparecen en otro orden" +
		                   "\nporque estoy trabajando con hilos, es un comportamiento asincrono y aleatorio.");
		numeros.parallelStream().forEach(System.out::println);		
	}

}
