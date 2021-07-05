package com.proyecto.patas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.patas.model.Adopter;
import com.proyecto.patas.model.PetAnimal;
import com.proyecto.patas.model.PetShelter;

public interface PetAnimalRepository extends JpaRepository<PetAnimal, Long>{
	
	List<PetAnimal> findByPetShelter(PetShelter petShelter);
	
	List<PetAnimal> findByAdopter(Adopter adopter);
	
	List<PetAnimal> findByAdopterIsNull();
	
	List<PetAnimal> findByAge(String age);
	
	List<PetAnimal> findByType(String type);
	
	List<PetAnimal> findByNameContainsIgnoreCase(String name);

}
