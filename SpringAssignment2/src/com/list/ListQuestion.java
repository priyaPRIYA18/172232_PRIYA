package com.list;

import java.util.List;

import com.spring.Question;

public class ListQuestion {
	private List<Question>answer;

	public List<Question> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Question> answer) {
		this.answer = answer;
	}
	
	
	public void display() {
		for(Question question:answer) {
			System.out.println(question.getQuestion());
			
		System.out.println(question.getAnswer());
		
		
		}
	}
	
	
	

}
