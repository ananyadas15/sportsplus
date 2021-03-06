package com.cse.sportsplus.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cse.sportsplus.models.Academy;
import com.cse.sportsplus.repository.AcademyRepository;


@RestController
@RequestMapping("/academy") 
public class AcademyController {
	
	@Autowired
	private AcademyRepository academyRepository;
	
	
	@PostMapping("/add")
	public Academy addAcademy(@RequestBody Academy academy) {
		Academy persistedAcademy = academyRepository.save(academy); 
		return persistedAcademy;
	}
	
	@GetMapping("/getAll")
	public List<Academy> getAll() {
		List <Academy> list_of_academies = academyRepository.findAll();
		return list_of_academies;
	}
	@PostMapping("/delete")
	public List<Academy> deleteAcademy(@RequestBody Academy academy) {
		academyRepository.delete(academy); 
		List <Academy> list_of_academies = academyRepository.findAll();
		return list_of_academies;
		
	}
	@PutMapping("/update")
	public List<Academy> updateAcademy(@RequestBody Academy academy) {
		String n=academy.getName();
		 Academy a=academyRepository.findByName( n);
		a.setAcademy_Created_Date(academy.getAcademy_Created_Date());
		a.setName(academy.getName());
		a.setAcademy_Updated_Date(academy.getAcademy_Created_Date());
		a.setId(academy.getId());
		List <Academy> list_of_academies = academyRepository.findAll();
		return list_of_academies;
		
		
	}
	
	
	

}

