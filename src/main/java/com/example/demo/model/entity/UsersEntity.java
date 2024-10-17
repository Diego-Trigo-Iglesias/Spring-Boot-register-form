package com.example.demo.model.entity;

public class UsersEntity {
	private long code;
	private String name, lastName, direction, mail,tlf;
	
	public UsersEntity() {
		super();
	}
	
	public UsersEntity(long code, String name, String lastName, String direction, String mail, String tlf) {
		super();
		this.code = code;
		this.name = name;
		this.lastName = lastName;
		this.direction = direction;
		this.mail = mail;
		this.tlf = tlf;
	}


	public long getCode() {
		return code;
	}
	public void setCode(long code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTlf() {
		return tlf;
	}
	public void setTlf(String tlf) {
		this.tlf = tlf;
	} 
	
	
	
}
