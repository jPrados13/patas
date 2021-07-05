package com.proyecto.patas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.patas.model.Adopter;

public interface AdopterRepository extends JpaRepository<Adopter, String>{

	Adopter findByEmail(String email);
	
	Adopter findByDni(String dni);
}
