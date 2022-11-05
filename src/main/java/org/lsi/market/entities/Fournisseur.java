package org.lsi.market.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Fournisseur")
public class Fournisseur implements Serializable {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codeFour;
	private String nomFour;
	private String villeFour;
	private String telFour;
	
	@OneToMany(mappedBy="fournisseur")
	private Collection<Livraison> livraisons;
	
	@OneToMany(mappedBy="fournisseur")
	private Collection<Societe> societes;

	public Fournisseur() {
		super();
	}

	public Fournisseur(int code, String nom, String ville, String telephone) {
		super();
		this.nomFour = nom;
		this.villeFour = ville;
		this.telFour = telephone;
	}

	

	public int getCodeFour() {
		return codeFour;
	}

	public void setCodeFour(int codeFour) {
		this.codeFour = codeFour;
	}

	public String getNomFour() {
		return nomFour;
	}

	public void setNomFour(String nomFour) {
		this.nomFour = nomFour;
	}

	public String getVilleFour() {
		return villeFour;
	}

	public void setVilleFour(String villeFour) {
		this.villeFour = villeFour;
	}

	public String getTelFour() {
		return telFour;
	}

	public void setTelFour(String telFour) {
		this.telFour = telFour;
	}

	public Collection<Livraison> getLivraisons() {
		return livraisons;
	}

	public void setLivraisons(Collection<Livraison> livraisons) {
		this.livraisons = livraisons;
	}

	public Collection<Livraison> getLivraions() {
		return livraisons;
	}

	public void setLivraions(Collection<Livraison> livraions) {
		this.livraisons = livraions;
	}

	public Collection<Societe> getSocietes() {
		return societes;
	}

	public void setSocietes(Collection<Societe> societes) {
		this.societes = societes;
	}
	
	
	
}
