package it.begear.esercizi.giorno1.esercizio2;
/* ESERCIZIO 2 – Classe Persona con nome e cognome. 
 * Metodo che restituisce nome e cognome maiuscoli*/

public class Main {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona("franco", "rossi");
		
		
		System.out.println(correttoreMaiuscole(persona1));
		
		
	}
	
	public static String  correttoreMaiuscole(Persona persona) {
		
		
		return persona.getNome().toUpperCase() +" "+ persona.getCognome().toUpperCase();
		
	}
	
	
}
