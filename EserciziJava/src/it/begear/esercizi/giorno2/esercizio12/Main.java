package it.begear.esercizi.giorno2.esercizio12;

import java.util.concurrent.ThreadLocalRandom;

/*ESERCIZIO 12 - Dati in ingresso 4 numeri casuali da 0 a 10 
determina se ce ne sono di uguali, 
poi restituisce prima il più grande poi il più piccolo.
*/
public class Main {

	public static void main(String[] args) {

		int randomNum1 = ThreadLocalRandom.current().nextInt(0,11);
		int randomNum2 = ThreadLocalRandom.current().nextInt(0,11);
		int randomNum3 = ThreadLocalRandom.current().nextInt(0,11);
		int randomNum4 = ThreadLocalRandom.current().nextInt(0,11);
		
		numeratore(randomNum1, randomNum2, randomNum3, randomNum4);
		
	}

	public static void numeratore(int int1, int int2, int int3, int int4) {
		if (int1 == int2) {
			System.out.println(int1 + " è uguale a " + int2);
		} 
		if (int1 == int3) {
			System.out.println(int1 + " è uguale a " + int3);
		}  
		if (int1 == int4) {
			System.out.println(int1 + " è uguale a " + int4);
		} 
		if (int2 == int1) {
			System.out.println(int2 + " è uguale a " + int1);
		} 
		if (int2 == int3) {
			System.out.println(int2 + " è uguale a " + int3);
		} 
		if (int2 == int4) {
			System.out.println(int2 + " è uguale a " + int4);
		} 
		if (int3 == int1) {
			System.out.println(int3 + " è uguale a " + int1);
		} 
		if (int3 == int2) {
			System.out.println(int3 + " è uguale a " + int2);
		} 
		if (int3== int4) {
			System.out.println(int3 + " è uguale a " + int4);
		} 
		if (int4 == int1) {
			System.out.println(4 + " è uguale a " + int1);
		} 
		if (int4 == int2) {
			System.out.println(int4 + " è uguale a " + int2);
		} 
		if (int4== int2) {
			System.out.println(int4 + " è uguale a " + int2);
		} 
		if (int1 < int2 && int1 < int3 && int1 < int4 ) {
			System.out.println(int1 + " è il più piccolo");
		} 
		if (int2 < int1 && int2 < int3 && int2 < int4 ) {
			System.out.println(int2 + " è il più piccolo");
		} 
		if (int3 < int1 && int3 < int2 && int3 < int4 ) {
			System.out.println(int3 + " è il più piccolo");
		} 
		if (int4 < int1 && int4 < int2 && int4 < int3 ) {
			System.out.println(int4 + " è il più piccolo");
		} 
		if (int1 > int2 && int1 > int3 && int1 > int4 ) {
			System.out.println(int1 + " è il più grande");
		} 
		if (int2 > int1 && int2 > int3 && int2 > int4 ) {
			System.out.println(int2 + " è il più grande");
		} 
		if (int3 > int1 && int3 > int2 && int3 > int4 ) {
			System.out.println(int3 + " è il più grande");
		} 
		if (int4 > int1 && int4 > int2 && int4 > int3 ) {
			System.out.println(int4 + " è il più grande");
		}
	}

}
