package com.example.demo.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Appointment;
import com.example.demo.entities.Doctor;
import com.example.demo.entities.Patient;

@Transactional
@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
	
	
	@Query("Select a from Appointment a where doctor_id = :did and status = 'SCHD'")
	public List<Appointment> getAppointmentsofDoctor(@Param("did") Doctor did);
	
	@Query("Select a from Appointment a where patient_id = :pid ")
	public List<Appointment> getAppointmentsofPatient(@Param("pid") Patient pid);
	
	// This method is from patient service
	@Modifying
	@Query("update Appointment set status= :as where app_id = :aid")
	public int appointmentCancellationRequest(@Param("aid") int aid,@Param("as")String as);
	
	@Query("Select a from Appointment a where status= :as")
	public List<Appointment> cancellationRequestedAppointments(@Param("as") String as);
	
	@Modifying
	@Query("update Appointment set status= :as where app_id = :aid")
	public int approveAppointmentCancellation(@Param("aid") int aid,@Param("as")String as);
}
