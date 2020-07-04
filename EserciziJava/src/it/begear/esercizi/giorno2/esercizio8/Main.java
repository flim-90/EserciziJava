package it.begear.esercizi.giorno2.esercizio8;

import java.util.Arrays;

/*ESERCIZIO 8 - Costruire un array di interi, 
ordinarlo e stampare tutti gli elementi*/
public class Main {

	public static void main(String[] args) {

		int[] arrayDiInt = new int[6];
		arrayDiInt[0]= 1;
		arrayDiInt[1]= 11;
		arrayDiInt[2]= 41;
		arrayDiInt[3]= 71;
		arrayDiInt[4]= 16;
		arrayDiInt[5]= 77;
		
		
		stampaEOrdina(arrayDiInt);
		
	}
	
	
public static void stampaEOrdina(int[] inyr) {
		Arrays.sort(inyr);
		System.out.println((Arrays.toString(inyr)));
	}
	
	
} 
