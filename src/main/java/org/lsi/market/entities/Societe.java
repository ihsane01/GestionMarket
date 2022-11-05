package org.lsi.market.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Societe")
public class Societe implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codeste;
	private String nomste;
	private String telste;
	private String faxste;
	private String villeste;
	
	@ManyToOne
	@JoinColumn(name="CODE_FOUR")
	private Fournisseur fournisseur;

	
	public Societe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Societe(String nom, String telephone, String fax, String ville, Fournisseur fournissuer) {
		super();
		this.nomste = nom;
		this.telste = telephone;
		this.faxste = fax;
		this.villeste = ville;
		this.fournisseur = fournissuer;
	}

	

	
	public int getCodeste() {
		return codeste;
	}

	public void setCodeste(int codeste) {
		this.codeste = codeste;
	}

	public String getNomste() {
		return nomste;
	}

	public void setNomste(String nomste) {
		this.nomste = nomste;
	}

	public String getTelste() {
		return telste;
	}

	public void setTelste(String telste) {
		this.telste = telste;
	}

	public String getFaxste() {
		return faxste;
	}

	public void setFaxste(String faxste) {
		this.faxste = faxste;
	}

	public String getVilleste() {
		return villeste;
	}

	public void setVilleste(String villeste) {
		this.villeste = villeste;
	}

	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

	public Fournisseur getFournissuer() {
		return fournisseur;
	}

	public void setFournissuer(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}
	
	
}
