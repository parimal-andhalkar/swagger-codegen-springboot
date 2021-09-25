package com.swagger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pet.ApiException;
import com.pet.handler.PetApi;
import com.pet.model.Pet;

@RestController
@RequestMapping("/pets")
public class PetController {

	@Autowired
	private PetApi petApi;

	@GetMapping("/hello")
	public String getHello() {

		return "Hello World....";
	}

 @GetMapping("/pet/{id}") 
 public Pet getpets(@PathVariable("id") int id) throws ApiException{
	 
	return petApi.getPetById(id);
  }
}
