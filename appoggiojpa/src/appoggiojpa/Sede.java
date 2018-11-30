package appoggiojpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the sede database table.
 * 
 */
@Entity
@NamedQuery(name="Sede.findAll", query="SELECT s FROM Sede s")
public class Sede implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idsede;

	private int cap;

	private String citta;

	private String nomesede;

	private String via;

	//bi-directional many-to-one association to Edizione
	@OneToMany(mappedBy="sede")
	private List<Edizione> ediziones;

	public Sede() {
	}

	public int getIdsede() {
		return this.idsede;
	}

	public void setIdsede(int idsede) {
		this.idsede = idsede;
	}

	public int getCap() {
		return this.cap;
	}

	public void setCap(int cap) {
		this.cap = cap;
	}

	public String getCitta() {
		return this.citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getNomesede() {
		return this.nomesede;
	}

	public void setNomesede(String nomesede) {
		this.nomesede = nomesede;
	}

	public String getVia() {
		return this.via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public List<Edizione> getEdiziones() {
		return this.ediziones;
	}

	public void setEdiziones(List<Edizione> ediziones) {
		this.ediziones = ediziones;
	}

	public Edizione addEdizione(Edizione edizione) {
		getEdiziones().add(edizione);
		edizione.setSede(this);

		return edizione;
	}

	public Edizione removeEdizione(Edizione edizione) {
		getEdiziones().remove(edizione);
		edizione.setSede(null);

		return edizione;
	}

}