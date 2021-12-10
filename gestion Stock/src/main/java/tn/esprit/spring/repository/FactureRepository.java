package tn.esprit.spring.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Client;
import tn.esprit.spring.entity.Facture;
import tn.esprit.spring.entity.Produit;
import tn.esprit.spring.entity.detailFacture;

@Repository

public interface FactureRepository extends CrudRepository <Facture, Long>{
	/*@Query("SELECT f FROM Facture c WHERE f.Client= :client")
	List<Facture> getFacturesByClient(@Param("client") Client
	client);
	@Query("SELECT f FROM detailFacture c WHERE f.Produit= :produit")
	List<detailFacture> getDetailByProduit(@Param("produit")Produit prod);
	@Query("SELECT f FROM Facture c WHERE f.Client= :client AND f.dateFacture BETWEEN :dateMoins AND :datePlus")
	List<Facture> getFacturesByDate(@Param("client") Client client,@Param("dateMoins") Date
	dateMoins,@Param("datePluss") Date
	datePluss);
	@Query("SELECT f FROM Facture c WHERE  f.dateFacture BETWEEN :dateMoins AND :datePlus")
	List<Facture> getFacturesByDate2(@Param("dateMoins") Date
	dateMoins,@Param("datePluss") Date
	datePluss);

	 */
	
}
