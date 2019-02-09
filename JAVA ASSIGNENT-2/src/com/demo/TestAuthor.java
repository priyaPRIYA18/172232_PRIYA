package com.demo;
public class TestAuthor{

public static void main(String[] args) {
	// TODO Auto-generated method stub
	Author b1=new Author("tan b1","priya@gmail.com",'f');
	System.out.println(b1);
	b1.setEmail("priya@gmail.com");
	System.out.println(b1);
	System.out.println("name is:"+b1.getName());
	System.out.println("gender is:"+b1.getGender());
	System.out.println("email is:"+b1.getEmail());

}

}
