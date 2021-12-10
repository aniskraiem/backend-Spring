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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table( name= "Facture")
@Getter
@Setter
public class Facture  implements Serializable {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idFacture")
	private long idFacture; 
	@Column(name="montantRemise")
	private float montantRemise;
	@Column(name="montantFacture")
	private float montantFacture;
	@Temporal(TemporalType.DATE)
	@Column(name="dateFacture")
	private Date dateFacture;
	@Column(name="active")
	private Boolean active;
	@OneToMany(cascade = CascadeType.ALL, mappedBy="Facture")
	private Set<detailFacture> detailFactures;
	@ManyToOne
	private Client Client;


	public Facture(float montantRemise, float montantFacture, Date dateFacture, Boolean active) {
		this.montantRemise = montantRemise;
		this.montantFacture = montantFacture;
		this.dateFacture = dateFacture;
		this.active = active;
	}

	public Facture() {

	}

	public long getIdFacture(){
		return idFacture;
	}
	public void setMontantRemise (float setMontantRemise){

		this.montantRemise = montantRemise;

		}
	public float getMontantRemise(){

		return montantRemise;
	}
	public void setMontantFacture (float setMontantFacture){

		this.montantFacture = montantFacture;

		}
 	public float getMontantFacture(){

		return montantFacture;

		}
 	public void setDateFacture (Date setDateFacture){

		this.dateFacture = dateFacture;

		}
 	public Date getDateFacture(){

		return dateFacture;

		}
 	public void setActive (Boolean setActive){

		this.active = active;

		}
 	public Boolean isActive(){

		return active;

		}
 

	
}
