package com.Giit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Giit.entity.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

	///we have used jpa repository instaead of crud repository
	
	
	
}
