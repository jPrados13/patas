package com.proyecto.patas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.proyecto.patas.model.Adopter;
import com.proyecto.patas.repositories.AdopterRepository;

@Service
public class AdopterService {

	@Autowired
	AdopterRepository repository;
	
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	
	public Adopter save(Adopter a) {
		a.setPassword(passwordEncoder.encode(a.getPassword()));
		return repository.save(a);
	}
	
	public void delete(String dni) {
		repository.deleteById(dni);
	}
	
	public Adopter edit(Adopter a) {
		return repository.save(a);
	}
	
	public Adopter findById(String dni) {
		return repository.findByDni(dni);
	}
	
	public Adopter findByEmail(String email) {
		return repository.findByEmail(email);
	}
	
	public List<Adopter> findAll(){
		return repository.findAll();
	}
	
}
