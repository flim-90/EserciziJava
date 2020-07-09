package it.begear.esercizi.giorno7.esercizio3;

public class Animale {

	private String nome;
	private String classe;

	public Animale(String nome, String classe) {
		super();
		setNome(nome);
		setClasse(classe);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

}
