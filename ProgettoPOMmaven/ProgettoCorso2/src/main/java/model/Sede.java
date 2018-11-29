package model;

public class Sede {

	private int idsede;
	private String nomesede;
	private String via;
	private String citta;
	private int cap;
	
public Sede(){
		
	}
	
	public Sede(int idsede, String nomesede, String via, String citta, int cap) {
		
		this.idsede = idsede;
		this.nomesede = nomesede;
		this.via = via;
		this.citta = citta;
		this.cap = cap;
	}
	public int getIdsede() {
		return idsede;
	}
	public void setIdsede(int idsede) {
		this.idsede = idsede;
	}
	public String getNomesede() {
		return nomesede;
	}
	public void setNomesede(String nomesede) {
		this.nomesede = nomesede;
	}
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	public String getCitta() {
		return citta;
	}
	public void setCitta(String citta) {
		this.citta = citta;
	}
	public int getCap() {
		return cap;
	}
	public void setCap(int cap) {
		this.cap = cap;
	}
	
	
}
