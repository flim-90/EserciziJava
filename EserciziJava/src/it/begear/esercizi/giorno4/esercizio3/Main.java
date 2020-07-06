package it.begear.esercizi.giorno4.esercizio3;
/*ESERCIZIO 3 - Scrivi un programma che simuli il lancio di un dado e di una moneta
 *  stampandone il risultato. Utilizzare una classe astratta che 
rappresenti i comportamenti comuni degli oggetti dado e moneta istanziati.*/
public class Main {

	public static void main(String[] args) {

		
		Dado dado1 = new Dado("dado di franco");
		dado1.lancioDado();
		Moneta moneta1 = new Moneta("moneta di franco");
		moneta1.lancioMoneta();
		
	}

}
