package com.jb.array.arraylist;

import java.util.Arrays;
import java.util.List;

public class StringToArrayList {

	public static void main(String[] args) {
		String displayedColumns = "";
//		String displayedColumns = "purchaseOrder,shipperName,consigneeName,finalCustomerName,mawb,hawb,fullBoxes,pieces,options";
		
		// Convierte String a ArrayList sacándole las comas con las que viene.
//		ArrayList<String> dcl = new ArrayList<>(Arrays.asList(displayedColumns.split(",")));
		List<String> dcl = Arrays.asList(displayedColumns.split(","));
		
		System.out.println("dcl: " + dcl + "   dcl.size() = " + dcl.size() + "   dcl.isEmpty() = " + dcl.isEmpty());

		for (String dc : dcl) {
			System.out.println("dc: " + dc);
		}
		
		// buscar un string en el ArrayList
		String columnName = "consigneeName";
		
		if (dcl.contains(columnName)) 
			System.out.println("lo encontró nomás!!");
		else
			System.out.println("No está cheeeee!!");
	}

}
