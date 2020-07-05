package it.begear.esercizi.giorno4.esercizio1;

public class Cilindro extends Calcolatore{

	private int base;
	private int altezza;
	public Cilindro(int base, int altezza) {
		super();
		setBase(base);
		setAltezza(altezza);
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltezza() {
		return altezza;
	}
	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}
	@Override
	public int calcoloAreaCilindo(Cilindro cilindro) {
		System.out.println(3*cilindro.getAltezza()*(cilindro.getBase()/2)*(cilindro.getBase()/2));
		return 3*cilindro.getAltezza()*(cilindro.getBase()/2)*(cilindro.getBase()/2);
	}
	
	
	
}
