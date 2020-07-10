package it.begear.esercizi.giorno7.esercizio3;

import java.util.Arrays;
import java.util.Scanner;

/*ESERCIZIO 3 - Creare due acquari, uno accoglierà 2 mammiferi marini, l'altro 2 pesci. 
Chiedere in ingresso all'utente le caratteristiche degli animali:
-tipo (mammifero o pesce)
-nome (es "balena" o "tonno")
L'utente deve poter mettere quanti animali vuole in ciascun acquario, ma il sistema 
non deve lasciare che nell'acquario mammiferi ci 
vada un pesce e vice versa.
L'utente deve anche avere la possibilità di stampare a video o su un file 
di testo il contenuto attuale degli acquari.*/
public class Main {

	public static void main(String[] args) {

		Animale[] acquarioPesci = new Animale[2];
		Animale[] acquarioMammiferi = new Animale[2];

		Scanner scannerUtente = new Scanner(System.in);
		String continua = null;
		do {
			System.out.println("Benvenuto nell'acquario ufficiale della Miskatonic University ");
			System.out.println("--------------------------------------------------------------");
			System.out.println("-------inserisci la classe della creatura da creare-----------");
			System.out.println("-------------------Mammifero o Pesce--------------------------");
			String classe = scannerUtente.next();
			System.out.println("---------inserisci il nome della creatura da creare-----------");
			String nome = scannerUtente.next();
			Animale animale1 = new Animale(nome.toLowerCase(), classe.toLowerCase());
			System.out.println("------Abbiamo appena creato un " + classe + " di nome " + nome + " ------");
			System.out.println("Abbiamo a disposizione due acquari, uno per pesci e uno per i mammiferi");
			System.out.println("---vuoi mettere la creatura appena creata dentro uno di questi?--");
			System.out.println("------------------------Yes/No-----------------------------------");
			String decisione = scannerUtente.next();
			if (decisione.toLowerCase().equals("yes") || decisione.toLowerCase().equals("y")) {

				System.out.println("-----Per mettere l'animale nell'acquario di Mammiferi premi M---");
				System.out.println("------Per mettere l'animale nell'acquario di Pesci premi P------");
				String acquarioScelto = scannerUtente.next();
				switch (acquarioScelto.toLowerCase()) {
				case "M":
				case "m":
				case "mammifero":
				case "Mammifero":
					inserisciAnimale(acquarioMammiferi, animale1);
					break;

				case "P":
				case "p":
				case "pesci":
				case "Pesci":
					inserisciAnimale(acquarioPesci, animale1);
					break;
				default:
					System.out
							.println("------Siamo spiacemti ma è pericoloso inserire mammiferi e pesci insieme------");
					System.out
							.println("--------------------------azione non consentita-------------------------------");
					throw new IllegalArgumentException("Unexpected value: " + acquarioScelto.toLowerCase());
				}

			} else if (decisione.toLowerCase().equals("no") || decisione.toLowerCase().equals("n")) {
				System.out.println(
						"----------------nessun problema, verrà messo in una vasca separata------------------");
			}
			System.out.println(
					"----------------Vuoi visualizzare il contentuto delle due vasche principali?------------------");
			System.out.println(
					"-----------------------------------Yes/No------------------------------------------------------");
			String decisione2 = scannerUtente.next();
			if (decisione2.toLowerCase().contentEquals("y") || decisione2.toLowerCase().contentEquals("yes")) {

				System.out.println("----------------ecco l'acquario di mammiferi------------------");
				stampaAcquario(acquarioMammiferi);

				System.out.println("----------------ecco l'acquario di pesci----------------------");
				stampaAcquario(acquarioPesci);
				// da qui creo il Sostitutore String sceltaElimino = scannerUtente.next();
				// aggiungere la possibilità di far combattere le vasche generando mathrandom di attacco e difesa delle
				//creature?

			} else if (decisione2.toLowerCase().contentEquals("n") || decisione2.toLowerCase().equals("no")) {

				System.out.println(
						"-----------------------------------Grazie, alla prossima creatura!---------------------------");

			}
			System.out.println("-----------------------------------Vuoi continuare ?---------------------------");
			System.out.println("-----------------------------------Yes / No---------------------------");
			continua = scannerUtente.next();

		} while (continua.toLowerCase().equals("y") || continua.toLowerCase().equals("yes"));
		System.out.println("-----------------------------------Ottimo lavoro doc---------------------------");

	}

	private static void inserisciAnimale(Animale[] acquario, Animale animale) {
		for (int i = 0; i < acquario.length; i++) {

			if (acquario[i] == null) {
				acquario[i] = animale;
				break;

			}

			else {
				System.out.println("------Siamo spiacemti ma non c'è più spazio nell'acquario------");

			}

		}
	}

	private static void stampaAcquario(Animale[] acquario) {
		for (Animale animale : acquario) {
			if (animale != null) {
				System.out.println(animale.getNome());
			}
		}
	}

	private static void rimuoviAnimale(Animale[] acquario, Animale animale) {

	}

}
