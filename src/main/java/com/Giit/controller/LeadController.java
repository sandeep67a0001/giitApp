package com.Giit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Giit.dto.LeadData;
import com.Giit.entity.Lead;
import com.Giit.services.LeadService;
@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	//dependency injection is using
	
	//request mapping working as a web servlet
	//method is working as get dispatcher method
	
	
	
@RequestMapping("/creation")
	public String createLeadPage() {
		return "new_file";
	}
@RequestMapping("/savelead")
public String saveData(@ModelAttribute("Lead")Lead lead ,ModelMap model) {
	//"Lead"=object address
	//Lead=class name
	//lead==ref variable name
	//file handling concept is here serialiaztaion and deserialazation is coming in picture
	
leadService.saveLead(lead);
model.addAttribute("sms","record is saved");
	return "new_file";
}
@RequestMapping("/listleads")
public String getAllLeads(ModelMap model) {
	List<Lead> leads = leadService.ListAll();
	model.addAttribute("Leads",leads);
	return "search_result";
}
@RequestMapping("/delete")
public String deleteOneLead(@RequestParam("id") long id,ModelMap model ) {
	leadService.deleteById(id);
	List<Lead> leads = leadService.ListAll();
	model.addAttribute("Leads",leads);
	return "search_result";
	
}
@RequestMapping("/update")
public String updateOneLead(@RequestParam("id") long id,ModelMap model) {
	Lead lead = leadService.findById(id);
	model.addAttribute("lead", lead);
	if (lead!=null) {
		return "update";
	} else {
		model.addAttribute("error", "invalid record found");
return "error";
	}
}
@RequestMapping("/updatelead")
public String update(@ModelAttribute("Lead") Lead lead,ModelMap model) {
	leadService.saveLead(lead);
	List<Lead> leads = leadService.ListAll();
model.addAttribute("Leads",leads);
return "search_result";


}

}
