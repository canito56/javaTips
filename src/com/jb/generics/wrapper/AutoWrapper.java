package com.jb.generics.wrapper;

// Boxing y Unboxing (wrapper/unwraper) más moderno, sin necesidad de hacerlo manualmente. Es más seguro también.
public class AutoWrapper {

	public static void main(String[] args) {
        Integer iOb = 100;
        int i = iOb;
        System.out.println(i + " " + iOb);
	}

}
