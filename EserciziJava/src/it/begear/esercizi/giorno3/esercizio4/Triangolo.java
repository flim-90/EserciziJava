package it.begear.esercizi.giorno3.esercizio4;

public class Triangolo {

	private int lato1;
	private int lato2;
	private int lato3;
	public Triangolo(int lato1, int lato2, int lato3) throws Exception{
		super();
		if ((lato1 <(lato2 + lato3))&& (lato2 <(lato1 + lato3))&&(lato3 <(lato2 + lato1))) {
		setLato1(lato1);
		setLato2(lato2);
		setLato3(lato3);
		} else {
			
			throw new Exception();
		}
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
	public int getLato3() {
		return lato3;
	}
	public void setLato3(int lato3) {
		this.lato3 = lato3;
	}
	
	
	
}
