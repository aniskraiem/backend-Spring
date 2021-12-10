package tn.esprit.spring.service;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.CategorieClient;
import tn.esprit.spring.entity.Client;
import tn.esprit.spring.entity.Facture;
import tn.esprit.spring.entity.Produit;
import tn.esprit.spring.repository.ClientRepository;
import tn.esprit.spring.repository.FactureRepository;
@Service
public class ClientServiceImpl implements ClientSerivce{
	@Autowired
	ClientRepository cr;
	@Autowired
	FactureRepository fr;
	@Override
	public List<Client> retrieveAllClients() {
		List<Client> Clients=(List<Client>)cr.findAll();
		return Clients;
	}

	@Override
	public Client addClient(Client c) {
		Client client=cr.save(c);
		return client;
	}

	@Override
	public void deleteClient(Long id) {
		Client c = cr.findById(id).get();
		cr.delete(c);

	}

	@Override
	public Client updateClient(Client c) {
		Client client=cr.save(c);
		return client;
	}

	@Override
	public Client retrieveClient(Long id) {
		return cr.findById(id).get();
	}
	/*@Override
	public float getChiffreAffaireParCategorieClient(CategorieClient categorieClient, Date startDate, Date endDate) {
		List<Client>listC=cr.getClientsByCatergorie(categorieClient);
		float chiffreDaffaire = 0 ;
		for (int i=0; i<listC.size();i++) {
			List<Facture> ListF=fr.getFacturesByDate(listC.get(i), startDate, endDate);
			for (int j=0; i<ListF.size();j++) {
				chiffreDaffaire=chiffreDaffaire+ListF.get(j).getMontantFacture();
			}	
	}
		return chiffreDaffaire;
		}

	 */


}
