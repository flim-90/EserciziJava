package it.begear.esercizi.giorno2.esercizio11;

/*ESERCIZIO 11 - Date in ingresso tre stringhe 
determina la più lunga e la più breve*/
public class Main {

	public static void main(String[] args) {

		String a = "The Old one's";
		String b = "The mystery man";
		String c = "Nazgoth";

		System.out.println(a.length());
		System.out.println(b.length());
		System.out.println(c.length());
		comparatoreStringhe(a, b, c);

	}

	public static void comparatoreStringhe(String a, String b, String c) {

		int x = a.length();
		int y = b.length();
		int z = c.length();

		if (x > y && x > z) {

			System.out.println(" La Prima String è la più lunga");

		} else if (x < y && x < z) {

			System.out.println(" La Prima String è la più corta");

		} else if (y > x && y > z) {

			System.out.println(" La Seconda String è la più lunga");

		} else if (y < x && y < z) {

			System.out.println(" La Seconda String è la più corta");

		} else if (z > x && z > y) {

			System.out.println(" La Terza String è la più lunga");

		} else if (z < x && z < y) {

			System.out.println(" La Terza String è la più corta");

		}

	}

}
