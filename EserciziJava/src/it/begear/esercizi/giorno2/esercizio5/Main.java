package it.begear.esercizi.giorno2.esercizio5;

import java.util.Arrays;

/*ESERCIZIO 5 - Immettere 4 ingredienti come stringhe. Creare due array, uno vuoto e uno con dentro le 4 stringhe.
 Creare un metodo che controlla
se nell'array ci sono "pomodoro", "mozzarella", "lattuga" e
 "spezie" e li mette nel secondo array. 
Nel caso in cui il primo array sia vuoto o diversamente costruito segnalarlo a console.
*/
public class Main {

	public static void main(String[] args) {

		String a = "pomodoro";
		String b = "mozzarella";
		String c = "lattuga";
		String d = "spezie";

		String[] array1 = new String[4];
		String[] array2 = new String[4];

		array1[0] = a;
		array1[1] = b;
		array1[2] = c;
		array1[3] = d;

		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		braccio(array1, array2);
		System.out.println("eseguo");
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
	}

	public static void braccio(String[] lista1, String[] lista2) {

		for (int i = 0; i < lista1.length; i++) {

			if (lista1[i] == "pomodoro" || lista1[i] == "mozzarella" || lista1[i] == "lattuga"
					|| lista1[i] == "spezie") {

				lista1[i] = lista2[i];

			} else if (lista1[i] != "pomodoro" || lista1[i] != "mozzarella" || lista1[i] != "lattuga"
					|| lista1[i] != "spezie") {

				System.out.println("non posso inserire questo alimento");

			} else if (lista1[i] == "" || lista1[i] == null) {

				System.out.println("nessun alimento selezionato");

			}

		}

	}
}
