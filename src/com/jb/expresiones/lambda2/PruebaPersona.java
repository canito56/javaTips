package com.jb.expresiones.lambda2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PruebaPersona {

	public static void main(String[] args) {

		List<Persona> personas = new ArrayList<>();

		personas.add(new Persona("Juan"));
		personas.add(new Persona("Mario"));
		personas.add(new Persona("Augusto"));
		personas.add(new Persona("Daniel"));
		
		personas.sort((l, r) -> l.nombre.compareTo(r.nombre));
		
		System.out.println("1er listado:");
		personas.forEach(p -> System.out.println(p.nombre));
		
		personas.add(new Persona("Ariel"));
		personas.add(new Persona("Sebastian"));
		
		Comparator<Persona> comp = (l, r) -> l.nombre.compareTo(r.nombre);
	
		personas.sort(comp);

		System.out.println();
		System.out.println("2do listado:");
		personas.forEach(p -> System.out.println(p.nombre));
		
		Stream<Persona> personas2 = personas.stream()
				.filter(p -> p.nombre.startsWith("A"));
		
		List<Persona> personas3 = personas.stream()
				.filter(p -> p.nombre.startsWith("M"))
				.collect(Collectors.toList());

		List<String> nombres = personas.stream()
				.filter(p -> p.nombre != null)
				.map(p -> p.nombre)
				.collect(Collectors.toList());
		
		System.out.println();
		System.out.println("3er listado:");
		personas2.forEach(p -> System.out.println(p.nombre));
		
		System.out.println();
		System.out.println("4to listado:");
		personas3.forEach(p -> System.out.println(p.nombre));
		
		System.out.println();
		System.out.println("5to listado:");
		nombres.forEach(n -> System.out.println(n));
		
	}

}
