package it.begear.esercizi.giorno6.esercizio1;

import java.time.LocalDate;

/*ESERCIZIO 1 - Classe 'Persona' con nome, congome e compleanno chiesti in ingresso.
 *  Mettere le persone dentro un array e stamparlo. Un utente può indicare
un compleanno e gli vengono fornite le persone che compiono gli anni in quella data.*/
public class Main {

	public static void main(String[] args) {

		Persona persona1 = new Persona("franco", "rossi", 1999, 6, 13);
		//System.out.println(persona1.getCompleanno());
		Persona persona2 = new Persona("paolo", "bianchi", 1980, 5, 17);
		Persona persona3 = new Persona("luca", "paoletti", 1999, 3, 14);
		Persona persona4 = new Persona("hero", "nukushima", 1999, 1, 1);
		Persona persona5 = new Persona("robert", "smith", 1999, 6, 13);
		Persona[] listaCompleanni = new Persona[5];
		listaCompleanni[0] = persona1;
		listaCompleanni[1] = persona2;
		listaCompleanni[2] = persona3;
		listaCompleanni[3] = persona4;
		listaCompleanni[4] = persona5;
		
		
		LocalDate compleannoCheck = LocalDate.of(1999, 6, 13);
		getCompleanni(compleannoCheck, listaCompleanni);
		getNome("franco", listaCompleanni);
 		
		
	} public static void getCompleanni(LocalDate compleanno, Persona[] listaCompleannix) {
		
		for (int i = 0; i < listaCompleannix.length; i++) {
			
			if (listaCompleannix[i].getCompleanno().isEqual(compleanno)) {
				
				System.out.println((listaCompleannix[i].getNome())+" " +(listaCompleannix[i].getCognome())+" "
				+ (listaCompleannix[i].getCompleanno()));
				
			}
			
		}

		
	}public static void getNome(String nome, Persona[] listaCompleannix) {
		
		for (int i = 0; i < listaCompleannix.length; i++) {
			
			if (listaCompleannix[i].getNome() == nome) {
				
				System.out.println((listaCompleannix[i].getNome())+" " +(listaCompleannix[i].getCognome())+" "
				+ (listaCompleannix[i].getCompleanno()));
				
			}
			
		}
		
		
		
		
		
	}
	
	

}
