package com.malak.voyages.service;

import java.util.List;

import com.malak.voyages.entities.Type;
import com.malak.voyages.entities.Voyage;

public interface VoyageService {
	Voyage saveVoyage(Voyage v);
	Voyage updateVoyage(Voyage v);
	void deleteVoyage(Voyage v);
	 void deleteVoyageById(Long id);
	 Voyage getVoyage(Long id);
	List<Voyage> getAllVoyages();
	List<Voyage> findByDestination(String des);
	List<Voyage> findByDestinationContains(String des);
	List<Voyage> findByDestinationPrix (String nom, Double prix);
	List<Voyage> findByType (Type type);
	List<Voyage> findByTypeIdType(Long id);
	List<Voyage> findByOrderByDestinationAsc();
	List<Voyage> trierVoyagesDestinationPrix();



}
