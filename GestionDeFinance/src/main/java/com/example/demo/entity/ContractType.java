package com.example.demo.entity;

import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class ContractType {
@Id
private String idType;
@Field("name")
private String name;
@Field("description")
private String description;
@Field("frais")
private String frais;
@Field("free_field")
private String freeField;
@Field("id_generated")
private String idGenerated;
@Field("creation_date")
private Date creationDate;
@Field("deleted")
private Boolean deleted;


public ContractType(String name,String description, String frais,String idGenerated ,Date creationDate, Boolean deleted) {
	this.name = name;
	this.description= description;
	this.frais = frais;
	this.idGenerated  = idGenerated;
	this.creationDate  = creationDate;
	this.deleted = deleted;
}


public String getIdType() {
	return idType;
}


public void setIdType(String idType) {
	this.idType = idType;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getDescription() {
	return description;
}


public void setDescription(String description) {
	this.description = description;
}


public String getFrais() {
	return frais;
}


public void setFrais(String frais) {
	this.frais = frais;
}


public String getFreeField() {
	return freeField;
}


public void setFreeField(String freeField) {
	this.freeField = freeField;
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


@Override
public String toString() {
	return "ContractType idType="+ idType+" name:"+name+" description:"+description+" frais:"+frais+" freeField:"+freeField+" idGenerated:"+idGenerated+" creationDate:"+creationDate+" deleted:"+deleted;
}

}
