package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

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

import lombok.Getter;
import lombok.Setter;

import javax.persistence.OneToOne;


@Entity
@Table( name= "DetailProduit")
@Getter
@Setter
public class DetailProduit  implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idDetailProduit")
	private long idDetailProduit; 
	@Temporal(TemporalType.DATE)
	@Column(name="dateCreation")
	private Date dateCreation;
	@Temporal(TemporalType.DATE)
	@Column(name="dateDerniereModification")
	private Date dateDerniereModification;
	@Enumerated(EnumType.STRING)
	@Column(name="categorieProduit")
	private CategorieProduit categorieProduit;
	@OneToOne(mappedBy="DetailProduit")
	private Produit Produit;


	public DetailProduit(Date dateCreation, Date dateDerniereModification, CategorieProduit categorieProduit, tn.esprit.spring.entity.Produit produit) {
		this.dateCreation = dateCreation;
		this.dateDerniereModification = dateDerniereModification;
		this.categorieProduit = categorieProduit;
		Produit = produit;
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
