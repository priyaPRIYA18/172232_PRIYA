package com.spring;

import java.util.Set;

public class SetQuestion {



	private Set<Question> answer;

	public Set<Question> getAnswer() {
		return answer;
	}

	public void setAnswer(Set<Question> answer) {
		this.answer = answer;
	}

	
	
	public void display() {
		for(Question question:answer) {
			System.out.println(question.getQuestion());
			
		System.out.println(question.getAnswer());
		
		
		}
	}
}
	
	
	
	


