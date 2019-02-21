package lambda.com;

import java.util.ArrayList;
import java.util.List;

public class TestWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> l=new ArrayList<String>();
l.add("i");
l.add("we");
l.add("one");
l.add("four");

l.removeIf(e ->(e.length()%2!=0));
l.forEach(i -> System.out.println(i));
	}

}
