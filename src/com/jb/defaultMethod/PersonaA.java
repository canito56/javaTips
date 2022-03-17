package com.jb.defaultMethod;

public interface PersonaA {
	
	public void caminar();
	
	default public void hablar() {
		System.out.println("bla bla bla! - PersonaA");
	}
}
