package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.*;

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
	@Column(name="categorie")
	private String categorie;
	@Column(name="quantite")
	private long quantite;
	@Temporal(TemporalType.DATE)
	@Column(name="dateajout")
	private Date dateajout = new Date(System.currentTimeMillis());
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

	public Produit(String code, String libelle, float prixUnitaire,String categorie,Long quantite,Date dateajout) {
		this.code = code;
		this.libelle = libelle;
		this.prixUnitaire = prixUnitaire;
		this.categorie= categorie;
		this.quantite= quantite;
		this.dateajout= dateajout;
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

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public long getQuantite() {
		return quantite;
	}

	public void setQuantite(long quantite) {
		this.quantite = quantite;
	}

	public Date getDateajout() {
		return dateajout;
	}

	public void setDateajout(Date dateajout) {
		this.dateajout = dateajout;
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
				", categorie=" + categorie +
				", quantite=" + quantite +
				", dateajout=" + dateajout +
				", Fournisseurs=" + Fournisseurs +
				", Rayon=" + Rayon +
				", detailFacture=" + detailFacture +
				", Stock=" + Stock +
				'}';
	}
}
