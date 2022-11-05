package org.lsi.market.metier;

import java.util.List;

import org.lsi.market.entities.Livraison;

public interface LivraisonMetier {
	public Livraison  saveLivraison(Livraison c); 
	public List<Livraison> listLivraison(); 
}
