package com.example.demo.entity;

import java.util.Date;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Payslip {
	@Id
	private String idPayslip;
	@DBRef
	private Contract idContract;
	@Field("amount")
	private String amount;
	@Field("prime")
	private String prime;
	@Field("id_generated")
	private String idGenerated;
	@Field("creation_date")
	private Date creationDate;
	@Field("free_field")
	private String freeField;
	
	public Payslip(Contract idContract,String amount, String prime, String idGenerated, Date creationDate,String freeField) {
		this.idContract = idContract;
		this.amount = amount;
		this.prime  = prime;
		this.idGenerated = idGenerated;
		this.creationDate = creationDate;
		this.freeField = freeField;
		
	}
	public String getIdPayslip() {
		return idPayslip;
	}
	public void setIdPayslip(String idPayslip) {
		this.idPayslip = idPayslip;
	}
	public Contract getIdContract() {
		return idContract;
	}
	public void setIdContract(Contract idContract) {
		this.idContract = idContract;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getPrime() {
		return prime;
	}
	public void setPrime(String prime) {
		this.prime = prime;
	}
	public String getIdGenerated() {
		return idGenerated;
	}
	public void setIdGenerated(String idGenerated) {
		this.idGenerated = idGenerated;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public String getFreeField() {
		return freeField;
	}
	public void setFreeField(String freeField) {
		this.freeField = freeField;
	}
	public String toString() {
		return "Payslip idContract:"+idContract+"  amount:"+amount+" prime :"+prime+" idGenerated:"+idGenerated+" creationDate:"+creationDate+" freeField:"+"freeField";
	}
}
