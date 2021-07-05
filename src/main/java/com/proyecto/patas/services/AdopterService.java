package com.proyecto.patas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.patas.repositories.AdopterRepository;

@Service
public class AdopterService {

	@Autowired
	AdopterRepository repository;
	
}
