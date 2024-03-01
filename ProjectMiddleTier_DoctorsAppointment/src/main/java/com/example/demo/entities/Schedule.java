package com.example.demo.entities;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="schedules")
@IdClass(ScheduleID.class)
public class Schedule {
	
	@Id
	int doctor_id;
	@Id
	Date date;
	@Column
	Time start_time,end_time;
	
	public Schedule() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Schedule(int doctor_id, Date date, Time start_time, Time end_time) {
		super();
		this.doctor_id = doctor_id;
		this.date = date;
		this.start_time = start_time;
		this.end_time = end_time;
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

	public Time getStart_time() {
		return start_time;
	}

	public void setStart_time(Time start_time) {
		this.start_time = start_time;
	}

	public Time getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Time end_time) {
		this.end_time = end_time;
	}
	
	

}
