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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table( name= "detailFacture")
@Getter
@Setter
public class detailFacture implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idDetailFacture")
	private long idDetailFacture; 
	@Column(name="qte")
	private int qte;
	@Column(name="prixTotal")
	private float prixTotal;
	@Column(name="pourcentageRemise")
	private int pourcentageRemise;
	@Column(name="montantRemise")
	private float montantRemise;
	@OneToMany(cascade = CascadeType.ALL, mappedBy="detailFacture")
	private Set<Produit> Produits;
	@ManyToOne
	private Facture Facture;


	public detailFacture() {
	}

	public detailFacture(int qte, float prixTotal, int pourcentageRemise, float montantRemise, tn.esprit.spring.entity.Facture facture) {
		this.qte = qte;
		this.prixTotal = prixTotal;
		this.pourcentageRemise = pourcentageRemise;
		this.montantRemise = montantRemise;
		Facture = facture;
	}

	public void setIdDetailFacture(long idDetailFacture) {
		this.idDetailFacture = idDetailFacture;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	public void setPrixTotal(float prixTotal) {
		this.prixTotal = prixTotal;
	}

	public void setPourcentageRemise(int pourcentageRemise) {
		this.pourcentageRemise = pourcentageRemise;
	}

	public void setMontantRemise(float montantRemise) {
		this.montantRemise = montantRemise;
	}

	public void setProduits(Set<Produit> produits) {
		Produits = produits;
	}

	public void setFacture(tn.esprit.spring.entity.Facture facture) {
		Facture = facture;
	}

	public long getIdDetailFacture() {
		return idDetailFacture;
	}

	public int getQte() {
		return qte;
	}

	public float getPrixTotal() {
		return prixTotal;
	}

	public int getPourcentageRemise() {
		return pourcentageRemise;
	}

	public float getMontantRemise() {
		return montantRemise;
	}

	public Set<Produit> getProduits() {
		return Produits;
	}

	public tn.esprit.spring.entity.Facture getFacture() {
		return Facture;
	}

	@Override
	public String toString() {
		return "detailFacture{" +
				"idDetailFacture=" + idDetailFacture +
				", qte=" + qte +
				", prixTotal=" + prixTotal +
				", pourcentageRemise=" + pourcentageRemise +
				", montantRemise=" + montantRemise +
				", Produits=" + Produits +
				", Facture=" + Facture +
				'}';
	}
}
