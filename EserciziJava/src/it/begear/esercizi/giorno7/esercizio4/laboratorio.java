package it.begear.esercizi.giorno7.esercizio4;

import java.util.ArrayList;
import java.util.Scanner;

/*ESERCIZIO 4 - Programma di analisi cellulare. Dare in ingresso degli esseri viventi
(animali, piante, batteri) che hanno il parametro int 'cellula' che può
essere valorizzato solo con un numero da 1 a 100 che decide l'utente.
Da 1 a 50 l'essere è sano, da 51 a 100 è malato.
Creare una sonda che analizza le cellule degli esseri vienti inseriti e 
li mette in due liste separate di sani e malati*/
public class laboratorio {

	public static void main(String[] args) throws Exception {

		Scanner scannerUtente = new Scanner(System.in);
		System.out.println("Benvenuto nel laboratorio di malattie cellulari della Miskatonic University ");
		System.out.println("Inserisci il tipo di creatura da zombizzare");
		String nome = scannerUtente.next();
		System.out.println("Inserisci la quantità di siero da somministrare (da 1 a 100)");
		int siero = scannerUtente.nextInt();
		EssereVivente essereVivente1 = new EssereVivente(nome, siero);
		System.out.println("Abbiamo somministrato " + siero + " ml di siero a " + nome);
		ArrayList<EssereVivente> listaMalati = new ArrayList<EssereVivente>();
		ArrayList<EssereVivente> listaSani = new ArrayList<EssereVivente>();
		System.out.println(
				"Desideri utilizzare la sonda per verificare lo stato di zombieficazione di " + nome + " ?  Y/N");
		String risposta = scannerUtente.next();
		try {
			if (risposta.equals("Y") || risposta.equals("y") || risposta.equals("Yes") || risposta.equals("yes")) {
				try {
					sonda(essereVivente1, listaMalati, listaSani);
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (risposta.equals("N") || risposta.equals("n") || risposta.equals("no") || risposta.equals("No")) {
				System.out.println("Grazie e arrivederci!");
			} else {
				System.out.println("non ho capito");
				throw new Exception();
			}
		} catch (Exception e) {
		}
	}
	public static void sonda(EssereVivente essereVivente, ArrayList esseriMalati, ArrayList esseriSani)
			throws Exception {
		try {
			if (essereVivente.getStatusCellulare() >= 50 && essereVivente.getStatusCellulare() > 0) {
				esseriMalati.add(essereVivente);
				System.out.println(essereVivente.getNome() + ": ora è uno zombie! è stato messo/a in quarantena;");
				System.out.println("Grazie e arrivederci!");
			} else if (essereVivente.getStatusCellulare() < 50 && essereVivente.getStatusCellulare() > 0) {
				esseriSani.add(essereVivente);
				System.out.println(essereVivente.getNome() + ": è ancora sano, è possibile liberarlo, se ti fidi;");
				System.out.println("Grazie e arrivederci!");
			} else {
				System.out.println("parametro siero invalido");
				throw new Exception();
			}
		} catch (Exception e) {
		}
	}

}
