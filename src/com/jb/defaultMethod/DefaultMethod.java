package com.jb.defaultMethod;

public class DefaultMethod implements PersonaA, PersonaB {

	public static void main(String[] args) {
		DefaultMethod app = new DefaultMethod();
		app.caminar();
		app.hablar();
	}

	@Override
	public void caminar() {
		System.out.println("Estoy caminando viejo!");
	}

	@Override
	public void hablar() {
		PersonaA.super.hablar();
		PersonaB.super.hablar();
		System.out.println("Saludos viejo!");	// adem?s puedo sobreescribir el m?todo 
	}

}
