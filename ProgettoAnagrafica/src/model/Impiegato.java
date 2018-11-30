package model;

public class Impiegato {

	private int id;
	private String cf;
	private String nome;
	private String cognome;

	public Impiegato(int id, String cf, String nome, String cognome) {
		this.id = id;
		this.cf = cf;
		this.nome = nome;
		this.cognome = cognome;
	}

	public Impiegato() {

	}

	public String getCf() {
		return cf;
	}

	public void setCf(String string) {
		this.cf = string;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Impiegato [id=" + id + ", cf=" + cf + ", nome=" + nome + ", cognome=" + cognome + "]";
	}
}