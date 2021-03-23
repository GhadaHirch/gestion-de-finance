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
public class Bill {
	@Id
	private String id_bill;
	@DBRef
	private String id_user;
	@Field("bill_type")
	private String bill_type;
	@Field("numero")
	private String numero;
	@Field("info_supp")
	private String info_supp;
	@Field("creationDate")
	private Date creationDate;
	
	public Bill(String id_user,String bill_type, String numero, String info_supp, Date creationDate) {
		this.id_user = id_user;
		this.bill_type = bill_type;
		this.numero  = numero;
		this.info_supp  = info_supp;
		this.creationDate =creationDate;
	}
	
	
	public String getId_bill() {
		return id_bill;
	}

	public void setId_bill(String id_bill) {
		this.id_bill = id_bill;
	}

	public String getBill_type() {
		return bill_type;
	}

	public void setBill_type(String bill_type) {
		this.bill_type = bill_type;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getInfo_supp() {
		return info_supp;
	}

	public void setInfo_supp(String info_supp) {
		this.info_supp = info_supp;
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
		return "Contract id_user:"+id_user+" Bill Type :"+bill_type+", Info Supp:"+info_supp+", Numero:"+numero+" Creation Date:"+creationDate;
	}
}
