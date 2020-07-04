package it.begear.esercizi.giorno2.esercizio7;
/*ESERCIZIO 7 - Inserire un intero diverso da zero che diventa 
 * il numero di volte che viene eseguito un ciclo, ogni volta 
 * il ciclo stampa "BLA" seguito dal numero dell'iterazione
 */

public class Main {

	public static void main(String[] args) {
		
		
		ciclatore(77);

	} public static void  ciclatore(int i) {
		
		for(int j = 1; j < i; j++) {
			
			System.out.println(j + "    BLA!");
			
		}
		
		
		
	}
	
	

}
