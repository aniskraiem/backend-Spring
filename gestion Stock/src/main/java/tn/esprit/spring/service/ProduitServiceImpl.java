package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.*;
import tn.esprit.spring.repository.FactureRepository;
import tn.esprit.spring.repository.FournisseurRepository;
import tn.esprit.spring.repository.ProduitRepository;
import tn.esprit.spring.repository.RayonRepository;
import tn.esprit.spring.repository.StockRepository;
@Service
public class ProduitServiceImpl implements ProduitService{
	@Autowired
	ProduitRepository pr;
	@Autowired 
	StockRepository sr;
	@Autowired
	FournisseurRepository fr;
	@Autowired
	FactureRepository facturerepo;
	@Autowired
	RayonRepository rayonRepo;
	@Override
	public List<Produit> retrieveAllProduits() {
			return pr.findAll();
	}

	@Override
	public Produit addProduit(Produit p) {
		return pr.save(p);
	}

	@Override
	public void deleteProduit(Long id) {
		pr.deleteById(id);

	}

	@Override
	public Produit update(Produit p,Long id)
	{

		return pr.save(p);
	}





	@Override
	public Produit retrieveProduit(Long id) {
		return  pr.findById(id).get();
	}
	//avancéee

	/* @Override
	public void assignProduitToStock(Long idProduit, Long idStock) {
		Stock s = sr.findById(idStock).get();
		Produit p = pr.findById(idProduit).get();
		s.getProduits().add(p);
		sr.save(s);
	}

	 */
/*
	@Override
	public void assignFournisseurToProduit(Long fournisseurId, Long produitId) {

		Fournisseur f= fr.findById(fournisseurId).get(); 
		Produit p = pr.findById(produitId).get();
		p.getFournisseurs().add(f);
		pr.save(p);

	}


	@Override
	public float getRevenuBrutProduit(Long idProduit, Date startDate, Date endDate) {
		Produit p = pr.findById(idProduit).get();
		List<detailFacture>listFactureDetail = facturerepo.getDetailByProduit(p);
		for (int i=0; i<listFactureDetail.size();i++) {
			List<Facture> ListFacure=null;
			ListFacure.add(listFactureDetail.get(i).getFacture());
		}
		int qte=0;
		Produit p = pr.findById(idProduit).get();
		float revenue = 0f;
		float pricu = p.getPrixUnitaire();
		List<detailFacture>listFactureDetail = facturerepo.getDetailByProduit(p);
		for (int i=0; i<listFactureDetail.size();i++) {
			qte=qte+listFactureDetail.get(i).getQte();
			if(listFactureDetail.get(i).getPourcentageRemise()!=0){
				float remisebaleur = (qte*pricu)*100/listFactureDetail.get(i).getPourcentageRemise();
				revenue = (qte*pricu)-remisebaleur;
			}else{
				revenue=qte*pricu;
			}
			
		}
		return revenue;
	}
*/


}
