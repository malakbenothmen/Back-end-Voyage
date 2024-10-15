package com.malak.voyages.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.malak.voyages.entities.Type;
import com.malak.voyages.entities.Voyage;
import com.malak.voyages.repos.VoyageRepository;

@Service
public class VoyageServiceImpl implements VoyageService{
	
	@Autowired
	private VoyageRepository voyageRepository;

	@Override
	public Voyage saveVoyage(Voyage v) {		
		return voyageRepository.save(v);
	}

	@Override
	public Voyage updateVoyage(Voyage v) {
		return voyageRepository.save(v);
	
	}

	@Override
	public void deleteVoyage(Voyage v) {
		voyageRepository.delete(v);
		
	}

	@Override
	public void deleteVoyageById(Long id) {
		voyageRepository.deleteById(id);
		
	}

	@Override
	public Voyage getVoyage(Long id) {
		
		return voyageRepository.findById(id).get();	
	}

	@Override
	public List<Voyage> getAllVoyages() {
		
		return voyageRepository.findAll();
	}

	@Override
	public List<Voyage> findByDestination(String des) {
		
		return voyageRepository.findByDestination(des);
	}

	@Override
	public List<Voyage> findByDestinationContains(String des) {
		
		return voyageRepository.findByDestinationContains(des);
	}

	@Override
	public List<Voyage> findByDestinationPrix(String nom, Double prix) {
		
		return null;
	}

	@Override
	public List<Voyage> findByType(Type type) {
		
		return voyageRepository.findByType(type);
	}

	@Override
	public List<Voyage> findByTypeIdType(Long id) {	
		return voyageRepository.findByTypeIdType(id);
	}

	@Override
	public List<Voyage> findByOrderByDestinationAsc() {	
		return voyageRepository.findByOrderByDestinationAsc();
	}

	@Override
	public List<Voyage> trierVoyagesDestinationPrix() {
		return voyageRepository.trierVoyagesDestinationPrix();
	}


}
