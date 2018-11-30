package model;

import java.sql.Date;

public class Movimento {

	private int idconto;
	private int idmovimento;
	private double importo;
	private Date datamovimento;

	public Movimento(int idconto, int idmovimento, double importo, Date datamovimento) {

		this.idconto = idconto;
		this.idmovimento = idmovimento;
		this.importo = importo;
		this.datamovimento = datamovimento;
	}

	public Movimento() {

	}

	public int getIdconto() {
		return idconto;
	}

	public void setIdconto(int idconto) {
		this.idconto = idconto;
	}

	public int getIdmovimento() {
		return idmovimento;
	}

	public void setIdmovimento(int idmovimento) {
		this.idmovimento = idmovimento;
	}

	public double getImporto() {
		return importo;
	}

	public void setImporto(double importo) {
		this.importo = importo;
	}

	public Date getDatamovimento() {
		return datamovimento;
	}

	public void setDatamovimento(Date datamovimento) {
		this.datamovimento = datamovimento;
	}

}