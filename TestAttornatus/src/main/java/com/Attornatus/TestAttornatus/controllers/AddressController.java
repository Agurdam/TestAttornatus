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

import com.Attornatus.TestAttornatus.model.AddressModel;
import com.Attornatus.TestAttornatus.repositories.AddressRepository;


@RestController
@RequestMapping(value = "/addressModel")
public class AddressController {
	@Autowired
	private AddressRepository repository;
	
	@GetMapping
	public List<AddressModel> getAll(){
		List<AddressModel> result = repository.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public AddressModel get(@PathVariable Long id){
		AddressModel result = repository.findById(id).get();
		return result;
	}
	
	@PostMapping
	public AddressModel insert(@RequestBody AddressModel address){
		AddressModel result = repository.save(address);
		return result;
	}
	
	@PostMapping(value = "/{id}")
	public AddressModel update(@RequestBody AddressModel address){
		AddressModel result = repository.save(address);
		return result;
	}
	
	@DeleteMapping(value = "/{id}")
	public AddressModel delete(@PathVariable Long id){
	    AddressModel address = repository.findById(id).get();
	    if(address != null){
	        repository.delete(address);
	    }
	    return address;
	}

}
