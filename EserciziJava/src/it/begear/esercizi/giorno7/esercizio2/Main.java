package it.begear.esercizi.giorno7.esercizio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*ESERCIZIO 2 - Scrivere un programma che stampi a console Eclipse e su un file 
 * di testo la lista di file di una directory del vostro hard disk. La directory viene 
fornita in input dall'utente.
*/
public class Main {

	public static void main(String[] args) {
		//istanzo la classe file con la directory di riferimento
		File dir = new File("C:\\Users\\39345\\Documents\\Corso_Java\\Lezione_1");
		//mando il metodo per listare in una directory
		listaDeiFile(dir);
		
		try {
			FileReader reader = new FileReader(dir);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	//metodo per listare i file in directory
	public static void listaDeiFile(File dir) {
		for (File file1 : dir.listFiles()) {
			if (file1.isDirectory()) {
				listaDeiFile(file1);
			} else {
				System.out.println(file1.getName());
			}
		}
	}

}
