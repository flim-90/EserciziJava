package it.begear.esercizi.giorno2.esercizio6;
/*ESERCIZIO 6 - Inserire un giorno della settimana, 
 * per ogni giorno stampare il numero del giorno della settimana corrente.*/
public class Main {

	public static void main(String[] args) {
		
		
		Stampatore("luned�");

	}

 public static void Stampatore(String a){
	
	 switch (a) {
	 	case "luned�":
		System.out.println(" � il 29 giugno");
		break;

		case "marted�":
		System.out.println(" � il 30 giugno");
		break;
		case "mercoled�":
			System.out.println(" � il 1 luglio ");
		break;
		case "gioved�":
			System.out.println(" � il 2 luglio ");
			break;
		case "venerd�":
			System.out.println(" � il 3 luglio ");
			break;
		case "sabato":
			System.out.println(" � il 4 luglio ");
			break;
		case "domenica":
			System.out.println(" � il 5 luglio ");
			break;
		
	}
	
}
}