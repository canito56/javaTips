package com.jb.defaultMethod;

public class DefaultMethod implements PersonaA, PersonaB {

	public static void main(String[] args) {
		DefaultMethod app = new DefaultMethod();
		app.caminar();
		app.hablar();
	}

	@Override
	public void caminar() {
		System.out.println("Hola viejo!");
	}

	@Override
	public void hablar() {
		PersonaA.super.hablar();
		System.out.println("Saludos viejo!");	// además puedo sobreescribir el método 
	}

}
