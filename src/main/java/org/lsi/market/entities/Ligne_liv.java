package org.lsi.market.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="Ligne_liv")
public class Ligne_liv implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numligne;

	
	@OneToOne
	@JoinColumn(name="CODE_ART")
	private Article article;
	
	private int qteliv;
	
	@ManyToOne
	@JoinColumn(name="NUM_LIV")
	private Livraison livraison;

	public Ligne_liv() {
		super();
	}

	public Ligne_liv(int qte_liv) {
		super();
		this.qteliv = qte_liv;
		
	}


	public int getQte_liv() {
		return qteliv;
	}

	public void setQte_liv(int qte_liv) {
		this.qteliv = qte_liv;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public Livraison getLivraison() {
		return livraison;
	}

	public void setLivraison(Livraison livraison) {
		this.livraison = livraison;
	}


}
