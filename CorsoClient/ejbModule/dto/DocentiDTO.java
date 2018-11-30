package dto;

import java.io.Serializable;

public class DocentiDTO implements Serializable {

	private static final long serialVersionUDT = 1L;

	private int iddocente;
	private String nome;
	private String cognome;
	private String cf;

	public int getIddocente() {
		return iddocente;
	}

	public void setIddocente(int iddocente) {
		this.iddocente = iddocente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCf() {
		return cf;
	}

	public void setCf(String cf) {
		this.cf = cf;
	}

	public void setDescrizione(String string) {

	}
}