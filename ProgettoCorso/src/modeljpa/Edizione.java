package modeljpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the edizione database table.
 * 
 */
@Entity
@NamedQuery(name="Edizione.findAll", query="SELECT e FROM Edizione e")
public class Edizione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idedizione;

	@Temporal(TemporalType.DATE)
	private Date datafi;

	@Temporal(TemporalType.DATE)
	private Date datain;

	private int numero;

	//bi-directional many-to-one association to Corso
	@ManyToOne
	@JoinColumn(name="idcorso")
	private Corso corso;

	//bi-directional many-to-one association to Docenti
	@ManyToOne
	@JoinColumn(name="iddocente")
	private Docenti docenti;

	//bi-directional many-to-one association to Sede
	@ManyToOne
	@JoinColumn(name="idsede")
	private Sede sede;

	//bi-directional many-to-one association to Frequenza
	@OneToMany(mappedBy="edizione")
	private List<Frequenza> frequenzas;

	public Edizione() {
	}

	public int getIdedizione() {
		return this.idedizione;
	}

	public void setIdedizione(int idedizione) {
		this.idedizione = idedizione;
	}

	public Date getDatafi() {
		return this.datafi;
	}

	public void setDatafi(Date datafi) {
		this.datafi = datafi;
	}

	public Date getDatain() {
		return this.datain;
	}

	public void setDatain(Date datain) {
		this.datain = datain;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Corso getCorso() {
		return this.corso;
	}

	public void setCorso(Corso corso) {
		this.corso = corso;
	}

	public Docenti getDocenti() {
		return this.docenti;
	}

	public void setDocenti(Docenti docenti) {
		this.docenti = docenti;
	}

	public Sede getSede() {
		return this.sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}

	public List<Frequenza> getFrequenzas() {
		return this.frequenzas;
	}

	public void setFrequenzas(List<Frequenza> frequenzas) {
		this.frequenzas = frequenzas;
	}

	public Frequenza addFrequenza(Frequenza frequenza) {
		getFrequenzas().add(frequenza);
		frequenza.setEdizione(this);

		return frequenza;
	}

	public Frequenza removeFrequenza(Frequenza frequenza) {
		getFrequenzas().remove(frequenza);
		frequenza.setEdizione(null);

		return frequenza;
	}

}