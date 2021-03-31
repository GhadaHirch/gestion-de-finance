package com.example.demo.entity;

import org.springframework.data.mongodb.core.mapping.Field;
import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Contract {
	@Id
	private String idContract;
	@DBRef
	private User idUser;
	@DBRef
	private ContractType idType;
	@Field("company_name")
	private String companyName;
	@Field("salary")
	private String salary;
	@Field("start_date")
	private Date startDate;
	@Field("finish_date")
	private Date finishDate;
	@Field("id_generated")
	private String idGenerated;
	@Field("creation_date")
	private Date creationDate;
	@Field("deleted")
	private Boolean deleted;
	@Field("free_field")
	private String freeField;
	
	public Contract(User idUser,ContractType idType, String companyName, String salary,Date startDate,Date finishDate,String idGenerated ,Date creationDate, Boolean deleted,String freeField) {
		this.idUser = idUser;
		this.idType= idType;
		this.companyName = companyName;
		this.salary  = salary;
		this.startDate  = startDate;
		this.finishDate = finishDate;
		this.creationDate =creationDate;
		this.deleted=deleted;
		this.freeField =freeField;
	}
	
	public String getIdContract() {
		return idContract;
	}

	public void setIdContract(String idContract) {
		this.idContract = idContract;
	}

	public User getIdUser() {
		return idUser;
	}

	public void setIdUser(User idUser) {
		this.idUser = idUser;
	}

	public ContractType getIdType() {
		return idType;
	}

	public void setIdType(ContractType idType) {
		this.idType = idType;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
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

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public String getFreeField() {
		return freeField;
	}

	public void setFreeField(String freeField) {
		this.freeField = freeField;
	}

	public String toString() {
		return "Contract idUser:"+idUser+" idType:"+idType+" Company Name:"+companyName+" salary:"+salary+" Start Date:"+startDate+"  Finish Date:"+finishDate+" Creation Date:"+creationDate+" freeField:"+freeField;
	}
}
