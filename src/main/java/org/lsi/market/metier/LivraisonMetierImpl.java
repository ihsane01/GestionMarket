package org.lsi.market.metier;

import java.util.List;

import org.lsi.market.dao.LivraisonRepository;
import org.lsi.market.entities.Livraison;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class LivraisonMetierImpl  implements LivraisonMetier{

@Autowired
private LivraisonRepository livraisonRepository; 
	@Override
	public Livraison saveLivraison(Livraison c) {
		// TODO Auto-generated method stub
		 return livraisonRepository.save(c); 
	}

	@Override
	public List<Livraison> listLivraison() {
		// TODO Auto-generated method stub
		 return livraisonRepository.findAll(); 	}

}
