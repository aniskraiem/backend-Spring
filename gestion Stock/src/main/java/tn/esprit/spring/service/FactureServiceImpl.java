package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.spring.entity.Client;
import tn.esprit.spring.entity.Facture;
import tn.esprit.spring.repository.ClientRepository;
import tn.esprit.spring.repository.FactureRepository;

public class FactureServiceImpl implements FactureService{
	@Autowired
	FactureRepository fr;
	@Autowired 
	ClientRepository cr;
	@Override
	public List<Facture> retrieveAllFactures() {
		List<Facture> factures = null;
		fr.findAll().forEach(factures::add);
		return factures;
	}

	@Override
	public void cancelFacture(Long id) {
		Facture f = fr.findById(id).get();
		f.setActive(false);
		fr.save(f);
	}

	@Override
	public Facture retrieveFacture(Long id) {
		// TODO Auto-generated method stub
		return fr.findById(id).get();
	}

	/*@Override
	public List<Facture> getFacturesByClient(Long idClient) {
		List<Facture> listF = null;
		Client c = cr.findById(idClient).get();
		return listF=fr.getFacturesByClient(c);
	}



	@Override
	public Facture addFacture(Facture f, Long idClient) {
		Client c = cr.findById(idClient).get();
		f.setClient(c);
		return fr.save(f);
	}
 */
}
