package it.begear.esercizi.giorno4.esercizio4;

public class Oggetto implements InterfacciaDiCalcolo{

	private int valore;
	
	

	public Oggetto(int valore) {
		super();
		setValore(valore);
	}
	
	

	public int getValore() {
		return valore;
	}



	public void setValore(int valore) {
		this.valore = valore;
	}



	@Override
	public int getQuadrato() {
		System.out.println(valore*valore);
		return valore*valore;
		
	}

	@Override
	public int getCubo() {
		System.out.println(valore*valore*valore);
		return valore*valore*valore;
	}
	
	
}
