package com.example.demo.entities;

import java.sql.Date;
import java.sql.Time;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="appointments")
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int app_id;
	
	//@JsonFormat(pattern = "YYYY-MM-DD")
	@Column
	Date date;

	String status;
	
	@ManyToOne
	@JoinColumn(name="doctor_id")
	Doctor doctor_id;
	
	@ManyToOne
	@JoinColumn(name="patient_id")
	Patient patient_id;
	
	@Column
	Time slot;
	
	@Column
	byte[] prescription;

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appointment( Date date, String status, Doctor doctor_id, Patient patient_id, Time slot,
			byte[] prescription) {
		super();
		
		this.date = date;
		this.status = status;
		this.doctor_id = doctor_id;
		this.patient_id = patient_id;
		this.slot = slot;
		this.prescription = prescription;
	}
	
	public Appointment(Date date, String status, Doctor doctor_id, Patient patient_id, Time slot) {
		this.date = date;
		this.status = status;
		this.doctor_id = doctor_id;
		this.patient_id = patient_id;
		this.slot = slot;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getApp_id() {
		return app_id;
	}

	public void setApp_id(int app_id) {
		this.app_id = app_id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Doctor getDoctor_id() {
		return doctor_id;
	}

	public void setDoctor_id(Doctor doctor_id) {
		this.doctor_id = doctor_id;
	}

	public Patient getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(Patient patient_id) {
		this.patient_id = patient_id;
	}

	public Time getSlot() {
		return slot;
	}

	public void setSlot(Time slot) {
		this.slot = slot;
	}

	public byte[] getPrescription() {
		return prescription;
	}

	public void setPrescription(byte[] prescription) {
		this.prescription = prescription;
	}

	@Override
	public String toString() {
		return "Appointment [app_id=" + app_id + ", date=" + date + ", status=" + status + ", doctor_id=" + doctor_id
				+ ", patient_id=" + patient_id + ", slot=" + slot + ", prescription=" + Arrays.toString(prescription)
				+ "]";
	}

	
	
}
