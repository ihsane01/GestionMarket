package org.lsi.market.metier;

import java.util.List;

import org.lsi.market.entities.Client;


public interface ClientMetier {
	public Client saveClient(Client c ); 
	public List<Client> listClient(); 
	public String deleteClient(int id );
	
}
