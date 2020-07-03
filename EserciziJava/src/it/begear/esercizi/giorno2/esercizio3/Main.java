package it.begear.esercizi.giorno2.esercizio3;

import java.util.Arrays;

/*ESERCIZIO 3 - Inserire un intero 'dimensione array'. Creare un array e 
 * riempirlo di numeri incrementali da 0 in poi fino a che l'array risulta pieno.*/


public class Main {

	public static void main(String[] args) {
		
		int[] numeratore = new int[100];
		
		
		for (int i = 0; i < numeratore.length; i++) {
			
			
			numeratore[i] = i;
			
			
		}
		
		
		System.out.println(Arrays.toString(numeratore));

	}

}
