package it.begear.esercizi.giorno2.esercizio14;

public class Persona {

	private String nome;
	
	private static boolean orientamentoAlimentare;

	public Persona(String nome, boolean orientamentoAlimentare) {
		super();
		setNome(nome);
		setOrientamentoAlimentare(orientamentoAlimentare);
	}

	public static boolean getOrientamentoAlimentare() {
		return orientamentoAlimentare;
	}

	public void setOrientamentoAlimentare(boolean orientamentoAlimentare) {
		this.orientamentoAlimentare = orientamentoAlimentare;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
