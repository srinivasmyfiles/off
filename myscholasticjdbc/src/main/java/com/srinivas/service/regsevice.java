package com.srinivas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srinivas.entity.Quesnaire;
import com.srinivas.entity.Register;

import com.srinivas.repository.regrepository;
@Service
public class regsevice {
    @Autowired
    regrepository regrep;
    
    public Register save(Register register) {
    	regrep.regsave(register);
		return register;
	}
    
    

	public Register findbyname(String username) {
		return  regrep.findUsername(username) ;
	}



	public Register fetchbyemailandpassword(String username, String password) {
		
		return regrep.findbyemailidandpassword(username, password);
	}
}
