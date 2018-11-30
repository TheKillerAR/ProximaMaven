package model;

public class Tipomovimenti {

	private int idmovimento;
	private String descrizione;

	Tipomovimenti(int idmovimento, String descrizione) {

		this.idmovimento = idmovimento;
		this.descrizione = descrizione;
	}

	Tipomovimenti() {

	}

	public int getIdmovimento() {
		return idmovimento;
	}

	public void setIdmovimento(int idmovimento) {
		this.idmovimento = idmovimento;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

}
