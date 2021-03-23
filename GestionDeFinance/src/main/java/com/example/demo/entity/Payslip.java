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
public class Payslip {
	@Id
	private String id_payslip;
	@DBRef
	private String id_user;
	@Field("amount")
	private String amount;
	@Field("pay_period")
	private String payperiod;
	@Field("company_name")
	private String companyName;
	@Field("creation_date")
	private Date creationDate;
	
	public Payslip(String id_user, String amount, String payperiod, String companyName, Date creationDate) {
		this.id_user = id_user;
		this.amount = amount;
		this.payperiod  = payperiod;
		this.companyName = companyName;
		this.creationDate = creationDate;
		
	}

	public String getId_payslip() {
		return id_payslip;
	}

	public void setId_payslip(String id_payslip) {
		this.id_payslip = id_payslip;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getPayperiod() {
		return payperiod;
	}

	public void setPayperiod(String payperiod) {
		this.payperiod = payperiod;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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
		return "Payslip id_user:"+id_user+" Amount :"+amount+" Pay Period:"+payperiod+" Companyname:"+companyName+" creationdate:"+"creationDate";
	}
}
