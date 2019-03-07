package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.Question;
import com.spring.SetQuestion;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring2.xml");
		SetQuestion question=(SetQuestion)context.getBean("QuestionDetails");
		question.display();
		

	}

}
