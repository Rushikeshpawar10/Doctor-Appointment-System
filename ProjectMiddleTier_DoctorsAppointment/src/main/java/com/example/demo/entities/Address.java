package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="address")
public class Address {

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	int address_id;
	
	@Column
	String area,city,state;
	
	@Column
	int pincode;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String area, String city, String state, int pincode) {
		super();
		this.area = area;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}



	public int getAddress_id() {
		return address_id;
	}

	public void setAddress_id(int address_id) {
		this.address_id = address_id;
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
	
	
}
