package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Login;
import com.example.demo.entities.QuestionAnswer;
import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository urepo;
	
	public User getLogin(String email,String password)
	{
		User l;
		Optional<User> login=urepo.getLogin(email, password);
		try {
			l=login.get();
		}
		catch(Exception e)
		{
			l=null;
		}
		return l;
	}
	
	public QuestionAnswer getQuestionAnswer(String email)
	{
		QuestionAnswer qa=new QuestionAnswer();
		qa.setQue(urepo.getQuestion(email));
		qa.setAns(urepo.getAnswer(email));
		return qa;
	}
	
	public boolean changePassword(String email,String pwd)
	{
		int n=urepo.changePassword(email, pwd);
		 
		return n==1;
	}
	
}
