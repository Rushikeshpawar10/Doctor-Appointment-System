package com.example.demo.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Appointment;
import com.example.demo.entities.Doctor;
import com.example.demo.entities.DummyDoctor;
import com.example.demo.entities.Schedule;
import com.example.demo.entities.SlotSchedule;
import com.example.demo.services.DoctorService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@Transactional
public class DoctorController {
	
	@Autowired
	DoctorService dservice;
	
	@PostMapping("/registerDoctor")
	public Doctor register(@RequestBody DummyDoctor doc)
	{
		return dservice.register(doc);
	}
	
	@GetMapping("/getAllDoctors")
	public List<Doctor> getAllDoctors()
	{
		return dservice.getAllDoctors();
	}
	
	@GetMapping("/getDoctorByUId")
	public Doctor getDoctorByUId(@RequestParam("user_id")int user_id)
	{
		return dservice.getDoctorByUId(user_id);
	}
	
	@GetMapping("/getDoctorByDId")
	public Doctor getDoctorByDId(@RequestParam("doctor_id")int doctor_id)
	{
		return dservice.getDoctorByDId(doctor_id);
	}
	
	@GetMapping("/getDoctorsByDept")
	public List<Doctor> getDoctorsByDept(@RequestParam("department")String dept)
	{
		return dservice.getDoctorsByDept(dept);
	}
	
	@PostMapping("/addSchedule")
	public Schedule addSchedule(@RequestBody Schedule sch)
	{
		return dservice.addSchedule(sch);
	}
	
	@GetMapping("/getAllDepartments")
	public List<String> getDepartments()
	{
		return dservice.getDepartments();
	}
	
	@GetMapping("/getSchedule")
	public List<SlotSchedule> getSchedule(@RequestParam("doctor_id")int did)
	{
		return dservice.getSchedule(did);
	}
	
	@GetMapping("/getAppointmentsofDoctor")
	public List<Appointment> getAppointmentsofDoctor(@RequestParam ("doctor_id")int did)
	{
		return dservice.getAppointmentsofDoctor(did); 
	}
	
	
	
}
