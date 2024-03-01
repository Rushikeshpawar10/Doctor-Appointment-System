package com.example.demo.entities;

public class DummyDoctor {
	
	String fname,lname,email,password,contact_no,gender,answer,qualification,specialization,department,type,area,city,state;
	int role_id,question_id,experience,imr_no,pincode;
	
	public DummyDoctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DummyDoctor(String fname, String lname, String email, String password, String contactNo, String gender,
			String answer, String qualification, String specialization, String department, String type, String area,
			String city, String state, int pincode, int role_id, int question_id, int experience, int imr_no) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.contact_no = contact_no;
		this.gender = gender;
		this.answer = answer;
		this.qualification = qualification;
		this.specialization = specialization;
		this.department = department;
		this.type = type;
		this.area = area;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.role_id = role_id;
		this.question_id = question_id;
		this.experience = experience;
		this.imr_no = imr_no;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
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

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public int getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
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
	
	

}
