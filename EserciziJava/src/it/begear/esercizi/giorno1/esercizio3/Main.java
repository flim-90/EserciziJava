package it.begear.esercizi.giorno1.esercizio3;
/*ESERCIZIO 3 – Classe portafoglio con attributo un valore in 
 denaro euro,centesimi. 
Calcolarne una percentuale a piacere usando valore 
e percentuale come dati di ingresso di un metodo.*/
public class Main {

	public static void main(String[] args) {
	
		double percentuale1 = 55.1;
		Portafogli portafogli1 = new Portafogli(68);
		
		
		System.out.println(percentuale(portafogli1, percentuale1));
		

	}

	private static double percentuale(Portafogli portafogli, Double percentuale) {
		return (portafogli.getValore() / 100 * percentuale);}
	
	
}
