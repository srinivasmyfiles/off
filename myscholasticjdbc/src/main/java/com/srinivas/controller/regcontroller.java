
package com.srinivas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srinivas.entity.Quesnaire;
import com.srinivas.entity.Register;

import com.srinivas.service.regsevice;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/reg")
public class regcontroller {
    @Autowired
	regsevice regsev;
    
  
    @PostMapping("/register")
  	public Register  regsave(@RequestBody Register register) {
  		return regsev.save( register);
  	}

//	@GetMapping(value = "/users/{username}")
//	public  boolean  getname(@PathVariable("username") String username) {
//		  boolean usernamer=regsev.findbyname(username);
//		return usernamer;
//
//	}
//	
	@PostMapping("/Reg")
	public Register registerUser(@RequestBody Register register) throws Exception{
		String username=register.getUsername();
		if(username !=null &&!"".equals(username) ) {
			Register user=regsev.findbyname(username);
			if ( user !=null) {
				throw new Exception("user with "+username+" already exit");
			}
		}
		Register user =null;
		user =regsev.save(register);
		return user;	
	}
	
	
	@PostMapping("/login")
	public Register loginUser(@RequestBody Register register)throws Exception {
		String username=register.getUsername();
		String password=register.getPassword();
		Register userobj=null;
		if( username!=null && password !=null  ) {
			 userobj=regsev.fetchbyemailandpassword(username, password);
		}
		if( userobj==null) {
			throw new Exception("bad credentials");
		}
		
		return userobj;
		}
	

}
