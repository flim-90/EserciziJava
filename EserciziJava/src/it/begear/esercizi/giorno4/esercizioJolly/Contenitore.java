package it.begear.esercizi.giorno4.esercizioJolly;

public class Contenitore {

	private String contenuto;
	private boolean bevibile;
	
	public Contenitore( String contenuto, boolean bevibile) {
		super();
		setContenuto(contenuto);
		setBevibile(bevibile);
		
	}

	public boolean isBevibile() {
		return bevibile;
	}

	public void setBevibile(boolean bevibile) {
		this.bevibile = bevibile;
	}

	public String getContenuto() {
		return contenuto;
	}

	public void setContenuto(String contenuto) {
		this.contenuto = contenuto;
	}
	
	
	
}
