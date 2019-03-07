package com.spring;

public class Question {
	
private int questionId;
private String question;
private String answer;
public int getQuestionId() {
	return questionId;
}
public void setQuestionId(int questionId) {
	this.questionId = questionId;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public String getAnswer() {
	return answer;
}
public void setAnswer(String answer) {
	this.answer = answer;
}
public Question(int questionId, String question, String answer) {
	super();
	this.questionId = questionId;
	this.question = question;
	this.answer = answer;
}
public Question() {
	
}
public void details() {
	System.out.println(getQuestionId()+" "+getQuestion()+" "+getAnswer());
}

}









/*
 * Example of Injecting collections (List, Set and Map) Create a class Question
 * with following attributes: questionId, question, answers. There are 3 cases
 * for above program. a. Write a program where answers is of type List<String>
 * or String [] b. Write a program where answers is of type Set<String> c. Write
 * a program where answers is of type Map<Integer, String> In case of Map,
 * Integer value represents answer’s sequence number. d. Create a Test class
 * with main() method, get Question bean from ApplicationContext object and
 * print question and its answers.
 */