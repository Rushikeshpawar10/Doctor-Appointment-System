package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="doctors")
//@PrimaryKeyJoinColumn(name="user_id")
public class Doctor{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int doctor_id;
	
	@Column
	String qualification,specialization,department,type;
	
	@Column
	int experience,imr_no;
	
	@OneToOne
	@JoinColumn(name="user_id")
	User user_id;

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(String qualification, String specialization, String department, String type, int experience,
			int imr_no, User user_id) {
		super();
		this.qualification = qualification;
		this.specialization = specialization;
		this.department = department;
		this.type = type;
		this.experience = experience;
		this.imr_no = imr_no;
		this.user_id = user_id;
	}

	public int getDoctor_id() {
		return doctor_id;
	}

	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getImr_no() {
		return imr_no;
	}

	public void setImr_no(int imr_no) {
		this.imr_no = imr_no;
	}

	public User getUser_id() {
		return user_id;
	}

	public void setUser_id(User user_id) {
		this.user_id = user_id;
	}
	
	
	
	
}
