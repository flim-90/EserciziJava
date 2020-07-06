package it.begear.esercizi.giorno2.esercizio14;
/*ESERCIZIO 14 - Classe Persona con attributo orientamento alimentare (onnivoro, vegetariano).
Dati in ingresso 4 piatti (String) 
Usare il controllo ternario per determinare se una persona consuma il pasto o no.*/

public class Main {

	public static void main(String[] args) {

		Alimento alimento1 = new Alimento("spezie", true);
		Alimento alimento2 = new Alimento("pollo", false);
		Alimento alimento3 = new Alimento("mozzarella", true);
		Alimento alimento4 = new Alimento("bistecca", false);

		Persona persona1 = new Persona("franco", true);
		Persona persona2 = new Persona("luigi", false);

	}

	private static void puòMangiare(Persona persona1, Alimento alimento1) {
		
		// variabile = (espressione) ? True : False
		if (persona1.getOrientamentoAlimentare() == true) {
			String veg = (alimento1.isVegetariano() == true)? "true" : "false";
			/*alimento1.isVegetariano() == true ? 
					System.out.println(persona1 + " può mangiarlo; ") : System.out.println(persona1 + " non può mangiarlo ");*/
		} else if (persona1.getOrientamentoAlimentare() == false) {
			System.out.println(persona1 + " può mangiare tutto; ");
		}
	}

}
