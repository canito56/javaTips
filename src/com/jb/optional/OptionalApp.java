package com.jb.optional;

// Optional sirve para controlar los NullPointerException cuando llegan valores null
// Esta clase no deberia usarse si tenemos problemas de rendimiento en la app
import java.util.Optional;

public class OptionalApp {

	public static void main(String[] args) {
		OptionalApp app = new OptionalApp();
/*		app.probar(null);
		app.orElse(null);
		app.orElseThrow(null); */
		app.isPresent(null);
	}

	public void probar(String valor) {
		try {
			Optional<String> op = Optional.empty();
			op.get();
		} catch (Exception e) {
			System.out.println("No hay valor para op");
			e.printStackTrace();
		}
	}
	
	public void orElse(String valor) {
		Optional<String> op = Optional.ofNullable(valor);
		String s = op.orElse("default");
		System.out.println(s);
	}
	
	public void orElseThrow(String valor) {
		Optional<String> op = Optional.ofNullable(valor);
		op.orElseThrow(NumberFormatException::new);
	}
	
	public void isPresent(String valor) {
		Optional<String> op = Optional.ofNullable(valor);
		System.out.println(op.isPresent());
	}
	
}
