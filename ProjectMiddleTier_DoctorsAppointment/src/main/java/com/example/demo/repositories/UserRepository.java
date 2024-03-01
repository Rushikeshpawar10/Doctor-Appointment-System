package com.example.demo.repositories;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Questions;
import com.example.demo.entities.User;

@Transactional
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	@Query("select u from User u where email= :email and password= :password")
	public Optional<User> getLogin(@Param("email") String email,@Param("password") String password);
	
	@Query("select question_id from User u where email = :email")
	public Questions getQuestion(@Param("email") String email);
	
	@Query("select answer from User u where email = :email")
	public String getAnswer(@Param("email") String email);
	
	@Modifying
	@Query("update User set password = :pwd where email = :email")
	public int changePassword(@Param("email") String email,@Param("pwd") String pwd);
}
