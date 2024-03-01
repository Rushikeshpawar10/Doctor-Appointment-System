package com.example.demo.entities;

public class QuestionAnswer {

	Questions que;
	
	String ans;

	public QuestionAnswer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QuestionAnswer(Questions que, String ans) {
		super();
		this.que = que;
		this.ans = ans;
	}

	public Questions getQue() {
		return que;
	}

	public void setQue(Questions que) {
		this.que = que;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}
	
	
}
