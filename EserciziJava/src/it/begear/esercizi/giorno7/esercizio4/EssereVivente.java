package it.begear.esercizi.giorno7.esercizio4;

public class EssereVivente {

	private String nome;
	private int statusCellulare;

	public EssereVivente(String nome, int statusCellulare) {
		super();
		setNome(nome);
		setStatusCellulare(statusCellulare);

	}

	public int getStatusCellulare() {
		return statusCellulare;
	}

	public void setStatusCellulare(int statusCellulare) {
		this.statusCellulare = statusCellulare;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
