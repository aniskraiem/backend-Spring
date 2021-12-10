package tn.esprit.spring.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table( name= "Stock")
@Getter
@Setter
public class Stock {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idStock")
	private long idStock; 
	@Column(name="qte")
	private int qte;
	@Column(name="qteMin")
	private int qteMin;
	@Column(name="libelleStock")
	private String libelleStock;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="Stock")
	private Set<Produit> Produits;
	
	
	public Stock(long idStock, int qte, int qteMin, String libelleStock, Set<Produit> produits) {
		super();
		this.idStock = idStock;
		this.qte = qte;
		this.qteMin = qteMin;
		this.libelleStock = libelleStock;
		Produits = produits;
	}
	public Stock(int qte, int qteMin, String libelleStock) {
		super();
		this.qte = qte;
		this.qteMin = qteMin;
		this.libelleStock = libelleStock;
		
	}
	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getIdIdStock(){
		return idStock;
	}
	public void setQte (int setQte){

		this.qte = qte;

		}
 	public int getQte(){

		return qte;

		}
 	public void setQteMin (int setQteMin){

		this.qteMin = qteMin;

		}
 	public int getQteMin(){

		return qteMin;

		}
 	public void setLibelleStock (String setLibelleStock){

		this.libelleStock = libelleStock;

		}
 	public String getLibelleStock(){

		return libelleStock;

		}
}
