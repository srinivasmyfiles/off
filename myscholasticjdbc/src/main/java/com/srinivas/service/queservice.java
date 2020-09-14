package com.srinivas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.srinivas.entity.Quesnaire;
import com.srinivas.repository.querepository;

@Service
public class queservice {
    @Autowired
	querepository querep;
    public Quesnaire save(Quesnaire quesnaire) {
		querep.save(quesnaire);
		return quesnaire;
	}
	public List<Quesnaire>findAll(){
		return querep.findAll();
	}
	
	public void deleteById(int id) {
		querep.deleteById(id);
	}
	
	public List<Quesnaire> findById(int id) {
		return  querep.findById(id);
	}
	
	public Quesnaire  findbyname(String quename) {
		return querep.findQuename(quename);
	}
}
