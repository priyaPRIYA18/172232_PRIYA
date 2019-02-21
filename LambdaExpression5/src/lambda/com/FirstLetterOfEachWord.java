package lambda.com;
import java.util.ArrayList;
import java.util.List;

public class FirstLetterOfEachWord{
	public static void main(String[] args) {
		List<String> array = new ArrayList<String>();
		array.add("Priya");
		array.add("Yadav");
		array.add("PriyaYadav");
		array.add("U.P");
		System.out.println("Names :\n"+array);
		System.out.println("**********************************");
	
		String result = array.stream().map(priya -> Character.toString(priya.charAt(0))).reduce(" ", (a, b) -> a + b);
		System.out.println(result);
	
	}
}


