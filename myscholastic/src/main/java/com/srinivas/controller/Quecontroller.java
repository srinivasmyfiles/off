package com.srinivas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srinivas.repo.Quesrepo;
import com.srinivas.entity.Quesnaire;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/fau")
public class Quecontroller {
	@Autowired
	private  Quesrepo  quesrepo;
	
	@GetMapping("/que")
	public List<Quesnaire> getAllQuesnaire(){
		return quesrepo.findAll();
	}
	
	
	



}
