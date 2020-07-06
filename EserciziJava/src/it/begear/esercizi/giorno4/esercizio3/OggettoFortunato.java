package it.begear.esercizi.giorno4.esercizio3;

import java.util.concurrent.ThreadLocalRandom;

public abstract class OggettoFortunato {

	private String nome;

	public OggettoFortunato(String nome) {
		super();
		setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void lancioMoneta() {
		int randomNum = ThreadLocalRandom.current().nextInt(1, 2 + 1);
		if (randomNum == 1) {
		System.out.println("Testa");
		
	} else if (randomNum == 2 ) {
		System.out.println("Croce");
	}
	}
	
	public void lancioDado() {
		int randomNum = ThreadLocalRandom.current().nextInt(1, 6 + 1);
		System.out.println("é uscito " + randomNum);
		
		
	
}}
