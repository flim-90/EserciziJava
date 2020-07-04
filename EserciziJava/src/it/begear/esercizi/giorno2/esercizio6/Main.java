package it.begear.esercizi.giorno2.esercizio6;
/*ESERCIZIO 6 - Inserire un giorno della settimana, 
 * per ogni giorno stampare il numero del giorno della settimana corrente.*/
public class Main {

	public static void main(String[] args) {
		
		
		Stampatore("lunedì");

	}

 public static void Stampatore(String a){
	
	 switch (a) {
	 	case "lunedì":
		System.out.println(" è il 29 giugno");
		break;

		case "martedì":
		System.out.println(" è il 30 giugno");
		break;
		case "mercoledì":
			System.out.println(" è il 1 luglio ");
		break;
		case "giovedì":
			System.out.println(" è il 2 luglio ");
			break;
		case "venerdì":
			System.out.println(" è il 3 luglio ");
			break;
		case "sabato":
			System.out.println(" è il 4 luglio ");
			break;
		case "domenica":
			System.out.println(" è il 5 luglio ");
			break;
		
	}
	
}
}