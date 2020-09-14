package com.srinivas.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.srinivas.entity.Quesnaire;

@Repository
public class querepository {
	
	   @Autowired
	    JdbcTemplate jdbc;
	

	
    public List<Quesnaire> findAll(){    
        return jdbc.query("select * from Quesnaire ",new RowMapper<Quesnaire >(){    
            public Quesnaire mapRow(ResultSet rs, int row) throws SQLException {    
            	Quesnaire  e=new Quesnaire();    
                e.setId(rs.getInt(1));
                e.setQuename(rs.getString(2));  
                e.setQuediscr(rs.getString(3));    
                e.setCreatedby(rs.getString(4));
                e.setUpdateby(rs.getString(5));    
                e.setDeleteby(rs.getString(6));  
                e.setActive(rs.getString(7));    
                return e;    
            }    
        }); 
  
    }
    
    public int save(Quesnaire p){    
        String sql="insert into Quesnaire(id,quename,quediscr,createdby,updateby,deleteby,active)  values("+"\""+p.getId()+"\""+","+"\""+p.getQuename()+"\""+","+"\""+p.getQuediscr()+"\""+","+"\""+p.getCreatedby()+"\""+","+"\""+p.getUpdateby()+"\""+","+"\""+p.getDeleteby()+"\""+","+"\""+p.getActive()+"\""+")";
        return jdbc.update(sql);    
    }  
    
    public int deleteById(int id){    
        String sql="delete from Quesnaire where id="+id+"";    
        return jdbc.update(sql);    
    }  

//	public Quesnaire findById(int id){    
//        String sql="select * from Quesnaire where id=?";    
//        return  jdbc.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Quesnaire>(Quesnaire.class));    
//    } 
    
    
    	public List<Quesnaire> findById(int id){    
      String sql="select * from Quesnaire where id=?";    
      return  (List<Quesnaire>) jdbc.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Quesnaire>(Quesnaire.class));    
  } 
    public Quesnaire findQuename(String quename){    
        String sql="select * from Quesnaire where quename=?";    
        return jdbc.queryForObject(sql, new Object[] {quename},new BeanPropertyRowMapper<Quesnaire>(Quesnaire.class));    
    } 
    
    

}
