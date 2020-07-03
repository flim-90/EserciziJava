package it.begear.esercizi.giorno2.esercizio4;

import java.util.Arrays;

/*ESERCIZIO 4 - Dare in ingresso 3 nomi, metterli in un array, aggiungere il cognome "Torretti" a tutti 
 * e stamparli in ordine alfabetico.*/
public class Main {

	public static void main(String[] args) {
	

		String a = "Franco";
		String b = "Luca";
		String c = "Giovanni";
		
		String[] container = new String[3];
		container[0] = a;
		container[1] = b;
		container[2] = c;
		
		aggiungiCognomeEStampa(container);
		
	}

	public static void aggiungiCognomeEStampa(String[] string) {
		
		for (int i = 0; i < string.length; i++) {
			
			string[i] = string[i].concat(" Torretti");
		}
		
		Arrays.sort(string);
		
		System.out.println(Arrays.toString(string));
		
		
	}
	
	
	
}
