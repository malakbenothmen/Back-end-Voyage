package com.malak.voyages.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.malak.voyages.entities.Type;
import com.malak.voyages.entities.Voyage;
import com.malak.voyages.repos.TypeRepository;

@RestController
@RequestMapping("/api/type")
@CrossOrigin("http://localhost:4200/")
public class TypeRESTController {
	
	
	@Autowired
	TypeRepository typeRepository;
	@RequestMapping(method=RequestMethod.GET)
	public List<Type> getAllTypes()
	{
	return typeRepository.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Type createVoyage(@RequestBody Type tp) {
	return typeRepository.save(tp);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Type getTypeById(@PathVariable("id") Long id) {
	return typeRepository.findById(id).get();
	}

}
