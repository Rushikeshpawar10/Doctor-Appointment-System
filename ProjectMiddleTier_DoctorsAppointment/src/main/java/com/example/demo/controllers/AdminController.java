package com.example.demo.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Appointment;
import com.example.demo.services.AdminService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@Transactional
public class AdminController {
	
	@Autowired
	AdminService aservice;
	
	@GetMapping("/cancellationRequestedAppointments")
	public List<Appointment> cancellationRequestedAppointments()
	{
		return aservice.cancellationRequestedAppointments();
	}
	
	@GetMapping("/approveAppointmentCancellation")
	public boolean approveAppointmentCancellation(@RequestParam("app_id")int app_id)
	{
		return aservice.approveAppointmentCancellation(app_id);
	}
	
	@GetMapping("/getAllAppointments")
	public List<Appointment> getAllAppointments()
	{
		return aservice.getAllAppointments();
	}
	
	@DeleteMapping("/deleteByUId")
	public boolean deleteByUId(@RequestParam("user_id")int uid)
	{
		aservice.deleteByUId(uid);
		return true;
	}
	
	
}
