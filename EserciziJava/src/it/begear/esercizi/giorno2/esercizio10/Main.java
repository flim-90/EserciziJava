package it.begear.esercizi.giorno2.esercizio10;
/*ESERCIZIO 10 - Dati in ingresso 4 numeri casuali, 
determinare se sono pari o dispari o lo zero
*/
public class Main {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		int c = 2;
		int d = 3;
		getInfo(a);
		getInfo(b);
		getInfo(c);
		getInfo(d);
	}
	
	public static void getInfo(int a) {
		
		if ((a%2) == 0) {
			
			System.out.println("il numero" + a +" è pari");
		} else if (a == 0) {
			
			System.out.println("il numero" + a +" è 0");
			
		} else {
			
			System.out.println("il numero" + a +" è dispari");
			
		}
		
		
		
		
	}

}
