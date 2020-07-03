package it.begear.esercizi.giorno1.esercizio5;
/*ESERCIZIO 5 - Creare due variabili, alla prima si assegna un 
 * numero random da 0 a 100,
 *  alla seconda da 50 a 100 */
public class Main {

	public static void main(String[] args) {
		double a = Math.random() * ( 101 - (-1) );
		double b = Math.random() * ( 101 - (-49));
		System.out.println(a+"    "+b);
	}

}
