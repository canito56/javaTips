package com.jb.apireflection;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Sirve para manipular anotaciones
public class ApiReflection {
	
	@Retention(RetentionPolicy.RUNTIME)
	public @interface Lenguajes {
		Lenguaje[] value() default {};
	}
	
	@Repeatable(value = Lenguajes.class)
	public @interface Lenguaje {
		String value();
	}
	
	//1.7
	@Lenguajes({
		@Lenguaje("Java"),
		@Lenguaje("Python")
	})
	public interface LenguajeProgramacion1v7 {
		
	}
	
	//1.8
	@Lenguaje("Java")
	@Lenguaje("Python")
	public interface LenguajeProgramacion1v8 {
		
	}

	public static void main(String[] args) {
		Lenguaje[] lenguajeArray1v7 = LenguajeProgramacion1v7.class.getAnnotationsByType(Lenguaje.class);
		System.out.println("Se tiene (1.7) " + lenguajeArray1v7.length + " anotaciones en Lenguaje[]");
		
		Lenguaje[] lenguajeArray1v8 = LenguajeProgramacion1v7.class.getAnnotationsByType(Lenguaje.class);
		System.out.println("Se tiene (1.8) " + lenguajeArray1v8.length + " anotaciones en Lenguaje[]");
		
		Lenguajes len = LenguajeProgramacion1v8.class.getAnnotation(Lenguajes.class);
		for (Lenguaje elemento : len.value()) {
			System.out.println(elemento.value());
		}
	}

}
