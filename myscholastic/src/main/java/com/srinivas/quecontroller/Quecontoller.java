package com.srinivas.quecontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


import com.srinivas.entity.Quesnaire;
import com.srinivas.repo.Quesrepo;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/fau")
public class Quecontoller {
	@Autowired
	private Quesrepo querepo;
	@GetMapping("/que")
	public List<Quesnaire> getAllQuesnaire() {
		return querepo.findAll();
	}

	
    @PostMapping("/quesnaire")
    public Quesnaire  saveQuesnaire(@RequestBody Quesnaire quesnaire){
        return querepo.save(quesnaire);
    }
	
	
}
