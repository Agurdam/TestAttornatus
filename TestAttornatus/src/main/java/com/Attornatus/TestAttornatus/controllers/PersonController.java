package com.Attornatus.TestAttornatus.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Attornatus.TestAttornatus.model.PersonModel;
import com.Attornatus.TestAttornatus.repositories.PersonRepository;

@RestController
@RequestMapping(value = "/personModel")
public class PersonController {
	
	@Autowired
	private PersonRepository repository;
	
	@GetMapping
	public List<PersonModel> getAll(){
		List<PersonModel> result = repository.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public PersonModel get(@PathVariable Long id){
		PersonModel result = repository.findById(id).get();
		return result;
	}
	
	@PostMapping
	public PersonModel insert(@RequestBody PersonModel person){
		PersonModel result = repository.save(person);
		return result;
	}
	
	@PostMapping(value = "/{id}")
	public PersonModel update(@RequestBody PersonModel person){
		PersonModel result = repository.save(person);
		return result;
	}
	
	@DeleteMapping(value = "/{id}")
	public PersonModel delete(@PathVariable Long id){
		PersonModel person = repository.findById(id).get();
	    if(person != null){
	        repository.delete(person);
	    }
	    return person;
	}


}
