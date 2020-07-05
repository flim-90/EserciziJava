package it.begear.esercizi.giorno3.esercizio2;

import java.util.concurrent.ThreadLocalRandom;

public abstract class  Eroe {

	private String nome;
	private int forza;
	private int saggezza;
	private int destrezza;
	
	
	public Eroe(String nome) {
		super();
		setNome(nome);
		setForza(ThreadLocalRandom.current().nextInt(10, 20 + 1));
		setSaggezza(ThreadLocalRandom.current().nextInt(10, 20 + 1));
		setDestrezza(ThreadLocalRandom.current().nextInt(10, 20 + 1));
	} 


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getForza() {
		return forza;
	}


	public void setForza(int forza) {
		this.forza = forza;
	}


	public int getSaggezza() {
		return saggezza;
	}


	public void setSaggezza(int saggezza) {
		this.saggezza = saggezza;
	}


	public int getDestrezza() {
		return destrezza;
	}


	public void setDestrezza(int destrezza) {
		this.destrezza = destrezza;
	}
	
	
	
	
}
