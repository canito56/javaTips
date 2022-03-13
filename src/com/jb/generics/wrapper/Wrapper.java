package com.jb.generics.wrapper;

//Demostración manual de boxing y unboxing con wrapper
public class Wrapper {

	public static void main(String[] args) {
        Integer iOb = Integer.valueOf(100);
        int i = iOb.intValue();
        System.out.println(i + " " + iOb);
	}

}
