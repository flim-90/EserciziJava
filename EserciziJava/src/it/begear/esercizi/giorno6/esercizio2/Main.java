package it.begear.esercizi.giorno6.esercizio2;

/*ESERCIZIO 2 - Dato in ingresso un anno, calcolare la data della Pasqua. 
 * Su Internet c'è la formula.*/
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		System.out.print("Inserisci un anno per calcolare la data di Pasqua\n>");
		Scanner s = new Scanner(System.in);
		int imput = getResult(s);
		while (imput <= 0) {
			System.out.print("non si accettano anni negativi, mi dispiace");
			imput = getResult(s);
		}
		System.out.println(getEasterSundayDate(imput));
	}

	private static int getResult(Scanner s) {
		while (!s.hasNextInt()) {
			System.out.print("Inserire un anno valido, per favore ritentare\n>");
			s.nextLine();
		}
		return s.nextInt();
	}

	public static String getEasterSundayDate(int year) {
		int a = year % 19, b = year / 100, c = year % 100, d = b / 4, e = b % 4, g = (8 * b + 13) / 25,
				h = (19 * a + b - d - g + 15) % 30, j = c / 4, k = c % 4, m = (a + 11 * h) / 319,
				r = (2 * e + 2 * j - k - h + m + 32) % 7, n = (h - m + r + 90) / 25, p = (h - m + r + n + 19) % 32;

		String result;
		switch (n) {
		case 1:
			result = "Gennaio ";
			break;
		case 2:
			result = "Febbraio ";
			break;
		case 3:
			result = "Marzo ";
			break;
		case 4:
			result = "Aprile ";
			break;
		case 5:
			result = "Maggio ";
			break;
		case 6:
			result = "Giugno ";
			break;
		case 7:
			result = "Luglio ";
			break;
		case 8:
			result = "Agosto ";
			break;
		case 9:
			result = "Settembre ";
			break;
		case 10:
			result = "Ottobre ";
			break;
		case 11:
			result = "Novembre ";
			break;
		case 12:
			result = "Dicembre ";
			break;
		default:
			result = "Errore";
		}

		return result + p;
	}
}