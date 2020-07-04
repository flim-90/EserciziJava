package it.begear.esercizi.giorno2.esercizio13;

/*ESERCIZIO 13 - Dato in ingresso un numero tra 1 e 7 
 * restituisce il giorno della settimana relativo. Usare switch*/
public class Main {

	public static void main(String[] args) {
		abbinatore(3);
	}

	public static void abbinatore(int int1) {

		switch (int1) {
		case 1: {

			System.out.println("lunedì");
			break;

		}
		case 2: {
			System.out.println("martedì");
			break;

		}
		case 3: {

			System.out.println("mercoledì");
			break;
		}
		case 4: {
			System.out.println("giovedì");
			break;

		}
		case 5: {
			System.out.println("venerdì");
			break;

		}
		case 6: {
			System.out.println("sabato");
			break;

		}
		case 7: {

			System.out.println("domenica");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + int1);
		}

	}
}
