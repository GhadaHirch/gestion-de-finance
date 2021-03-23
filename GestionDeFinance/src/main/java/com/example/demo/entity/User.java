package com.example.demo.entity;

import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class User {
	@Id
	private String id_user;
	
	@Field("first_name")
	private String firstName;
	@Field("last_name")
	private String lastName;
	@Field("Mail")
	private String mail;
	@Field("login")
	private String login;
	@Field("password")
	private String password;
	@Field("phoneNumber")
	private String phoneNumber;
	
	public User(String firstName, String lastName, String mail,
			String login, String password, String phoneNumber) {
		this.firstName = firstName;
		this.lastName  = lastName;
		this.mail= mail;
		this.login = login;
		this.password = password;
		this.phoneNumber = phoneNumber;
		
	}

	
	public String getId_user() {
		return id_user;
	}


	public void setId_user(String id_user) {
		this.id_user = id_user;
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


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String toString() {
		return "Person First Name:"+firstName+" Last Name:"+lastName+" mail:"+mail+" login:"+login+" password:"+password+" phoneNumber:"+phoneNumber;
	}
}
