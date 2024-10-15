package com.malak.voyages.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Type {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idType;
	private String nomType;
	private String descriptionType ;
	
	@OneToMany(mappedBy = "type")
	@JsonIgnore
	private List<Voyage> voyages;

	
	

	public Type() {
		super();
	}
	
	
	public Type(String nomType, String descriptionType, List<Voyage> voyages) {
		super();
		this.nomType = nomType;
		this.descriptionType = descriptionType;
		this.voyages = voyages;
	}

	public Long getIdType() {
		return idType;
	}
	public void setIdType(Long idType) {
		this.idType = idType;
	}
	public String getNomType() {
		return nomType;
	}
	public void setNomType(String nomType) {
		this.nomType = nomType;
	}
	public String getDescriptionType() {
		return descriptionType;
	}
	public void setDescriptionType(String descriptionType) {
		this.descriptionType = descriptionType;
	}
	
	public List<Voyage> getVoyages() {
		return voyages;
	}

	public void setVoyages(List<Voyage> voyages) {
		this.voyages = voyages;
	}


	@Override
	public String toString() {
		return "Type [idType=" + idType + ", nomType=" + nomType + ", descriptionType=" + descriptionType + ", voyages="
				+ voyages + "]";
	}

	
	
	
	
}
