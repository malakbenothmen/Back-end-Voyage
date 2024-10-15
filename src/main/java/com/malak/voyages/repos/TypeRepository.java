package com.malak.voyages.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.malak.voyages.entities.Type;
import com.malak.voyages.entities.Voyage;

public interface TypeRepository extends JpaRepository<Type, Long> {

}
