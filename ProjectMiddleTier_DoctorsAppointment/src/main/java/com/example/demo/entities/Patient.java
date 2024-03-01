package com.example.demo.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="patients")
public class Patient{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int patient_id;
	
	@Column
	Date birthdate;
	
	@Column
	String blood_group,diabetes,blood_pressure;
	
	@OneToOne
	@JoinColumn(name="user_id")
	User user_id;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(Date birthdate, String blood_group, String diabetes, String blood_pressure, User user_id) {
		super();
		this.birthdate = birthdate;
		this.blood_group = blood_group;
		this.diabetes = diabetes;
		this.blood_pressure = blood_pressure;
		this.user_id = user_id;
	}

	public int getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getBlood_group() {
		return blood_group;
	}

	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}

	public String getDiabetes() {
		return diabetes;
	}

	public void setDiabetes(String diabetes) {
		this.diabetes = diabetes;
	}

	public String getBlood_pressure() {
		return blood_pressure;
	}

	public void setBlood_pressure(String blood_pressure) {
		this.blood_pressure = blood_pressure;
	}

	public User getUser_id() {
		return user_id;
	}

	public void setUser_id(User user_id) {
		this.user_id = user_id;
	}

	
	
	
}
