package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Appointment;
import com.example.demo.repositories.AppointmentRepository;
import com.example.demo.repositories.DoctorRepository;
import com.example.demo.repositories.UserRepository;

@Service
public class AdminService {

	@Autowired
	AppointmentRepository apprepo;
	
	@Autowired
	DoctorRepository drepo;
	
	@Autowired
	UserRepository urepo;
	
	public List<Appointment> cancellationRequestedAppointments()
	{
		String as="CANC_REQ";
		return apprepo.cancellationRequestedAppointments(as);
	}
	
	public boolean approveAppointmentCancellation(int app_id)
	{
		String as="CANC";
		boolean flag=false;
		int a=apprepo.approveAppointmentCancellation(app_id,as);
		
		if(a==1)
			flag=true;
		
		return flag;
	}
	
	public List<Appointment> getAllAppointments()
	{
		return apprepo.findAll();
	}
	
	public void deleteByUId(int uid)
	{
		urepo.deleteById(uid);
	}
	

}
