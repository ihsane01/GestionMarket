package org.lsi.market.metier;

import java.util.List;

import org.lsi.market.dao.FournisseurRepository;
import org.lsi.market.entities.Fournisseur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class FournisseurMetierImpl implements  FournisseurMetier{

@Autowired
private FournisseurRepository fournisseurRepository; 

	@Override
	public Fournisseur saveFournisseur(Fournisseur c) {
		// TODO Auto-generated method stub
		 return fournisseurRepository.save(c); 

	}

	@Override
	public List<Fournisseur> listFournisseur() {
		// TODO Auto-generated method stub
		 return fournisseurRepository.findAll(); 	}

}
