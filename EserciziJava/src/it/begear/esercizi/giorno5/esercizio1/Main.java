package it.begear.esercizi.giorno5.esercizio1;
/*ESERCIZIO 1 - Scrivere un programma che fa divisioni di due numeri interi in ingresso
 *  e che gestisce la divisione per zero*/
public class Main {

	public static void main(String[] args) {
		
		
		try {
			divisione(11,0);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		

	} public static void divisione(int a, int b) throws Exception {
		if (b!=0) {
		System.out.println(a/b);
		} else {
			System.out.println("il divisore non può essere 0");
			throw new Exception();
		
		}
	}
}
