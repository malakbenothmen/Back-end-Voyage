package com.malak.voyages.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.malak.voyages.entities.Type;


@RepositoryRestResource(path = "type")
@CrossOrigin("http://localhost:4200/") 
public interface TypeRepository extends JpaRepository<Type, Long> {

}
