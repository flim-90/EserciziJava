package it.begear.esercizi.giorno2.esercizio14;

public class Alimento {

	private String nome;
	private boolean vegetariano;
	public Alimento(String nome, boolean vegetariano) {
		super();
		setNome(nome);
		setVegetariano(vegetariano);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isVegetariano() {
		return vegetariano;
	}
	public void setVegetariano(boolean vegetariano) {
		this.vegetariano = vegetariano;
	}
	
	
	
}
