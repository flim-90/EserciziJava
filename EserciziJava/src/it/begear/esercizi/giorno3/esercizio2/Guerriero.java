package it.begear.esercizi.giorno3.esercizio2;

import java.util.concurrent.ThreadLocalRandom;

public class Guerriero extends Eroe {

	public Guerriero(String nome) {
		super(nome);
		setForza(ThreadLocalRandom.current().nextInt(15, 20 + 1));
		setSaggezza(ThreadLocalRandom.current().nextInt(10, 15 + 1));
		setDestrezza(ThreadLocalRandom.current().nextInt(10, 15 + 1));
	}

}
