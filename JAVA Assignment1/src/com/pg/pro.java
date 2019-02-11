package com.pg;

public class pro {
	public static void main(String args[]) {
		
		
		
		Account a1=new Account();
		a1.setName("anamika");
		a1.setId("123");
		a1.setBalance(1000);
		System.out.println(a1.getname());
		System.out.println(a1.getId());
		System.out.println(a1.getBalance());
		a1.credit(1000);
		a1.transferTo1(20,50);
		a1.debit(100);
		
		
		
		
}}