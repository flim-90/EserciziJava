package it.begear.esercizi.giorno1.esercizio2;

public class Persona {

	private String nome;
	private String cognome;

	public Persona(String nome, String cognome) {
		super();
		setNome(nome);
		setCognome(cognome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

}
