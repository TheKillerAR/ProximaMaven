package modeljpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the docenti database table.
 * 
 */
@Entity
@NamedQuery(name="Docenti.findAll", query="SELECT d FROM Docenti d")
public class Docenti implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int iddocente;

	private String cf;

	private String cognome;

	private String nome;

	//bi-directional many-to-one association to Edizione
	@OneToMany(mappedBy="docenti")
	private List<Edizione> ediziones;

	public Docenti() {
	}

	public int getIddocente() {
		return this.iddocente;
	}

	public void setIddocente(int iddocente) {
		this.iddocente = iddocente;
	}

	public String getCf() {
		return this.cf;
	}

	public void setCf(String cf) {
		this.cf = cf;
	}

	public String getCognome() {
		return this.cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Edizione> getEdiziones() {
		return this.ediziones;
	}

	public void setEdiziones(List<Edizione> ediziones) {
		this.ediziones = ediziones;
	}

	public Edizione addEdizione(Edizione edizione) {
		getEdiziones().add(edizione);
		edizione.setDocenti(this);

		return edizione;
	}

	public Edizione removeEdizione(Edizione edizione) {
		getEdiziones().remove(edizione);
		edizione.setDocenti(null);

		return edizione;
	}

}