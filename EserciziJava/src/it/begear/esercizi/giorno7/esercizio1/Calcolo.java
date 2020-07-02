package it.begear.esercizi.giorno7.esercizio1;

import java.util.Scanner;

/*ESERCIZIO 1 - Rendere interattivo il programma calcolatrice.
 *  Attenzione alle divisioni per zero.*/
public class Calcolo {

	public static void main(String[] args) {

		Scanner scannerCalcolatrice = new Scanner(System.in);
		System.out.println("Benvenuto nel calcolatore");
		System.out.print("Inserisci un double su cui effettuare l'operazione: ");
		int numero1 = scannerCalcolatrice.nextInt();
		System.out.println("Inserisci un operatore  tra somma , sottrai , moltiplica e dividi   : ");
		String operatore = scannerCalcolatrice.next();
		System.out.print("Inserisci un double che applichi l'operazione: ");
		int numero2 = scannerCalcolatrice.nextInt();
		System.out.println("eseguo l'operazione richiesta . . . ");
		try {
			System.out.println(calcolx(numero1, numero2, operatore));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" zero non puo' essere usato come divisore");
	}

	static double calcolx(double numero1, double numero2, String operatore) throws Exception {

		if (operatore.equals("somma")) {
			double somma = numero1 + numero2;
			return somma;
		} else if (operatore.equals("dividi"))
			if (numero2 == 0) {
				System.out.println(" zero non puo' essere usato come divisore");
				throw new Exception();
			} else {
				double divisione = numero1 / numero2;
				return divisione;
			}
		else if (operatore.contentEquals("sottrai")) {
			double sottrazione = numero1 - numero2;
			return sottrazione;
		} else if (operatore.contentEquals("moltiplica")) {
			double moltiplicazione = numero1 * numero2;
			return moltiplicazione;
		}
		return 0;

	}

}
