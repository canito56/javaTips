package com.jb.collections;

import java.util.stream.Stream;

public enum DaysOfWeekEnum {
	MONDAY("Lunes"),
	TUESDAY("Martes"),
	WEDNESDAY("Miercoles"),
	THURSDAY("Jueves"),
	FRIDAY("Viernes"),
	SATURDAY("Sabado"),
	SUNDAY("Domingo");

	private String spanish;
	
	DaysOfWeekEnum(String s) {
		this.spanish = s;
	}
	
	public String getSpanish() {
		return spanish;
	}
	
	public static Stream<DaysOfWeekEnum> stream() {
		return Stream.of(DaysOfWeekEnum.values());
	}
	
}
