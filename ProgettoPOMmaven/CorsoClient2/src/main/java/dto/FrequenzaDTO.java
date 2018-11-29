package dto;

import java.io.Serializable;

public class FrequenzaDTO implements Serializable {

	private static final long serialVersionUDT = 1L;

	private int idfrequenza;
	private int idedizione;
	private int idimp;
	
	public int getIdfrequenza() {
		return idfrequenza;
	}
	public void setIdfrequenza(int idfrequenza) {
		this.idfrequenza = idfrequenza;
	}
	public int getIdedizione() {
		return idedizione;
	}
	public void setIdedizione(int idedizione) {
		this.idedizione = idedizione;
	}
	public int getIdimp() {
		return idimp;
	}
	public void setIdimp(int idimp) {
		this.idimp = idimp;
	}
	public static long getSerialversionudt() {
		return serialVersionUDT;
	}

}