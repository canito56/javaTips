package com.jb.array.arraylist;

import java.util.Arrays;
import java.util.List;

public class StringToArrayList {

	public static void main(String[] args) {
		String displayedColumns = "ola,che,viejo,puto";
//		String displayedColumns = "purchaseOrder,shipperName,consigneeName,finalCustomerName,mawb,hawb,fullBoxes,pieces,options";
		
		// Convierte String a ArrayList sacándole las comas con las que viene.
//		ArrayList<String> dcl = new ArrayList<>(Arrays.asList(displayedColumns.split(",")));
		List<String> dcl = Arrays.asList(displayedColumns.split(","));
		
		System.out.println("dcl: " + dcl + "   dcl.size() = " + dcl.size() + "   dcl.isEmpty() = " + dcl.isEmpty());
		
		System.out.println();
		System.out.println("imprimir dcl con for: ");
		for (String dc : dcl) {
			System.out.println("dc: " + dc);
		}
		
		System.out.println();
		System.out.println("imprimir dcl con lambda: ");
		dcl.stream().forEach(System.out::println);
		
		// buscar un string en el ArrayList
		String columnName = "consigneeName";
		System.out.println();
		System.out.println("busca columnName en dcl: ");
		if (dcl.contains(columnName)) 
			System.out.println("lo encontró nomás!!");
		else
			System.out.println("No está cheeeee!!");
	}

}
