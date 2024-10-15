package com.malak.voyages.entities;

import java.time.LocalDate;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;



@Entity
public class Voyage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVoyage ;
    private String destination; 
    private LocalDate dateDepart; 
    private LocalDate dateRetour; 
    private Double prixVoyage; 
    private int nbPersonnes; 
    private String moyTransport; // avion, train, etc..
    private String description;
    
    @ManyToOne
    private Type type ;
    
    
    
    
    
	public Type getType() {
		return type;
	}


	public void setType(Type type) {
		this.type = type;
	}


	public Voyage() {
		super();
	}
	

	public Voyage(String destination, LocalDate dateDepart, LocalDate dateRetour, Double prixVoyage, int nbPersonnes,
			String moyTransport, String description) {
		super();
		this.destination = destination;
		this.dateDepart = dateDepart;
		this.dateRetour = dateRetour;
		this.prixVoyage = prixVoyage;
		this.nbPersonnes = nbPersonnes;
		this.moyTransport = moyTransport;
		this.description = description;
	}




	public Long getIdVoyage() {
		return idVoyage;
	}



	public void setIdVoyage(Long idVoyage) {
		this.idVoyage = idVoyage;
	}



	public String getDestination() {
		return destination;
	}



	public void setDestination(String destination) {
		this.destination = destination;
	}



	public LocalDate getDateDepart() {
		return dateDepart;
	}



	public void setDateDepart(LocalDate dateDepart) {
		this.dateDepart = dateDepart;
	}



	public LocalDate getDateRetour() {
		return dateRetour;
	}



	public void setDateRetour(LocalDate dateRetour) {
		this.dateRetour = dateRetour;
	}



	public Double getPrixVoyage() {
		return prixVoyage;
	}



	public void setPrixVoyage(Double prixVoyage) {
		this.prixVoyage = prixVoyage;
	}





	public int getNbPersonnes() {
		return nbPersonnes;
	}





	public void setNbPersonnes(int nbPersonnes) {
		this.nbPersonnes = nbPersonnes;
	}





	public String getMoyTransport() {
		return moyTransport;
	}





	public void setMoyTransport(String moyTransport) {
		this.moyTransport = moyTransport;
	}





	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public String toString() {
		return "Voyage [idVoyage=" + idVoyage + ", destination=" + destination + ", dateDepart=" + dateDepart
				+ ", dateRetour=" + dateRetour + ", prixVoyage=" + prixVoyage + ", nbPersonnes=" + nbPersonnes
				+ ", moyTransport=" + moyTransport + ", description=" + description + "]";
	}
	
	
	
	
	
}