package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="users")
//@Inheritance(strategy = InheritanceType.JOINED)
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int user_id;
	
	@Column
	String fname,lname,email,password,gender,answer;
	
	@Column
	String contact_no;
	
	@OneToOne
	@JoinColumn(name="address_id")
	Address address_id;
	
	@ManyToOne
	@JoinColumn(name="role_id")
	Role role_id;
	
	@ManyToOne
	@JoinColumn(name="question_id")
	Questions question_id;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String fname, String lname, String email, String password, String contact_no, String gender,
			String answer, Address address_id, Role role_id, Questions question_id) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.contact_no = contact_no;
		this.gender = gender;
		this.answer = answer;
		this.address_id = address_id;
		this.role_id = role_id;
		this.question_id = question_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
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

	public Address getAddress_id() {
		return address_id;
	}

	public void setAddress_id(Address address_id) {
		this.address_id = address_id;
	}

	public Role getRole_id() {
		return role_id;
	}

	public void setRole_id(Role role_id) {
		this.role_id = role_id;
	}

	public Questions getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(Questions question_id) {
		this.question_id = question_id;
	}
	
}
