package model;

public class Storico {
	
	private int idruolo;
	private String datainizio;
	private String datafine;
	private int idimpiegato;
	
	public Storico(){
		
	}
	
	public int getIdimpiegato() {
		return idimpiegato;
	}
	public void setIdimpiegato(int idimpiegato) {
		this.idimpiegato = idimpiegato;
	}
	public int getIdruolo() {
		return idruolo;
	}
	public void setIdruolo(int idruolo) {
		this.idruolo = idruolo;
	}
	public String getDatainizio() {
		return datainizio;
	}
	public void setDatainizio(String datainizio) {
		this.datainizio = datainizio;
	}
	public String getDatafine() {
		return datafine;
	}
	public void setDatafine(String datafine) {
		this.datafine = datafine;
	}
	
}
