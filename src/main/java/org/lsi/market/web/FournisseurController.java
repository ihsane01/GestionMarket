package org.lsi.market.web;

import java.util.List;

import org.lsi.market.entities.Fournisseur;
import org.lsi.market.metier.FournisseurMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FournisseurController {
	@Autowired
	private FournisseurMetier FournisseurMetier; 
	@RequestMapping(value="/Fournisseurs",method=RequestMethod.POST) 
	public Fournisseur saveCommandes(@RequestBody Fournisseur c) { 
		return FournisseurMetier.saveFournisseur(c);
	 }  
	@RequestMapping(value="/Fournisseurs",method=RequestMethod.GET) 
	public List<Fournisseur> listCommande() { 
	 return FournisseurMetier.listFournisseur(); 
	 } 
}
