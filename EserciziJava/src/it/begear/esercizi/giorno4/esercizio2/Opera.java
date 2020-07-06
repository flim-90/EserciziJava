package it.begear.esercizi.giorno4.esercizio2;

public class Opera {

	private String nomeOpera;
	private String nomeArtista;
	private int ingombro;
	
	
	public Opera(String nomeOpera, String nomeArtista) {
		super();
		setNomeOpera(nomeOpera);
		setNomeArtista(nomeArtista);
		setIngombro(ingombro);
	}


	public String getNomeOpera() {
		return nomeOpera;
	}


	public void setNomeOpera(String nomeOpera) {
		this.nomeOpera = nomeOpera;
	}


	public String getNomeArtista() {
		return nomeArtista;
	}


	public void setNomeArtista(String nomeArtista) {
		this.nomeArtista = nomeArtista;
	}


	public int getIngombro() {
		return ingombro;
	}


	public void setIngombro(int ingombro) {
		this.ingombro = ingombro;
	}
	
	
	public void checker(Opera opera, Opera opera1) {
		if (opera.equals(opera1)) {
			
			System.out.println(" le due opere sono identiche");
		} else {
			
			System.out.println(" le due opere sono diverse");
		}
	}
	
	
}
