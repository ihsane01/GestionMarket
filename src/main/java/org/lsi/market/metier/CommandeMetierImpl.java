package org.lsi.market.metier;

import java.util.List;

import org.lsi.market.dao.CommandeRepository;
import org.lsi.market.entities.Commande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CommandeMetierImpl  implements CommandeMetier{

@Autowired
private CommandeRepository CommandeRepository; 

	@Override
	public Commande saveCommande(Commande c) {
		// TODO Auto-generated method stub
		 return CommandeRepository.save(c); 
	}
	@Override
	public List<Commande> listCommande() {
		// TODO Auto-generated method stub
		 return CommandeRepository.findAll(); 
	} 
}
