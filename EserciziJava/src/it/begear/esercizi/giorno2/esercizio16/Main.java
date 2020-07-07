package it.begear.esercizi.giorno2.esercizio16;
/*ESERCIZIO 16 - Dati in ingresso tre numeri, determinare se sono tutti uguali,
 *  uno diverso o tutti diversi.*/
public class Main {

	public static void main(String[] args) {
		
		
		
		numChecker(1, 33, 1);
		
		
	} public static void numChecker(int a, int b, int c) {
		
		if (a==b && a==c) {
			
			System.out.println("sono tutti e tre uguali");
		} else if (a==b && a!=c){
			System.out.println("il primo numero è uguale al secondo");
		} else if (a!=b && a==c){
			System.out.println("il primo numero è uguale al terzo");
		} else if (a!=b && b==c){
			System.out.println("il primo secondo è uguale al terzo");
		} else if (a!=b && b!=c && c!=a){
			System.out.println("tutti i numeri sono diversi");
		}
		
		
		
	}

}
