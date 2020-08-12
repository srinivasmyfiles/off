package com.srinivas.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "QUESNAIRE")
public class Quesnaire  implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="QUT_ID")
  private int id;
	@Column(name ="QUT_NAME")
  private String quename;
	@Column(name ="QUT_DESCRIPCTION")
  private String quediscr;
	@Column(name ="CREATEDBY")
  private String createdby;
	@Column(name ="UPDATEBY")
  private String updateby;
	@Column(name ="DELETEBY")
  private String deleteby;
	@Column(name =" ACTIVE")
  private String active;
	
	public String getQuename() {
		return quename;
	}
	public void setQuename(String quename) {
		this.quename = quename;
	}
	public String getQuediscr() {
		return quediscr;
	}
	public void setQuediscr(String quediscr) {
		this.quediscr = quediscr;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	public String getUpdateby() {
		return updateby;
	}
	public void setUpdateby(String updateby) {
		this.updateby = updateby;
	}
	public String getDeleteby() {
		return deleteby;
	}
	public void setDeleteby(String deleteby) {
		this.deleteby = deleteby;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
}
