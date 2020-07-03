package it.begear.esercizi.giorno2.esercizio2;

import java.util.Arrays;

/*ESERCIZIO 2 – Dati in ingresso quattro numeri double.
Un metodo prende i due più piccoli e ne fa il modulo.
Un altro  prende i due più piccoli e li somma, ma restituisce un intero.
Un terzo prende i risultati dei due metodi precedenti e li mostra entrambi.*/

public class Main {

	public static void main(String[] args) {
		double a = 55.1;
		double b = 43.5;
		double c = 33.5;
		double d = 77;

		System.out.println("Faccio il modulo tra i due numeri più piccoli " + moduloDuePiuPiccoli(a, b, c, d));
		System.out.println("Faccio la somma tra i due numeri più piccoli " + sommaDuePiuPiccoli(a, b, c, d));
		stampaModuloESomma(a, b, c, d);
	}

	public static double moduloDuePiuPiccoli(double a, double b, double c, double d) {
		double[] contenitore = new double[4];
		contenitore[0] = a;
		contenitore[1] = b;
		contenitore[2] = c;
		contenitore[3] = d;
		Arrays.sort(contenitore);

		return (contenitore[0] % contenitore[1]);

	}

	public static int sommaDuePiuPiccoli(double a, double b, double c, double d) {
		double[] contenitore = new double[4];
		contenitore[0] = a;
		contenitore[1] = b;
		contenitore[2] = c;
		contenitore[3] = d;
		Arrays.sort(contenitore);

		return (int) (contenitore[0] + contenitore[1]);

	}  public static void stampaModuloESomma(double a, double b, double c, double d) {
		System.out.println("il modulo tra i due è " + moduloDuePiuPiccoli(a, b, c, d) + " e la somma è " + sommaDuePiuPiccoli(a, b, c, d));
		sommaDuePiuPiccoli(a, b, c, d);
	
	
	
	}
}
