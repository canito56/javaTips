package com.jb.nashorn;

import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class NashApp {
	
	private ScriptEngineManager m;
	private ScriptEngine e;
	
	public NashApp() {
		m = new ScriptEngineManager();
		e = m.getEngineByName("nashorn");
		System.out.println(m);
		System.out.println(e);
	}
	
	public void llamarFunciones() throws Exception {
		// e.eval("print('JS desde Java')");
		e.eval(new FileReader("src/com/jb/nashorn/archivo.js"));
	}
	
	public void implementarInterfaz() {
		
	}
	
	public static void main(String[] args) throws Exception {
		NashApp app = new NashApp();
		app.llamarFunciones();
	}

}
