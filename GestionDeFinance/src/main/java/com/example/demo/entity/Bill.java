package com.example.demo.entity;

import org.springframework.data.mongodb.core.mapping.Field;
import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Bill {
	@Id
	private String idBill;
	@DBRef
	private User idUser;
	@Field("title")
	private String title;
	@Field("amount_BC")
	private String amountBC;
	@Field("TVA")
	private String TVA;
	@Field("timbre")
	private String timbre;
	@Field("amount_TT")
	private String amountTT;
	@Field("id_generated")
	private String idGenerated;
	@Field("creation_date")
	private Date creationDate;
	@Field("free_field")
	private String freeField;
	
	public Bill(User idUser,String title, String amountBC, String TVA,String timbre,String amountTT,String idGenerated,Date creationDate,String freeField) {
		this.idUser = idUser;
		this.title = title;
		this.amountBC  = amountBC;
		this.TVA  = TVA;
		this.timbre = timbre;
		this.amountTT = amountTT;
		this.idGenerated= idGenerated;
		this.creationDate =creationDate;
		this.freeField = freeField;
	}
	
	public String getIdBill() {
		return idBill;
	}

	public void setIdBill(String idBill) {
		this.idBill = idBill;
	}

	public User getIdUser() {
		return idUser;
	}

	public void setIdUser(User idUser) {
		this.idUser = idUser;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAmountBC() {
		return amountBC;
	}

	public void setAmountBC(String amountBC) {
		this.amountBC = amountBC;
	}

	public String getTVA() {
		return TVA;
	}

	public void setTVA(String tVA) {
		TVA = tVA;
	}

	public String getTimbre() {
		return timbre;
	}

	public void setTimbre(String timbre) {
		this.timbre = timbre;
	}

	public String getAmountTT() {
		return amountTT;
	}

	public void setAmountTT(String amountTT) {
		this.amountTT = amountTT;
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
		return "Bill idUser:"+idUser+" title :"+title+"  amountBC:"+amountBC+" TVA:"+TVA+" timbre:"+timbre+" amountTT:"+amountTT+" idGenerated:"+idGenerated+" Creation Date:"+creationDate+" freeField:"+freeField;
	}
}
