package it.begear.esercizi.giorno2.esercizio1;

public class Rettangolo {
	int lato1;
	int lato2;

	public Rettangolo(int lato1, int lato2) {
		super();
		setLato1(lato1);
		setLato2(lato2);
	}

	public int getLato1() {
		return lato1;
	}

	public void setLato1(int lato1) {
		this.lato1 = lato1;
	}

	public int getLato2() {
		return lato2;
	}

	public void setLato2(int lato2) {
		this.lato2 = lato2;
	}

	public int Area(Rettangolo rettangolo) {
		return (rettangolo.lato1 * rettangolo.lato2);
	}

}
