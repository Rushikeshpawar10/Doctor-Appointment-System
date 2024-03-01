package com.example.demo.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Appointment;
import com.example.demo.entities.DummyPatient;
import com.example.demo.entities.Dummy_Appointment;
import com.example.demo.entities.Patient;
import com.example.demo.services.PatientService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@Transactional
public class PatientController {

	@Autowired
	PatientService pservice;

	@Autowired
	JavaMailSender sender;

	@PostMapping("/registerPatient")
	public Patient register(@RequestBody DummyPatient patient) {
		return pservice.register(patient);
	}
	/*
	 * Patient p; try {
	 * 
	 * SimpleMailMessage mailMsg=new SimpleMailMessage();
	 * mailMsg.setFrom("onlinelifelinehospital@gmail.com");
	 * mailMsg.setTo(p.getUser_id().getEmail());
	 * mailMsg.setSubject("Registration Details..."); mailMsg.
	 * setText("Your registration has been done successfully in LifeLine Hospital.\n"
	 * +"Following are your Login details :\n" + "UserId : " +
	 * p.getUser_id().getEmail()+"\n" +"Password : " +
	 * p.getUser_id().getPassword()); sender.send(mailMsg); } catch(Exception e) {
	 * p=null; e.printStackTrace();
	 * 
	 * }
	 * 
	 * return p;
	 */

	@GetMapping("/getAllPatients")
	public List<Patient> getAllPatients() {
		return pservice.getAllPatients();
	}

	@GetMapping("/getPatientByUId")
	public Patient getPatientByUId(@RequestParam("user_id") int user_id) {
		return pservice.getPatientByUId(user_id);
	}

	@GetMapping("/getPatientByPId")
	public Patient getPatientByPId(@RequestParam("patient_id") int patient_id) {
		return pservice.getPatientByPId(patient_id);
	}

	@PostMapping("/addAppointment")
	public Appointment addAppointment(@RequestBody Dummy_Appointment app) {
		return pservice.addAppointment(app);
	}

	@GetMapping("/getAppointmentsofPatient")
	public List<Appointment> getAppointmentsofPatient(@RequestParam("patient_id") int pid) {
		return pservice.getAppointmentsofPatient(pid);
	}

	@GetMapping("/appointmentCancellationRequest")
	public boolean appointmentCancellationRequest(@RequestParam("app_id") int app_id) {
		return pservice.appointmentCancellationRequest(app_id);
	}

}
