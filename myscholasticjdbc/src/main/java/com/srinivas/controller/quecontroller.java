package com.srinivas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.srinivas.entity.Quesnaire;
import com.srinivas.service.queservice;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/fau")
public class quecontroller {
	
	@Autowired
	queservice quesev;

    @GetMapping(value = "/que")
    public List<Quesnaire> getAllQuesnaire(){
        return quesev.findAll();
    }
	@GetMapping(value = "/quesnair/{id}")
	public List<Quesnaire> getQue(@PathVariable("id") Integer id) {
		return quesev.findById(id); 
	}
	@GetMapping(value = "/ques/{quename}")
	public Quesnaire getname(@PathVariable("quename") String quename) {
		return quesev.findbyname(quename); 
	}
	
	
    

    @PostMapping("/quesnaire")
	public Quesnaire  saveQue(@RequestBody Quesnaire quesnaire) {
		return quesev.save( quesnaire);
	}
    
  
    @DeleteMapping(value="/quesnair/{id}")
    public void DeleteQue(@PathVariable Integer id) {
    	quesev.deleteById(id);
    }
}
