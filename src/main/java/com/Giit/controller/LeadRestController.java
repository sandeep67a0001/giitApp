package com.Giit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Giit.entity.Lead;
import com.Giit.services.LeadService;

@RestController
@RequestMapping("/leads")
//makes it a web services layer
public class LeadRestController {

@Autowired
private LeadService leadservice;


@GetMapping
public List<Lead> getAllLeads(){
	List<Lead> leads = leadservice.ListAll();
	return leads;
}
@PostMapping
public void saveOneLead(@RequestBody Lead lead) {
	leadservice.saveLead(lead);
}
@PutMapping
public void updateOneLead(@RequestBody Lead lead) {
	leadservice.saveLead(lead);
}
@DeleteMapping("/delete/{id}")
public void deleteOneLead(@PathVariable("id") long id) {
	leadservice.deleteById(id);
}
@GetMapping("/api/get/{id}")
public Lead getOneLead(@PathVariable("id") long id) {
	Lead lead = leadservice.findById(id);
	return lead;
}



}