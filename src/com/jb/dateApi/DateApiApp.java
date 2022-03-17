package com.jb.dateApi;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateApiApp {

	public static void main(String[] args) throws InterruptedException, ParseException {
		DateApiApp app = new DateApiApp();
		app.verificar(7);
		app.medirTiempo(7);
		app.periodoEntreFechas(8);
		app.convertir(8);
	}
	
	public void verificar(int version) {
		if (version == 7) {
			Calendar fecha1 = Calendar.getInstance();
			Calendar fecha2 = Calendar.getInstance();
			fecha1.set(1991, 0, 21); // en la version java 1.7 los meses empiezan en 0 y terminan en 11
			System.out.println(fecha1.after(fecha2));
		} else if (version == 8) {
			LocalDate fecha1 = LocalDate.of(1956, 10, 03);
			LocalDate fecha2 = LocalDate.now();
			System.out.println(fecha1.isAfter(fecha2));
			System.out.println(fecha1.isBefore(fecha2));

			LocalTime tiempo1 = LocalTime.of(22, 30, 50);
			LocalTime tiempo2 = LocalTime.now();
			System.out.println(tiempo1.isAfter(tiempo2));
			System.out.println(tiempo1.isBefore(tiempo2));

			LocalDateTime fechaTiempo1 = LocalDateTime.of(1956, 10, 3, 22, 30, 50);
			LocalDateTime fechaTiempo2 = LocalDateTime.now();
			System.out.println(fechaTiempo1.isAfter(fechaTiempo2));
			System.out.println(fechaTiempo1.isBefore(fechaTiempo2));
		}
	}
	
	public void medirTiempo(int version) throws InterruptedException {
		if (version == 7) {
			long ini = System.currentTimeMillis();
			Thread.sleep(1000);
			long fin = System.currentTimeMillis();
			System.out.println("diferencia fin - ini = " + (fin - ini));
		} else if (version == 8) {
			Instant ini = Instant.now();
			Thread.sleep(1000);
			Instant fin = Instant.now();
			System.out.println(Duration.between(ini, fin).toMillis());
		}
	}
	
	public void periodoEntreFechas(int version) {
		if (version == 7) {
			Calendar nacimiento = Calendar.getInstance();
			Calendar actual = Calendar.getInstance();
			
			nacimiento.set(1956, 10, 3);
			actual.set(2022, 3, 16);
			
			int anios = 0;
			
			while (nacimiento.before(actual)) {
				nacimiento.add(Calendar.YEAR, 1);
				if (nacimiento.before(actual)) {
					anios++;
				}
			}
			System.out.println("años " + anios);
		} else if (version == 8) {
			LocalDate nacimiento = LocalDate.of(1956, 10, 3);
			LocalDate actual = LocalDate.now();
			
			Period periodo = Period.between(nacimiento, actual);
			System.out.println("Han transcurrido " + periodo.getYears() + " años, " 
					+ periodo.getMonths() + " meses y "
					+ periodo.getDays() + " dias, "
					+ "desde " + nacimiento + " hasta " + actual);
		}
	} 
	
	public void convertir(int version) throws ParseException {
		if (version == 7) {
			String fecha = "03/10/1956";
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date fechaConvertida = dateFormat.parse(fecha);
			System.out.println(fechaConvertida);
			
			Date fechaActual = Calendar.getInstance().getTime();
			dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a");
			String fechaCadena = dateFormat.format(fechaActual);
			System.out.println(fechaCadena);
		} else if (version == 8) {
			String fecha = "03/10/1956";
			DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate fechaLocal = LocalDate.parse(fecha, dateTimeFormatter);
			System.out.println(fechaLocal);
			System.out.println(dateTimeFormatter.format(fechaLocal));
			
			dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
			System.out.println(dateTimeFormatter.format(fechaLocal));
		}
	}

}
