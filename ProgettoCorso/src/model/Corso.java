package model;

public class Corso {

	private int idcorso;
	private String descrizione;
	
	public Corso(){
		
	}

	public Corso(int idcorso, String descrizione) {

		this.idcorso = idcorso;
		this.descrizione = descrizione;
	}

	public int getIdcorso() {
		return idcorso;
	}

	public void setIdcorso(int idcorso) {
		this.idcorso = idcorso;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

}
