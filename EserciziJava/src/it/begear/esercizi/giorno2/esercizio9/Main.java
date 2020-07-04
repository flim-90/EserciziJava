package it.begear.esercizi.giorno2.esercizio9;

import java.util.Arrays;

/*ESERCIZIO 9 - Inserire delle stringhe in un array e restituire 
quelle che cominciano con una maiuscola.*/
public class Main {

	public static void main(String[] args) {

		String[] arrayDiStringhe = new String[5];
		String a = "franco";
		String b = "Luca";
		String c = "GIOVANNI";
		String d = "michela";
		String e = "MONICA";
		arrayDiStringhe[0] = "franco";
		arrayDiStringhe[1] = "Luca";
		arrayDiStringhe[2] = "GIOVANNI";
		arrayDiStringhe[3] = "michela";
		arrayDiStringhe[4] = "MONICA";
		
try {
		verificaMaiuscola(arrayDiStringhe);} catch (Exception e1) {}

	}

	public static void verificaMaiuscola(String[] arrayDiStringhe) {
		// str.substring(0, 1).toUpperCase()
		for (int i = 0; i < arrayDiStringhe.length; i++) {

			if (arrayDiStringhe[i].substring(0, 1).equals(arrayDiStringhe[i].substring(0, 1).toUpperCase())) {

				System.out.println(arrayDiStringhe[i]);
			} else {

				System.out.println("nope " + arrayDiStringhe[i]);

			}

		}

	}
}
