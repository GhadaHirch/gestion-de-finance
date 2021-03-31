package com.example.demo.entity;

import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
	@Id
	private String idUser;
	@DBRef
	private String idRole;
	@Field("first_name")
	private String firstName;
	@Field("last_name")
	private String lastName;
	@Field("Mail")
	private String mail;
	@Field("password")
	private String password;

	
	public User(String idRole,String firstName, String lastName, String mail, String password) {
		this.idRole = idRole;
		this.firstName = firstName;
		this.lastName  = lastName;
		this.mail= mail;
		this.password = password;
	}

	public String getIdUser() {
		return idUser;
	}

	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}
	public String getIdRole() {
		return idRole;
	}
	public void setIdRole(String idRole) {
		this.idRole = idRole;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String toString() {
		return "User idRole:"+idRole+" First Name:"+firstName+" Last Name:"+lastName+" mail:"+mail+" password:"+password;
	}
}
