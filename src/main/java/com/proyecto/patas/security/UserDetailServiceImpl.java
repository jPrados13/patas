package com.proyecto.patas.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.proyecto.patas.model.Adopter;
import com.proyecto.patas.repositories.AdopterRepository;

public class UserDetailServiceImpl implements UserDetailsService {
	
	@Autowired
	AdopterRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Adopter adopter = repository.findByEmail(username);
		
		UserBuilder builder = null;
		
		if (adopter != null) {
			builder = User.withUsername(username);
			builder.disabled(false);
			builder.password(adopter.getPassword());
			builder.authorities(new SimpleGrantedAuthority("ROLE_USER"));
			
		}else {
			throw new UsernameNotFoundException("Email no encontrado");
		}
		
		return builder.build();
		 
	}

}
