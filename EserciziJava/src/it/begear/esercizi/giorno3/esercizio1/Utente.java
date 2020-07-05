package it.begear.esercizi.giorno3.esercizio1;

public class Utente {
	private String nome;
	private String cognome;
	private int eta;

	public Utente(String nome, String cognome, int eta) {
		super();
		setNome(nome);
		setCognome(cognome);
		try {
			setEta(eta);
		} catch (Exception e) {
			System.out.println(" età inserita non valida");
			e.printStackTrace();
		}
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

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) throws Exception {

		if (eta > 18) {
			this.eta = eta;
		} else {
			throw new Exception();
		}
		

	}

}
