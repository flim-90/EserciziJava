package it.begear.esercizi.giorno5.esercizio2;
/*ESERCIZIO 2 - Scrivere un programma che gestisce l'inserimento dei dati in un array 
 e solleva una eccezione gestita quando viene superata la dimensione dell'array*/
public class Main {

	public static void main(String[] args) {
		

		int[] array1 = new int[4];
		try {
			addToArray(array1, 0, 1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			addToArray(array1, 1, 66);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			addToArray(array1, 2, 55);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			addToArray(array1, 3, 22);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			addToArray(array1, 4, 11);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
	} public static void addToArray(int[] array, int indice, int dato) throws Exception {
		if (indice < array.length) {
		array[indice] = dato;} else {
			throw new Exception();
		}
		
	}

}
