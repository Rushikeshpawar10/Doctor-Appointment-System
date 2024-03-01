package com.example.demo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Doctor;
import com.example.demo.entities.Login;
import com.example.demo.entities.Patient;
import com.example.demo.entities.Schedule;
import com.example.demo.entities.ScheduleID;
import com.example.demo.entities.User;

public interface ScheduleRepository extends JpaRepository<Schedule,ScheduleID> {

	@Query("select s from Schedule s where doctor_id = :did")
	public List<Schedule> getByDoctorId(@Param("did") int did);
	
}
