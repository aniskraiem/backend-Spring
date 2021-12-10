package tn.esprit.spring.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.CategorieClient;
import tn.esprit.spring.entity.Client;
import tn.esprit.spring.entity.Facture;

@Repository
public interface ClientRepository extends CrudRepository <Client, Long>{
	/*@Query("SELECT c FROM Client c WHERE c.CategorieClient= :CategorieClient")
	List<Client> getClientsByCatergorie(@Param("CategorieClient") CategorieClient categorie);
	@Query("SELECT c FROM Client c WHERE c.dateNaissance BETWEEN :startDate AND :endDate")
	List<Client> getClientsByRangeDate(@Param("startDate") Date startDate,@Param("endDate") Date endDate);

	 */
}
