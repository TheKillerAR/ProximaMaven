package modeljpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the frequenza database table.
 * 
 */
@Entity
@NamedQuery(name="Frequenza.findAll", query="SELECT f FROM Frequenza f")
public class Frequenza implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idfrequenza;

	private int idimp;

	//bi-directional many-to-one association to Edizione
	@ManyToOne
	@JoinColumn(name="idedizione")
	private Edizione edizione;

	public Frequenza() {
	}

	public int getIdfrequenza() {
		return this.idfrequenza;
	}

	public void setIdfrequenza(int idfrequenza) {
		this.idfrequenza = idfrequenza;
	}

	public int getIdimp() {
		return this.idimp;
	}

	public void setIdimp(int idimp) {
		this.idimp = idimp;
	}

	public Edizione getEdizione() {
		return this.edizione;
	}

	public void setEdizione(Edizione edizione) {
		this.edizione = edizione;
	}

}