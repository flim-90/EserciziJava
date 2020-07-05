package it.begear.esercizi.giorno4.esercizioJolly;

import java.util.Arrays;

/*ESERCIZIO JOLLY (realizzabile anche senza interfacce o classi astratte)
 *  Scrivere un programma che gestisca contenitori. I contenitori possono avere al loro 
interno acido, ammoniaca, acqua o tè. Scrivere un metodo che presi in ingresso un array 
di contenitori e l'indicazione "bevibili" o "nocivi" restituisca un array
filtrato dei contenitori con liquidi bevibili o nocivi.
*/
public class Main {

	public static void main(String[] args) {

		Contenitore contenitore1 = new Contenitore("acido", false);
		Contenitore contenitore2 = new Contenitore("ammoniaca", false);
		Contenitore contenitore3 = new Contenitore("acqua", true);
		Contenitore contenitore4 = new Contenitore("tè", true);

		Contenitore[] scatoloneBevibili = new Contenitore[4];
		Contenitore[] scatoloneTossici = new Contenitore[4];

		scatoloneBevibili[0] = contenitore1;
		scatoloneBevibili[1] = contenitore2;
		scatoloneBevibili[2] = contenitore3;
		scatoloneBevibili[3] = contenitore4;
		
		smistatore(scatoloneBevibili, true);
		
//		System.out.println(scatoloneBevibili[0].getContenuto());
//		System.out.println(scatoloneBevibili[1].getContenuto());
		System.out.println(scatoloneBevibili[2].getContenuto());
		System.out.println(scatoloneBevibili[3].getContenuto());
		
		
	}public static void smistatore(Contenitore[] contenitore1, boolean bevibile) {
		if (bevibile == true) {
			for ( int i = 0; i<contenitore1.length; i++) {
				if (contenitore1[i].isBevibile()  == false) {
					contenitore1[i] = null; 
					
				}
			
			} 
		} else if (bevibile == false) {
			for ( int i = 0; i<contenitore1.length; i++) {
				if (contenitore1[i].isBevibile()  == true) {
					contenitore1[i] =  null;
				}
			
			} 
		}
}
}
