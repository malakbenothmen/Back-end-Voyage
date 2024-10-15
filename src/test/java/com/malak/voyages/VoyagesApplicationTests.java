package com.malak.voyages;

import java.time.LocalDate;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.malak.voyages.entities.Type;
import com.malak.voyages.entities.Voyage;
import com.malak.voyages.repos.VoyageRepository;

@SpringBootTest
class VoyagesApplicationTests {

	@Autowired
	private VoyageRepository voyageRepository;
	@Test
	public void testCreateVoyage() {
	Voyage voy = new Voyage( "Tunisie, Germany", LocalDate.of(2024, 1, 20), LocalDate.of(2024, 2, 5),3500.00, 30, "Avion", "Un voyage relaxant à Germany pour profiter des plages et des temples.");
	voyageRepository.save(voy);
	}
	
	@Test
	public void testFindVoyage(){
	 Voyage v = voyageRepository.findById(1L).get(); 
	 System.out.println(v);
	 }
	
	@Test
	public void testUpdateVoyage(){
	 Voyage v = voyageRepository.findById(1L).get(); 
	 v.setPrixVoyage(2000.0);
	 voyageRepository.save(v);
	 System.out.println(v);
	 }
	
	@Test
	public void testDeleteVoyage()
	{
	voyageRepository.deleteById(1L);;
	}
	
	@Test
	public void testListerTousVoyage()
	{
	List<Voyage> voys = voyageRepository.findAll();
		for (Voyage v : voys){
		System.out.println(v);
		}
	}
	
	
	@Test
	public void testFindVoyageByDestination()
	{
	List<Voyage> voys = voyageRepository.findByDestination("Tunisie, Germany");
		for (Voyage v : voys){
		System.out.println(v);
		}
	}
	
	@Test
	public void testFindVoyageByDestinationContains()
	{
	List<Voyage> voys = voyageRepository.findByDestinationContains("Tunisie");
		for (Voyage v : voys){
		System.out.println(v);
		}
	}
	
	@Test
	public void testfindByDestinationPrix()
	{ 	List<Voyage> voys = voyageRepository.findByDestinationPrix("Tunisie, Germany", 3000.0);
	for (Voyage v : voys){
	System.out.println(v);
	}
		
	}
	
	
	@Test
	public void testfindByType(){ 	
		Type tp = new Type();
		tp.setIdType(1L);
		
		List<Voyage> voys = voyageRepository.findByType(tp);
	for (Voyage v : voys){
	System.out.println(v);
	}
		
	}
	@Test
	public void testfindByTypeId(){ 	
	
		List<Voyage> voys = voyageRepository.findByTypeIdType(1L);
	for (Voyage v : voys){
	System.out.println(v);
	}
		
	}
	
	@Test
	public void testfindByOrderByDestinationAsc()
	{
	List<Voyage> voys = 
	voyageRepository.findByOrderByDestinationAsc();
	for (Voyage v : voys)
	{
	System.out.println(v);
	}
	}
	
	
	@Test
	public void testTrierVoyagesNomsPrix()
	{
	List<Voyage> voys = voyageRepository.trierVoyagesDestinationPrix();
	for (Voyage v : voys)
	{
	System.out.println(v);
	}
	}
	
	
	
	
	



	
	

}
