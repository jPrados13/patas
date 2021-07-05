package com.proyecto.patas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.patas.model.PetShelter;

public interface PetShelterRepository extends JpaRepository<PetShelter, Long>{

	List<PetShelter> findByName(String name);
	
}
