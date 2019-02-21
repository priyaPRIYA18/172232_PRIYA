package stream.com;


import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
//import java.util.stream.Collector;
import java.util.stream.Collectors;
//import java.util.stream.Stream;

public class FruitPerson {
	
		
		public static void main(String[] args) {
			
			List<Fruits> list=new ArrayList<>();
		    
		    list.add(new Fruits("Pomegranate",50,100,"Red"));
		    list.add(new Fruits("PineApple",50,100,"Yellow"));
		    list.add(new Fruits("Banana",105,60,"Yellow"));
		    list.add(new Fruits("Blueberry",150,85,"Blue"));
		    list.add(new Fruits("Grapes",50,65,"Black"));
		    list.add(new Fruits("Apple",90,100,"Red"));
		    
		    System.out.println("-----------------------------------------------");
		   
		    List<String> list2=list.stream()
		    		.filter(p->p.getCalories()<100)
		    		.sorted(Comparator.comparing(Fruits::getCalories).reversed())
		    		.map(Fruits::getName)
		    		.collect(Collectors.toList());
		    list2.forEach(System.out::println);
		    
		    System.out.println("-----------------------------");
		    List<String> list3=list.stream()
		    		//.filter(p->p.getColor())
		    		.sorted(Comparator.comparing(Fruits::getColor))
		    		.map(Fruits::getName)
		    		.collect(Collectors.toList());
		    list3.forEach(System.out::println);
		    		
		    
		    System.out.println("---------------------------------");
		    
		    List<String> list4=list.stream()
		    		.filter(p->p.getColor()=="Red")
		    		.sorted(Comparator.comparing(Fruits::getPrices))
		    		.map(Fruits::getName)
		    		.collect(Collectors.toList());
		    list4.forEach(System.out::println);
		    		
		 
		   
		    
			
		
		}

	
		
		
	}

