package com.jb.defaultMethod;

public interface PersonaB {
	
	default public void hablar() {
		System.out.println("bla bla bla! - PersonaB");
	}

}
