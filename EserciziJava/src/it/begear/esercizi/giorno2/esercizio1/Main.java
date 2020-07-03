package it.begear.esercizi.giorno2.esercizio1;
/*ESERCIZIO 1 – Dati due rettangoli, calcolarne l’area e mandare 
in uscita da un metodo qual è il più grande.
*/
public class Main {

	public static void main(String[] args) {
		
		Rettangolo rettangolo1 = new Rettangolo(44,7);
		Rettangolo rettangolo2 = new Rettangolo(55,8);
		comparatore(rettangolo1, rettangolo2);
		
		
	}

	public static void comparatore(Rettangolo rettangolo1, Rettangolo rettangolo2) {
		
		if (rettangolo1.Area(rettangolo1) > rettangolo2.Area(rettangolo2)) {
			
			System.out.println("il rettangolo 1 è maggiore del rettangolo 2");
			
		}  else if (rettangolo2.Area(rettangolo2) > rettangolo1.Area(rettangolo1)) {
			
			System.out.println("il rettangolo 2 è maggiore del rettangolo 1");
			
		} else {
			System.out.println("il rettangolo 1 è uguale al rettangolo 2");
		}
		
		
	}
	
	
	
}
