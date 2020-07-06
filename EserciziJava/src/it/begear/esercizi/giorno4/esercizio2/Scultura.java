package it.begear.esercizi.giorno4.esercizio2;

public class Scultura extends Opera {

	private int lunghezza;
	private int larghezza;
	private int profondita;
	
	public Scultura(String nomeOpera, String nomeArtista, int lunghezza, int larghezza, int profondita) {
		super(nomeOpera, nomeArtista);
		setLunghezza(lunghezza);
		setLarghezza(larghezza);
		setProfondita(profondita);
		setIngombro(lunghezza*larghezza*profondita);
	}

	public int getLunghezza() {
		return lunghezza;
	}

	public void setLunghezza(int lunghezza) {
		this.lunghezza = lunghezza;
	}

	public int getLarghezza() {
		return larghezza;
	}

	public void setLarghezza(int larghezza) {
		this.larghezza = larghezza;
	}

	public int getProfondita() {
		return profondita;
	}

	public void setProfondita(int profondita) {
		this.profondita = profondita;
	}

	@Override
	public void checker(Opera opera, Opera opera1) {
		
		super.checker(opera, opera1);
	}
	
	
	
	
}
