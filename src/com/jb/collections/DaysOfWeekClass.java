package com.jb.collections;

import java.util.stream.Stream;

public class DaysOfWeekClass {
	
	public enum Day {
		MONDAY("Lunes"),
		TUESDAY("Martes"),
		WEDNESDAY("Miercoles"),
		THURSDAY("Jueves"),
		FRIDAY("Viernes"),
		SATURDAY("Sabado"),
		SUNDAY("Domingo");
	
		private String spanish;
		
		private Day(String s) {
			this.spanish = s;
		}
		
		public String getSpanish() {
			return spanish;
		}
		
		public static Stream<Day> stream() {
			return Stream.of(Day.values());
		}
	}

}
