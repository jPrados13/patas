package com.proyecto.patas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.patas.model.PetAnimal;
import com.proyecto.patas.model.PetShelter;
import com.proyecto.patas.repositories.PetShelterRepository;

@Service
public class PetShelterService {

	@Autowired
	PetShelterRepository repository;
	
	@Autowired
	PetAnimalService animalService;
	
	public PetShelter insert(PetShelter p) {
		return repository.save(p);
	}
	
	public void delete(long id) {
		repository.deleteById(id);
	}
	
//	public void delete(PetShelter p) {
//		
//		if(!p.getImage().isEmpty()) {
//			//storageService.delete(p.getImagen());
//		}
//		
//		repository.delete(p);
//		
//	}
	
	public PetShelter edit(PetShelter p) {
		return repository.save(p);
	}
	
	public PetShelter findById(long id) {
		return repository.findById(id).orElse(null);
	}
	
	public List<PetShelter> findAll(){
		return repository.findAll();
	}
	
	public List<PetShelter> findManyFromId(List<Long> ids){
		return repository.findAllById(ids);
	}
	
	public PetAnimal addPetToShelter(PetAnimal p, PetShelter s) {
		p.setShelter(s);
		return animalService.insert(p);
	}
}
