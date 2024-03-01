package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="questions")
public class Questions {

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	int question_id;
	
	@Column
	String question;
	
	public Questions(){
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Questions(int question_id) {
		super();
		this.question_id = question_id;
	}



	public int getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

    
}
