package com.jb.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MapApp {

	private Map<Integer, String> map;
	
	public static void main(String[] args) {
		MapApp app = new MapApp();
		app.poblar();
		app.imprimir_v7();
		app.imprimir_v8();
		app.insertarSiAusente();
		app.imprimir_v8();
		app.operarSiPresente();
		app.obtenerOrPredeterminado();
		app.recolectar();
	}
	
	public void poblar() {
		map = new HashMap<>();
		map.put(1, "Mito");
		map.put(2, "Code");
		map.put(3, "Suscribete");
	}
	
	public void imprimir_v7() {
		System.out.println("java version 7, forma imperativa");

		for (Entry<Integer, String> e : map.entrySet()) {
			System.out.println("Llave: " + e.getKey() + "  Valor: " + e.getValue());
		}
	}
	
	public void imprimir_v8() {
		System.out.println();
		System.out.println("java version 8, forma declarativa");
		
		map.forEach((k,v) -> System.out.println("Llave: " + k + "  Valor: " + v));
		
		System.out.println();
		System.out.println("java version 8, forma declarativa usando 'entrySet'");
		
		map.entrySet().stream().forEach(System.out::println);
	}
	
	public void insertarSiAusente() {
		map.putIfAbsent(4, "Jaime");
	}
	
	public void operarSiPresente() {
		map.computeIfPresent(3, (k,v) -> k + v);
		
		System.out.println();
		System.out.println("redefine map(3)");
		System.out.println(map.get(3));
	}
	
	public void obtenerOrPredeterminado() {
		String valor = map.getOrDefault(5, "valor por defecto");
		System.out.println();
		System.out.println("listar valor agregado por defecto");
		System.out.println(valor);
	}
	
	public void recolectar() {
		Map<Integer, String> mapaRecolectado = map.entrySet().stream()
				.filter(e -> e.getValue().contains("Jai"))
				.collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
		System.out.println();
		System.out.println("imprimir mapa recolectado");
		mapaRecolectado.forEach((k,v) -> System.out.println("Llave: " + k + "  Valor: " + v));
	}
	
}
