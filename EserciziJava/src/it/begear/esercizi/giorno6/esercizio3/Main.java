package it.begear.esercizi.giorno6.esercizio3;

import java.time.LocalDate;

/*ESERCIZIO 3 - Fornite in ingresso 3 date specifiche, manipolarle per 
 * trasformarle tutte in 29 settembre 1979*/
public class Main {

	public static void main(String[] args) {
		LocalDate data1 = LocalDate.of(1999, 12, 1);
		LocalDate data2 = LocalDate.of(2000, 11, 15);
		LocalDate data3 = LocalDate.of(1700, 5, 30);
		System.out.println(data1);
		modificatoreDate(data1);
		System.out.println(modificatoreDate(data1));
		
		
		
	} public static LocalDate  modificatoreDate(LocalDate data) {
		
		return  LocalDate.of(1979, 7, 29);
		/*LocalDate x = LocalDate.of(1979, 9, 29);
		System.out.println("ouch!");
		x = data;
		data.equals(x);
		return data;*/
		
	
	}

}
