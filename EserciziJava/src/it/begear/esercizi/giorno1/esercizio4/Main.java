package it.begear.esercizi.giorno1.esercizio4;
/*ESERCIZIO 4 - Inserire la parola "PrograMatoRRe" e correggerla 
 * in "Programmatore" usando i metodi di String.
 *  Considerare il case.*/

import it.begear.esercizi.giorno1.esercizio2.Persona;

public class Main {

	public static void main(String[] args) {

		String a = "PrograMatoRRe";

		System.out.println(correttoreMaiuscole(a));
		
	}

	public static String  correttoreMaiuscole(String string) {
		return string.replace("MatoRRe", "mmatore");
		
		
		
		
	}

}
