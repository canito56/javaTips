package com.jb.collections;

import com.jb.collections.DaysOfWeekClass.Day;

public class JavaEnumApp {

	public static void main(String[] args) {
		System.out.println("Class: Dias de la semana, en Ingles y Castellano, impresos uno por uno");
		System.out.println(Day.MONDAY + " " + Day.MONDAY.getSpanish());
		System.out.println(Day.TUESDAY + " " + Day.TUESDAY.getSpanish());
		System.out.println(Day.WEDNESDAY + " " + Day.WEDNESDAY.getSpanish());
		System.out.println(Day.THURSDAY + " " + Day.THURSDAY.getSpanish());
		System.out.println(Day.FRIDAY + " " + Day.FRIDAY.getSpanish());
		System.out.println(Day.SATURDAY + " " + Day.SATURDAY.getSpanish());
		System.out.println(Day.SUNDAY + " " + Day.SUNDAY.getSpanish());

		System.out.println();
		System.out.println("Class: Dias de la semana, en Ingles y Castellano, y sus indices");
		Day.stream().forEach(d -> System.out.println(d.ordinal() + " " + d + " " + d.getSpanish()));
		
		System.out.println();
		System.out.println("Enum: Dias de la semana, en Ingles y Castellano, y sus indices");
		DaysOfWeekEnum.stream().forEach(d -> System.out.println(d.ordinal() + " " + d + " " + d.getSpanish()));

		System.out.println();
		System.out.println("Enum: Estaciones del año en Ingles con System.out::println");
		Seasons.stream().forEach(System.out::println);
		
		System.out.println();
		System.out.println("Enum: Estaciones del año en Ingles y sus indices");
		Seasons.stream().forEach(s -> System.out.println(s.ordinal() + " " + s));
	}

}
