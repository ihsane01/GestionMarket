package org.lsi.market.metier;

import java.util.List;

import org.lsi.market.entities.Fournisseur;

public interface FournisseurMetier {
	public Fournisseur saveFournisseur(Fournisseur c); 
	public List<Fournisseur> listFournisseur(); 
}
