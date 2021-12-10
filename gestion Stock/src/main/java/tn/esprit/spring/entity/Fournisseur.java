package tn.esprit.spring.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table( name = "Fournisseur")
@Getter
@Setter
public class Fournisseur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idFournisseur")
	private long idFournisseur; 
	@Column(name="code")
	private String code;
	@Column(name="libelle")
	private String libelle;

	public Fournisseur(String code, String libelle) {
		this.code = code;
		this.libelle = libelle;
	}

	public Fournisseur() {

	}

	public long getIdFournisseur(){
		return idFournisseur;
	}
	public void setCode (String setCode){

		this.code = code;

		}
 	public String getCode(){

		return code;

		}
 	public void setLibelle (String setLibelle){

		this.libelle = libelle;

		}
 	public String getLibelle(){

		return libelle;

		}
 

	

}
