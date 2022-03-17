package com.jb.methodReference;

import java.util.Arrays;

public class MetRefApp {

	public static void main(String[] args) {
		MetRefApp app = new MetRefApp();
		app.operar();
		app.referenciarMetodoInstanciaObjetoArbitrario();
		app.referenciarMetodoInstanciaObjetoParticular();
		Operacion op = app::referenciarMetodoInstanciaObjetoParticular;
		op.saludar();
		app.referenciarConstructor();
	}
	
	public void operar() {
		Operacion op1 = () -> MetRefApp.referenciarMetodoStatic();
		op1.saludar();
		
		Operacion op2 = MetRefApp::referenciarMetodoStatic;
		op2.saludar();
	}
	
	public static void referenciarMetodoStatic() {
		System.out.println("Método referido static");
	}
	
	public void referenciarMetodoInstanciaObjetoArbitrario() {
		String[] nombres = { "Mito", "Code", "Jaime" };
/*		
		Arrays.sort(nombres, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareToIgnoreCase(o2);
			}
		});

		// lo anterior se puede hacer con una lambda
		Arrays.sort(nombres, (s1,s2) -> s1.compareToIgnoreCase(s2)); 
		System.out.println(Arrays.toString(nombres));
*/		
		// lo anterior se puede reducir todavia más
		Arrays.sort(nombres, String::compareToIgnoreCase); // cómo puedo ordenar descendente?
		System.out.println(Arrays.toString(nombres));
	}
	
	public void referenciarMetodoInstanciaObjetoParticular() {
		System.out.println("Método referido instancia de objeto en particular");
	}
	
	public void referenciarConstructor() {
		IPersona iper1 = (x,y) -> (new Persona(x,y));
		Persona per1 = iper1.crear(1, "Agustin");
		System.out.println(per1.getId() + " - " + per1.getNombre());
		
		IPersona iper2 = Persona::new;
		Persona per2 = iper2.crear(2, "Juan");
		System.out.println(per2.getId() + " - " + per2.getNombre());
	}

}
