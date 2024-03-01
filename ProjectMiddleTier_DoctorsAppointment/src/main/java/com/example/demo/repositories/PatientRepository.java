package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Doctor;
import com.example.demo.entities.Login;
import com.example.demo.entities.Patient;
import com.example.demo.entities.User;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

	@Query("select p from Patient p where user_id = :user_id")
	public Patient getPatientByUId(@Param("user_id") User user_id);
	
}
