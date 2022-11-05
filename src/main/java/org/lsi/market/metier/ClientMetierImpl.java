package org.lsi.market.metier;

import java.util.List;

import org.lsi.market.dao.ClientRepository;
import org.lsi.market.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;

public class ClientMetierImpl  implements ClientMetier{

@Autowired
private ClientRepository clientRepository; 
	@Override
	public Client saveClient(Client c) {
		// TODO Auto-generated method stub
		 return clientRepository.save(c); 

	}

	@Override
	public List<Client> listClient() {
		// TODO Auto-generated method stub
		 return clientRepository.findAll(); 
	}

	@Override
	public String deleteClient(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
