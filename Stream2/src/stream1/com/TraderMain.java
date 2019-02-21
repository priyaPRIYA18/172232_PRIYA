package stream1.com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TraderMain {

	public static void main(String[] args) {
	List<Trader>list=new ArrayList<>();
	list.add (new Trader("simmy","pune"));
	list.add(new Trader("priya","delhi"));
	list.add(new Trader("silo","indore"));
	list.add(new Trader("ram","mangalore"));
	list.add(new Trader("bhairavi","delhi"));
	list.add(new Trader("milli","mangalore"));
	list.add(new Trader("neha","indore"));
	list.add(new Trader("isha","indore"));
	
	
	System.out.println("unique cities where traders work :\n");     
	Stream<String>list1=list.stream().map(Trader::getCity).distinct();
	list1.forEach(System.out::println);
	System.out.println("................................");
	
	System.out.println("traders from pune and sorted them by name:\n");
	list.stream().filter(p->p.getCity()=="PUNE").sorted(Comparator.comparing(Trader::getName))
	.collect(Collectors.toList()).forEach(System.out::println);
	
	System.out.println("traders names sorted alphabetically:\n");
	list.stream()
							 .sorted((Comparator.comparing(Trader::getName)))
			                 .map(Trader::getName).forEach(System.out::println);
	System.out.println("............");
	
//	System.out.println("traders based in indore:\n");
//	Stream<String> list3=list.stream().filter(p->p.getCity()"INDORE");

	}

}
