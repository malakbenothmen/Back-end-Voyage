package com.malak.voyages.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.malak.voyages.entities.Voyage;

import aj.org.objectweb.asm.Type;
@RepositoryRestResource(path = "rest")

public interface VoyageRepository extends JpaRepository<Voyage, Long> {
	List<Voyage> findByDestination(String d);
	List<Voyage> findByDestinationContains(String d);
	
	/*@Query("select v from Voyage v where v.destination like %?1 and v.prixVoyage > ?2")
	List<Voyage> findByDestinationPrix (String des, Double prix);*/
	
	
	@Query("select v from Voyage v where v.destination like %:destination and v.prixVoyage > :prix")
	List<Voyage> findByDestinationPrix (@Param("destination") String destination,@Param("prix") Double prix);
	
	
	@Query("select v from Voyage v where v.type = ?1")
	List<Voyage> findByType (com.malak.voyages.entities.Type tp);
	
	
	List<Voyage> findByTypeIdType(Long id);
	
	List<Voyage> findByOrderByDestinationAsc();
	
	@Query("select v from Voyage v order by v.destination ASC, v.prixVoyage DESC")
	List<Voyage> trierVoyagesDestinationPrix ();



}
