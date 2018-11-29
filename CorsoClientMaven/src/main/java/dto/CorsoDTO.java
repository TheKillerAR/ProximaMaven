package dto;

import java.io.Serializable;

public class CorsoDTO implements Serializable {

	private static final long serialVersionUDT = 1L;

	private int idcorso;
	private String descrizione;

	public CorsoDTO() {

	}

	public CorsoDTO(int idcorso, String descrizione) {
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