package it.begear.esercizi.giorno3.esercizio2;

import java.util.concurrent.ThreadLocalRandom;

public class Arciere extends Eroe{

	public Arciere(String nome) {
		super(nome);
		setForza(ThreadLocalRandom.current().nextInt(10, 15 + 1));
		setSaggezza(ThreadLocalRandom.current().nextInt(10, 15 + 1));
		setDestrezza(ThreadLocalRandom.current().nextInt(15, 20 + 1));
	}

}
