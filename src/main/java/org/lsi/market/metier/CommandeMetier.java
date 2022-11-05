package org.lsi.market.metier;

import java.util.List;

import org.lsi.market.entities.Commande;

public interface CommandeMetier {
	public Commande saveCommande(Commande c); 
	public List<Commande> listCommande(); 
}
