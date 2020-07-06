package it.begear.esercizi.giorno4.esercizio2;

public class Quadro extends Opera {
	
	
	private int altezza;
	private int lunghezza;
	
	

	public Quadro(String nomeOpera, String nomeArtista, int altezza, int lunghezza) {
		super(nomeOpera, nomeArtista);
		setIngombro(lunghezza*altezza);
		setAltezza(altezza);
		setLunghezza(lunghezza);
		
	}

	public int getAltezza() {
		return altezza;
	}

	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}

	public int getLunghezza() {
		return lunghezza;
	}

	public void setLunghezza(int lunghezza) {
		this.lunghezza = lunghezza;
	}
	
	
	@Override
	public void checker(Opera opera, Opera opera1) {
		
		super.checker(opera, opera1);
	}
	
}
