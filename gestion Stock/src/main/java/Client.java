
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import tn.esprit.spring.entity.CategorieClient;
import tn.esprit.spring.entity.Profession;

@Entity
@Table( name= "Client")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idClient")
	private long idClient; 
	@Column(name="NOM")
	private String nom;
	@Column(name="PRENOM")
	private String prenom;
	@Temporal(TemporalType.DATE)
	@Column(name="DateNaissance")
	private Date dateNaissance;
	@Column(name="EMAIL")
	private String email;
	@Column(name="PASSWORD")
	private String password;
	@Enumerated(EnumType.STRING)
	@Column(name="CATEGORIE_CLIENT")
	private CategorieClient categorieClient;
	@Enumerated(EnumType.STRING)
	@Column(name="PROFESSION")
	private Profession profession;
	
	
	
	
	Client(long idClient,String nom, String prenom, Date dateNaissance, String email, String password, CategorieClient categorieClient, Profession profession){
		
	}
	
	
	
	
	
}
