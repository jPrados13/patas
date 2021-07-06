package com.proyecto.patas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.patas.model.Adopter;
import com.proyecto.patas.model.PetAnimal;
import com.proyecto.patas.model.PetShelter;
import com.proyecto.patas.repositories.PetAnimalRepository;

@Service
public class PetAnimalService {

	@Autowired
	PetAnimalRepository repository;
	
	
	public PetAnimal insert(PetAnimal p) {
		return repository.save(p);
	}
	
	public void delete(long id) {
		repository.deleteById(id);
	}
	
	public void delete(PetAnimal p) {
		if (!p.getImage().isEmpty())
			//storageService.delete(p.getImagen());
		repository.delete(p);
	}
	
	public PetAnimal edit(PetAnimal p) {
		return repository.save(p);
	}
	
	public PetAnimal findById(long id) {
		return repository.findById(id).orElse(null);
	}
	
	public List<PetAnimal> findAll() {
		return repository.findAll();
	}
	
	public List<PetAnimal> PetAnimalsFromAdopter(Adopter a) {
		return repository.findByAdopter(a);
	}
	
	public List<PetAnimal> PetAnimalsFromShelter(PetShelter s) {
		return repository.findByPetShelter(s);
	}
	
	public List<PetAnimal> PetAnimalsWithoutAdopter() {
		return repository.findByAdopterIsNull();
	}
	
	public List<PetAnimal> manyFromId(List<Long> ids) {
		return repository.findAllById(ids);
	}

}
