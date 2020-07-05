package it.begear.esercizi.giorno3.esercizio4;
/*ESERCIZIO 4 - Dati in ingresso tre lati di un triangolo dire
se il triangolo esiste. Un triangolo esiste se ogni lato è 
minore degli altri due.*/
public class Main {

	public static void main(String[] args) {

		try {
			Triangolo triangolo1 = new Triangolo(33, 2, 7);
			System.out.println("triangolo di lati " + triangolo1.getLato1() 
			+ " " + triangolo1.getLato2() + " " + triangolo1.getLato3());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
