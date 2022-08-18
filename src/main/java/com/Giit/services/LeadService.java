package com.Giit.services;

import java.util.List;

import com.Giit.entity.Lead;

public interface LeadService {
	
	
	public void saveLead(Lead lead); 
	
	public List<Lead>ListAll();

	public void deleteById(long id);

	public Lead findById(long id);


		
	//abstraction is using by interfaces

}
