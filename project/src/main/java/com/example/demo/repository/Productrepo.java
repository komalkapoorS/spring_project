package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Productentity;

@Repository
public interface Productrepo extends JpaRepository<Productentity,Integer> {
	

}
