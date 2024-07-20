package com.member.Entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name="cms_service")
public class Service_Entity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String serviceType;
private String name;
private int age;
private String gender;
private LocalDate date;
private String details;
private Boolean status;
private String assign;
private String notes;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getServiceType() {
	return serviceType;
}
public void setServiceType(String serviceType) {
	this.serviceType = serviceType;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
public String getDetails() {
	return details;
}
public void setDetails(String details) {
	this.details = details;
}
public Boolean getStatus() {
	return status;
}
public void setStatus(Boolean status) {
	this.status = status;
}
public String getAssign() {
	return assign;
}
public void setAssign(String assign) {
	this.assign = assign;
}
public String getNotes() {
	return notes;
}
public void setNotes(String notes) {
	this.notes = notes;
}
public Service_Entity(int id, String serviceType, String name, int age, String gender, LocalDate date, String details,
		Boolean status, String assign, String notes) {
	super();
	this.id = id;
	this.serviceType = serviceType;
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.date = date;
	this.details = details;
	this.status = status;
	this.assign = assign;
	this.notes = notes;
}
public Service_Entity() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Entity [id=" + id + ", serviceType=" + serviceType + ", name=" + name + ", age=" + age + ", gender="
			+ gender + ", date=" + date + ", details=" + details + ", status=" + status + ", assign=" + assign
			+ ", notes=" + notes + "]";
}

}
