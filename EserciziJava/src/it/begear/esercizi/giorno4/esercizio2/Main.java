package it.begear.esercizi.giorno4.esercizio2;

/*ESERCIZIO 2 - Scrivere un programma che istanzi opere d'arte identificate dal nome dell'opera,
il nome dell'artista e il loro ingombro. La classe 'opera'
ha anche un metodo equals(Object xobj) che controlla se due opere d'arte sono uguali.
Le opere possono essere quadri e sculture,
i quadri hanno lughezza e altezza e le sculture lunghezza, altezza e profondità.
Inserire le opere d'arte in un array e 
implementare un'interfaccia che calcoli l'ingombro totale delle opere.
*/
public class Main implements Calcolatore {

	public static void main(String[] args) {

		Quadro quadro1 = new Quadro("il mare ", " rufustelli ", 30, 15);
		Quadro quadro2 = new Quadro("la pioggia", "pinotti", 0, 0);
		Scultura scultura1 = new Scultura("il pensatore ", "bartolomei", 40, 70, 22);
		Scultura scultura2 = new Scultura("la zingara rossa ", "cannellini", 15, 22, 55);
		Opera[] opera1 = new Opera[4];
		opera1[0] = quadro1;
		opera1[1] = quadro2;
		opera1[2] = scultura1;
		opera1[3] = scultura2;
		
		/*non me lo lascia usare se non cambio a static calcoloIngombro
		 * calcoloIngombro(opera1);*/

		
	}

	@Override
	public void  calcoloIngombro(Opera[] opera1) {
		
			
			int ingombro = 0;

			for (int i = 0; i < opera1.length; i++) {

				ingombro = ingombro + opera1[i].getIngombro();

			}

			System.out.println("l' ingombro totale delle opere è di " + ingombro);

		}
		
	}
	



