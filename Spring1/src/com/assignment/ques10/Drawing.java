package com.assignment.ques10;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Drawing  {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring10.xml");
		Square s=(Square) context.getBean("square");
		s.draw();
	}

}
