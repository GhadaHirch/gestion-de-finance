package com.example.demo.entity;

import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Contract {
	@Id
	private String id_contract;
	@DBRef
	private String id_user;
	@Field("companyName")
	private String companyName;
	@Field("period")
	private String period;
	@Field("contractType")
	private String contractType;
	@Field("creationDate")
	private Date creationDate;
	public Contract(String id_user,String companyName, String period, String contractType, Date creationDate) {
		this.id_user = id_user;
		this.companyName = companyName;
		this.period  = period;
		this.contractType       = contractType;
		this.creationDate =creationDate;
	}
	public String getId_contract() {
		return id_contract;
	}
	public void setId_contract(String id_contract) {
		this.id_contract = id_contract;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public String getContractType() {
		return contractType;
	}
	public void setContractType(String contractType) {
		this.contractType = contractType;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
		
	
	public String getId_user() {
		return id_user;
	}
	public void setId_user(String id_user) {
		this.id_user = id_user;
	}
	public String toString() {
		return "Contract id_user:"+id_user+" Company Name:"+companyName+" Period:"+period+" Creation Date:"+creationDate;
	}
}
