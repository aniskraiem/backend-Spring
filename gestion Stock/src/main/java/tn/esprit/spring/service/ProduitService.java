package tn.esprit.spring.service;
import java.util.Date;
import java.util.List;

import tn.esprit.spring.entity.Produit;

public interface ProduitService {
	List<Produit> retrieveAllProduits();

	Produit addProduit(Produit p);
	void deleteProduit(Long id);

	Produit update(Long id, Produit produit);

	Produit retrieveProduit(Long id);
	
	//void assignProduitToStock(Long idProduit, Long idStock);
	
//	public void assignFournisseurToProduit(Long fournisseurId, Long produitId) ;
//	float getRevenuBrutProduit(Long idProduit, Date startDate, Date endDate);
}
