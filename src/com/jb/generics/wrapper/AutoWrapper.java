package com.jb.generics.wrapper;

// Boxing y Unboxing (wrapper/unwraper) m�s moderno, sin necesidad de hacerlo manualmente. Es m�s seguro tambi�n.
public class AutoWrapper {

	public static void main(String[] args) {
        Integer iOb = 100;
        int i = iOb;
        System.out.println(i + " " + iOb);
	}

}
