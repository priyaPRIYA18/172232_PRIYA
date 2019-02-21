package lambda.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ConvertKey_Values {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("Priya", 1);
		map.put("Yadav", 2);
		map.put("priyayadav", 3);
		map.put("U.P", 4);
		
		/*StringBuilder builder = new StringBuilder();
		map.forEach((key, value) -> builder.append(key + value));
		System.out.println(builder.toString());
		*/
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		for (Entry<String,Integer> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
}
