package com.srinivas.repository;



import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.SQLExceptionSubclassTranslator;
import org.springframework.stereotype.Repository;


import com.srinivas.entity.Register;
@Repository
public class regrepository {
	@Autowired
	 JdbcTemplate jdbc;
    public int regsave(Register p){    
        String sql="insert into Register(id,name,email,username,password)  values("+"\""+p.getId()+"\""+","+"\""+p.getName()+"\""+","+"\""+p.getEmail()+"\""+","+"\""+p.getUsername()+"\""+","+"\""+p.getPassword()+"\""+")";
        return jdbc.update(sql);    
    }  

    
    public   Register findUsername(String username)  {    
    	try {
    		String sql="select * from Register where username =?";    
            return jdbc.queryForObject(sql, new Object[] {username},new BeanPropertyRowMapper<Register>(Register.class))  ;    
    }catch(EmptyResultDataAccessException exception)
            { return null;
            }
    }
        

    public   Register  findbyemailidandpassword(String username,String password)  {    
    	try {
    		String sql="select * from Register where username=? and password=?";    
            return jdbc.queryForObject(sql, new Object[] {username ,password},new BeanPropertyRowMapper<Register>(Register.class))  ;    
    }catch(EmptyResultDataAccessException exception)
            { return null;
            }
    }
    
    
    } 

