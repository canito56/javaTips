package com.jb.collections;

import java.util.stream.Stream;

public enum Seasons {
	PRIMAVERA,
	VERANO,
	OTOÑO,
	INVIERNO;
	
	public static Stream<Seasons> stream() {
		return Stream.of(Seasons.values());
	}

}
