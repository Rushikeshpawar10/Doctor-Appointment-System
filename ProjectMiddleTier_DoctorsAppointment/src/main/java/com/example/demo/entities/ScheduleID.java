package com.example.demo.entities;

import java.io.Serializable;
import java.sql.Date;

public class ScheduleID implements Serializable {
	
	int doctor_id;
	
	Date date;

	public ScheduleID() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ScheduleID(int doctor_id, Date date) {
		super();
		this.doctor_id = doctor_id;
		this.date = date;
	}

	public int getDoctor_id() {
		return doctor_id;
	}

	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
