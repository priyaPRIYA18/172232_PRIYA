package com.pg;

public class Account {
	private String id;
	private String name;
	private int balance=0;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return name;
	}
	public Account(String id, String name)
	{
		this.id=id;
		this.name=name;
	}
	public Account(String id,String name,int balance)
	{
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	
public Account() {
		// TODO Auto-generated constructor stub
	}
public int credit(int amount)
	{
		balance=amount+balance;
		System.out.println("credit is successfull added");
		return balance;
	}
public void debit(int amount)
{
	if(amount<=balance)
	{
		balance=amount-balance;
		System.out.println("debit is successfull");
	}
	else
	{
		System.out.println("amount exceeded balance");
	}
	return;
}

	
public void transferTo1(int account,int amount)
{
	if(amount<=balance)
	{
	balance=amount+balance;
	System.out.println("transfer is successfull");
	}
	else
	{
		System.out.println("amount exceeded balance");
	}
	return;
}
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + ", getId()=" + getId()
				+ ", getBalance()=" + getBalance() + ", getname()=" + getname() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public void transferTo(int i, int amount) {
		// TODO Auto-generated method stub
		
	}
	


}



