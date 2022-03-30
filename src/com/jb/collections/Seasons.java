package com.jb.collections;

import java.util.stream.Stream;

public enum Seasons {
	PRIMAVERA,
	VERANO,
	OTO�O,
	INVIERNO;
	
	public static Stream<Seasons> stream() {
		return Stream.of(Seasons.values());
	}

}
