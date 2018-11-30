package model;

import java.sql.Date;

public class Corso {

	private int idconto;
	private int idimpiegato;
	private double saldo;
	private Date datainizio;

	Corso(int idconto, int idimpiegato, double saldo, Date datainizio) {

		this.idconto = idconto;
		this.idimpiegato = idimpiegato;
		this.saldo = saldo;
		this.datainizio = datainizio;
	}

	public Corso() {
	}

	public int getIdconto() {
		return idconto;
	}

	@Override
	public String toString() {
		return "Conto [idconto=" + idconto + ", idimpiegato=" + idimpiegato + ", saldo=" + saldo + ", datainizio="
				+ datainizio + "]";
	}

	public void setIdconto(int idconto) {
		this.idconto = idconto;
	}

	public int getIdimpiegato() {
		return idimpiegato;
	}

	public void setIdimpiegato(int idimpiegato) {
		this.idimpiegato = idimpiegato;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Date getDatainizio() {
		return datainizio;
	}

	public void setDatainizio(Date datainizio) {
		this.datainizio = datainizio;
	}

}
