package modeljpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the corso database table.
 * 
 */
@Entity
@NamedQuery(name="Corso.findAll", query="SELECT c FROM Corso c")
public class Corso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idcorso;

	private String descrizione;

	//bi-directional many-to-one association to Edizione
	@OneToMany(mappedBy="corso")
	private List<Edizione> ediziones;

	public Corso() {
	}

	public int getIdcorso() {
		return this.idcorso;
	}

	public void setIdcorso(int idcorso) {
		this.idcorso = idcorso;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public List<Edizione> getEdiziones() {
		return this.ediziones;
	}

	public void setEdiziones(List<Edizione> ediziones) {
		this.ediziones = ediziones;
	}

	public Edizione addEdizione(Edizione edizione) {
		getEdiziones().add(edizione);
		edizione.setCorso(this);

		return edizione;
	}

	public Edizione removeEdizione(Edizione edizione) {
		getEdiziones().remove(edizione);
		edizione.setCorso(null);

		return edizione;
	}

}