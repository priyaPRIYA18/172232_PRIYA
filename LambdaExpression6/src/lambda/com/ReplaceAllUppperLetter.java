package lambda.com;

	import java.util.ArrayList;
	import java.util.List;

	public class ReplaceAllUppperLetter {
		public static void main(String[] args) {
			List<String> array = new ArrayList<String>();
			array.add("priya");
			array.add("yadav");
			array.add("priya yadav");
			array.add("U.P");
			System.out.println("Names :\n"+array);
			System.out.println("**********************************");
			
			array.replaceAll(priya -> priya.toUpperCase());
			array.forEach(System.out::println);
		}

	}


