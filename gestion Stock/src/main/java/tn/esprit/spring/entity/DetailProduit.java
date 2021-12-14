package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table( name= "DetailProduit")
@Getter
@Setter
public class DetailProduit  implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idDetailProduit")
	private long idDetailProduit;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idProduit", referencedColumnName = "idProduit")
	private Produit produit;
	@Temporal(TemporalType.DATE)
	@Column(name="dateCreation")
	private Date dateCreation;
	@Temporal(TemporalType.DATE)
	@Column(name="dateDerniereModification")
	private Date dateDerniereModification;
	@Enumerated(EnumType.STRING)
	@Column(name="categorieProduit")
	private CategorieProduit categorieProduit;


	public DetailProduit(long idDetailProduit, Date dateCreation, Date dateDerniereModification, CategorieProduit categorieProduit, Produit produit) {
		this.idDetailProduit = idDetailProduit;
		this.dateCreation = dateCreation;
		this.dateDerniereModification = dateDerniereModification;
		this.categorieProduit = categorieProduit;
		this.produit = produit;
	}

	public DetailProduit() {

	}

	public long getIdDetailProduit(){
		return idDetailProduit;
	}
	public void setDateCreation (Date setDateCreation){

		this.dateCreation = dateCreation;

		}
 	public Date getDateCreation(){

		return dateCreation;

		}
 	public void setDateDerniereModification (Date setDateDerniereModification){

		this.dateDerniereModification = dateDerniereModification;

		}
 	public Date getDateDerniereModification(){

		return dateDerniereModification;

		}
 	public void setCategorieProduit (CategorieProduit setCategorieProduit){

		this.categorieProduit = categorieProduit;

		}
 	public CategorieProduit getCategorieProduit(){

		return categorieProduit;

		}
	
	
	
	
	
	
	
	
	
	
	
}
