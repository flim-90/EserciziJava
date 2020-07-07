package it.begear.esercizi.giorno5.esercizio5;

/*ESERCIZIO 5 - Programma che riempie un array di numeri progressivi e solleva
 *  una eccezione se viene inserito un numero più basso del precedente*/
public class Main {

	public static void main(String[] args) {

		int[] array1 = new int[4];

		try {
			riempiArray(array1, 0, 1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			riempiArray(array1, 1, 2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		 try { riempiArray(array1, 2, 3); } catch (Exception e) { e.printStackTrace();
		 } try { riempiArray(array1, 3, 1); } catch (Exception e) {
		  e.printStackTrace(); }
		 

	}

	public static void riempiArray(int[] array, int indice, int dato) throws Exception {
		if (indice == 0) {
			array[indice] = dato;
		} else {
			for (int i = 0; i < array.length; i++) {
				if (dato < array[indice - 1]) {
					throw new Exception();

				} else {
					array[indice] = dato;
				}
			}
		}

	}

}
