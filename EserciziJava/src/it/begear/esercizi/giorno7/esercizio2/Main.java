package it.begear.esercizi.giorno7.esercizio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

/*ESERCIZIO 2 - Scrivere un programma che stampi a console Eclipse e su un file 
 * di testo la lista di file di una directory del vostro hard disk. La directory viene 
fornita in input dall'utente.
*/
public class Main {

	public static void main(String[] args) {
		// istanzo la classe file con la directory di riferimento
		File dir = new File("C:\\Users\\39345\\Documents\\Corso_Java\\");
		// istanzo il file e successivamente lo creo
		File dir1 = new File("C:\\Users\\39345\\Documents\\Corso_Java\\test.txt");
		// devo creare ora il file su cui scrivere
		try {
			dir1.createNewFile();
		} catch (IOException e1) {

			e1.printStackTrace();
		}
		// mando il metodo per listare in una directory
		aiutoDeiFile(dir);
		System.out.println(Arrays.toString(aiutoDeiFile(dir)));
		
		FileWriter fw = null;
		try {
			fw = new FileWriter(dir1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String[] listafatta = aiutoDeiFile(dir);
		
		try {
			fw.write(Arrays.toString(listafatta));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

	// metodo per listare i file in directory
	public static void listaDeiFile(File dir) {
		for (File file1 : dir.listFiles()) {
			if (file1.isDirectory()) {
				listaDeiFile(file1);
			} else {
				System.out.println(file1.getName());
			}
		}
	}

	public static String[] aiutoDeiFile(File dir) {
		String contents[] = dir.list();
		return contents;
	}
	
}
