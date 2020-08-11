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
	@Override
	public String toString() {
		return "Quesnaire [id=" + id + ", quename=" + quename + ", quediscr=" + quediscr + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
