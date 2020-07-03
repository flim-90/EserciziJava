package it.begear.esercizi.giorno1.esercizio6;

/* ESERCIZIO 6 - Inseriti due punti su un asse cartesiano 
 * determinarne la distanza*/
public class Main {

	public static void main(String[] args) {

		CoordinataCartesiana coordinataCartesiana1 = new CoordinataCartesiana(2.4, 7);
		CoordinataCartesiana coordinataCartesiana2 = new CoordinataCartesiana(55, 7.4);

		System.out.println(distanzaTraDuePunti(coordinataCartesiana1, coordinataCartesiana2));

	}

	public static double distanzaTraDuePunti(CoordinataCartesiana coordinataCartesiana,
			CoordinataCartesiana coordinataCartesiana2) {

		return Math.sqrt((coordinataCartesiana2.getX() - coordinataCartesiana.getX())
				* (coordinataCartesiana2.getX() - coordinataCartesiana.getX())
				+ (coordinataCartesiana2.getY() - coordinataCartesiana.getY())
						* (coordinataCartesiana2.getY() - coordinataCartesiana.getY()));

	}
}
