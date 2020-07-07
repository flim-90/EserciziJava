package it.begear.esercizi.giorno4.esercizio6;

public class Operazione  extends Stampatore implements InterfacciaOperazioni  {

	private int operando1;
	private int operando2;
	public Operazione(int operando1, int operando2) {
		super();
		setOperando1(operando1);
		setOperando2(operando2);
	}
	public int getOperando1() {
		return operando1;
	}
	public void setOperando1(int operando1) {
		this.operando1 = operando1;
	}
	public int getOperando2() {
		return operando2;
	}
	public void setOperando2(int operando2) {
		this.operando2 = operando2;
	}
	@Override
	public int somma() {
		
		return operando1 + operando2;
	}
	@Override
	public int sottrazione() {
		// TODO Auto-generated method stub
		return operando1 - operando2;
	}
	@Override
	public int moltiplicazione() {
		// TODO Auto-generated method stub
		return operando1 * operando2;
	}
	@Override
	public int divisione() {
		// TODO Auto-generated method stub
		return operando1 / operando2;
	}
	@Override
	public void stampatore(int a) {
		// TODO Auto-generated method stub
		super.stampatore(a);
	}
	
	
	
	
	
}
