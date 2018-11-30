package model;

public class Ruolo {

	private int id;
	private String nomeruolo;
	private int stipendio;

	public Ruolo(int id2, String nomeruolo2, int stipendio2) {
		id = id2;
		nomeruolo = nomeruolo2;
		stipendio = stipendio2;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeruolo() {
		return nomeruolo;
	}

	public void setNomeruolo(String nomeruolo) {
		this.nomeruolo = nomeruolo;
	}

	public int getStipendio() {
		return stipendio;
	}

	public void setStipendio(int stipendio) {
		this.stipendio = stipendio;
	}

}
