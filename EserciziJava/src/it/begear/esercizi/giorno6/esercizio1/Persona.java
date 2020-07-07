package it.begear.esercizi.giorno6.esercizio1;

import java.time.LocalDate;

public class Persona {

	private String nome;
	private String cognome;
	private LocalDate compleanno;

	public Persona(String nome, String cognome, int year, int month, int dayOfMonth) {
		super();
		setNome(nome);
		setCognome(cognome);
		setCompleanno(year, month, dayOfMonth);
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

	public LocalDate getCompleanno() {
		return compleanno;
	}

	public void setCompleanno(int year, int month, int dayOfMonth) {
		this.compleanno = compleanno.of(year, month, dayOfMonth);
	}

}
