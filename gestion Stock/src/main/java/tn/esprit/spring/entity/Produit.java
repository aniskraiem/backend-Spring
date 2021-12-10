package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table( name= "Produit")
@Getter
@Setter
public class Produit implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idProduit")
	private long idProduit; 
	@Column(name="code")
	private String code;
	@Column(name="libelle")
	private String libelle;
	@Column(name="prixUnitaire")
	private float prixUnitaire;
	@OneToOne
	private DetailProduit DetailProduit;
	@ManyToMany(cascade=CascadeType.ALL)
	private Set<Fournisseur> Fournisseurs;
	@ManyToOne
	private Rayon Rayon;
	@ManyToOne
	private detailFacture detailFacture; 

	@ManyToOne
	private Stock Stock;




	public Produit() {
	}

	public Produit(String code, String libelle, float prixUnitaire) {
		this.code = code;
		this.libelle = libelle;
		this.prixUnitaire = prixUnitaire;
	}

	public long getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(long idProduit) {
		this.idProduit = idProduit;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public float getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(float prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	public tn.esprit.spring.entity.DetailProduit getDetailProduit() {
		return DetailProduit;
	}

	public void setDetailProduit(tn.esprit.spring.entity.DetailProduit detailProduit) {
		DetailProduit = detailProduit;
	}

	public Set<Fournisseur> getFournisseurs() {
		return Fournisseurs;
	}

	public void setFournisseurs(Set<Fournisseur> fournisseurs) {
		Fournisseurs = fournisseurs;
	}

	public tn.esprit.spring.entity.Rayon getRayon() {
		return Rayon;
	}

	public void setRayon(tn.esprit.spring.entity.Rayon rayon) {
		Rayon = rayon;
	}

	public tn.esprit.spring.entity.detailFacture getDetailFacture() {
		return detailFacture;
	}

	public void setDetailFacture(tn.esprit.spring.entity.detailFacture detailFacture) {
		this.detailFacture = detailFacture;
	}

	public tn.esprit.spring.entity.Stock getStock() {
		return Stock;
	}

	public void setStock(tn.esprit.spring.entity.Stock stock) {
		Stock = stock;
	}

	@Override
	public String toString() {
		return "Produit{" +
				"idProduit=" + idProduit +
				", code='" + code + '\'' +
				", libelle='" + libelle + '\'' +
				", prixUnitaire=" + prixUnitaire +
				", DetailProduit=" + DetailProduit +
				", Fournisseurs=" + Fournisseurs +
				", Rayon=" + Rayon +
				", detailFacture=" + detailFacture +
				", Stock=" + Stock +
				'}';
	}
}
