package stream.com;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.*;

import stream1.com.Trader;
class Trans{
public static void main(String[] args) {
	
	Trader t1=new Trader("ishu","banglore");
    Trader t2=new Trader("Mounika","Indore");
    Trader t3=new Trader("Revanth","guntur");
    Trader t4=new Trader("Rohit","new york");
    Trader t5=new Trader("Simmy","Delhi");
    Trader t6=new Trader("Priya","Delhi");
    
    Transaction tr1=new Transaction(600000,2011,t1);
	Transaction tr2=new Transaction(100000,2005,t2);
	Transaction tr3=new Transaction(300000,2011,t3);
	Transaction tr4=new Transaction(50000,2012,t4);
	Transaction tr5=new Transaction(75000,2009,t5);
	Transaction tr6=new Transaction(30000,2011,t6);
	
	List<Transaction> list=new ArrayList<Transaction>();
	list.add(tr1);
	list.add(tr2);
	list.add(tr3);
	list.add(tr4);
	list.add(tr5);
	list.add(tr6);
	
	System.out.println("---------------Question 13---------------");
	System.out.println("Transactions from Delhi");
	Stream<Integer> transactions=list.stream().filter(e->e.getTrader().getCity().equals("Delhi"))
			.map(Transaction::getValue);
	transactions.forEach(System.out::println);

	System.out.println("---------------Question 14---------------");
	System.out.println("Highest Transactions ");
	Integer maxValue=list.stream().max((x,y)->x.getValue()
			.compareTo(y.getValue())).map(Transaction::getValue).get();
	System.out.println(maxValue);
	
	System.out.println("---------------Question 15---------------");
	System.out.println("Smallest Transactions ");
	Integer minValue=list.stream().min((x,y)->x.getValue()
			.compareTo(y.getValue())).map(Transaction::getValue).get();
	System.out.println(minValue);
	
	
}
}


