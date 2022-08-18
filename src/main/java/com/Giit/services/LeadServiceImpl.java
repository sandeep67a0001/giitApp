package com.Giit.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Giit.entity.Lead;
import com.Giit.repository.LeadRepository;
@Service
public class LeadServiceImpl implements LeadService {
	
	//inheritance is using (interface to class so i have written implements)
	
	@Autowired
	private LeadRepository leadRepo;
	
	//compile time polymorphism is using-overriding
	
	
	@Override
	public void saveLead(Lead lead) {
leadRepo.save(lead);
	}

	@Override
	public List<Lead> ListAll() {
		List<Lead> leads = leadRepo.findAll();
		//collection concept is here list collection concept is using
		return leads;
	}

	@Override
	public void deleteById(long id) {
		leadRepo.deleteById(id);
	}

	@Override
	public Lead findById(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		
	if (findById.isPresent()) {
		Lead lead = findById.get();
		return lead;
	} else {
		return null;

	}
	}

	

}
