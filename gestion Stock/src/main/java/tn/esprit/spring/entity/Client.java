package tn.esprit.spring.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table( name= "Client")
@Getter
@Setter
@RequiredArgsConstructor
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IdClient")
	
	private long idClient;
	@NotNull
	@Column(name="NOM")
	private String nom;
	@Column(name="PRENOM")
	@NotNull
	private String prenom;
	@Temporal(TemporalType.DATE)
	@Column(name="dateNaissance")
	private Date dateNaissance;
	@Column(name="EMAIL")
	private String email;
	@Column(name="PASSWORD")
	private String password;
    @Enumerated(EnumType.STRING)
	@Column(name="categorieClient")
	private CategorieClient categorieClient;
    @Enumerated(EnumType.STRING)
	@Column(name="PROFESSION")
	private Profession profession;
	@OneToMany(cascade = CascadeType.ALL, mappedBy="Client")
    private Set<Facture> Factures;
    Client(long idClient,String nom, String prenom, Date dateNaissance, String email, String password, CategorieClient categorieClient, Profession profession){
    	
    } 	
}
