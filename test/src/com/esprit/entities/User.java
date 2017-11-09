package com.esprit.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer cin;
	
	
	private String name;

	
	public Integer getCin() {
		return cin;
	}
	
	
	public void setCin(Integer cin) {
		this.cin = cin;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
