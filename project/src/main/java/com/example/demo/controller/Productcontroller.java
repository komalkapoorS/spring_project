package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Productentity;

import com.example.demo.repository.Productrepo;

@RestController
public class Productcontroller {
@Autowired
private Productrepo repo;
	@PostMapping("/add")
	public Productentity addpro(@RequestBody Productentity pro) {
		try {
			repo.save(pro);
			return pro;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@GetMapping("/get")
	public List<Productentity> get(){
		try {
			return repo.findAll();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@PutMapping("/update")
	public Productentity update(@RequestBody Productentity pro) {
		try {
			repo.save(pro);
			return pro;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@DeleteMapping("/delete/{Id}")
	public String delete(@PathVariable int Id) {
		try {
			@SuppressWarnings("deprecation")
			Productentity user=repo.getOne(Id);
			repo.delete(user);
			return "product deleted";
		}catch(Exception e) {
			e.printStackTrace();	
		}
		return null;
	}
}
