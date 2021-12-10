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
@Table( name= "Rayon")
@Getter
@Setter
public class Rayon {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idRayon")
	private long idRayon; 
	@Column(name="code")
	private String code;
	@Column(name="libelle")
	private String libelle;
	@OneToMany(cascade = CascadeType.ALL, mappedBy="Rayon")
	private Set<Produit> Produits;


	public Rayon(String code, String libelle) {
		this.code = code;
		this.libelle = libelle;
	}

	public long getIdRayon(){
		return idRayon;
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
