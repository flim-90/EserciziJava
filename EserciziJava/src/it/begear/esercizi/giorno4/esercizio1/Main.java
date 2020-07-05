package it.begear.esercizi.giorno4.esercizio1;
/*ESERCIZIO 1 - Realizza un programma che sia in grado di valutare il volume di cilindri
 *  e parallelepipedi basandosi sul valore della 
loro area di base e dell'altezza. Delegare i metodi comuni, come il calcolo e
 la stampa del volume ad una classe astratta.*/
public class Main {

	public static void main(String[] args)   {

		
		Cilindro cilindro1 = new Cilindro(22, 44);
		Parallelepipedo parallelepipedo1 = new Parallelepipedo(55,55);
		cilindro1.calcoloAreaCilindo(cilindro1);
		
	}

}
