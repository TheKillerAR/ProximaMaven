package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the utente database table.
 * 
 */
// COPIARLE DENTRO HELLOWORLDJPA
@Entity
@NamedQuery(name="Utente.findAll", query="SELECT u FROM Utente u")
public class Utente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String cognome;

	private int eta;

	private String nome;

	public Utente() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCognome() {
		return this.cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEta() {
		return this.eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}