package org.lsi.market.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "livraison")
public class Livraison implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numliv;
	private String dateliv;
	
	@ManyToOne
	@JoinColumn(name="CODE_FOUR")
	private Fournisseur fournisseur;
	
	@OneToMany(mappedBy="livraison")
	private Collection<Ligne_liv> lignes_liv;

	public Livraison() {
		super();
	}

	

	public int getNumliv() {
		return numliv;
	}



	public void setNumliv(int numliv) {
		this.numliv = numliv;
	}



	public String getDateliv() {
		return dateliv;
	}



	public void setDateliv(String dateliv) {
		this.dateliv = dateliv;
	}



	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

	public Collection<Ligne_liv> getLignes_liv() {
		return lignes_liv;
	}

	public void setLignes_liv(Collection<Ligne_liv> lignes_liv) {
		this.lignes_liv = lignes_liv;
	}
	
	
}
