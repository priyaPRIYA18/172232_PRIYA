package news.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class NewsMain 
{

	public static void main(String[] args) 
	{
		List<News> list=new ArrayList<>();
		list.add(new News(100,"Neha","yes","Good Work"));
		list.add(new News(100,"Simmy","yes","Budget"));
		list.add(new News(100,"Priya","no",""));
		list.add(new News(200,"Shubhangi","yes","Excellent"));
		list.add(new News(100,"Shubhangi","no",""));
		list.add(new News(200,"Simmy","yes","Budget"));
		list.add(new News(100,"Priya","yes","Good Work"));
		list.add(new News(200,"Neha","yes","Budget"));
		
		System.out.println("---------------Question 4---------------");
		Map<Object, Long> map = list.stream().collect(Collectors
				.groupingBy(News::getNewsId, Collectors.counting()));

		long maxval=(Collections.max(map.values()));

		for(java.util.Map.Entry<Object, Long> entry:map.entrySet()) 
		{

			if(entry.getValue()==maxval) 
			{
				System.out.println(entry.getKey());
			}
		}
		
		System.out.println("---------------Question 5---------------");
		List<News> countCommit=list.stream().filter(p->p.getComment()
				.contains("Budget")).collect(Collectors.toList());;
				long i=countCommit.stream().count();
		System.out.println(i);
		
		System.out.println("---------------Question 6---------------");
		Map<Object, Long> map1 = list.stream().collect(Collectors.groupingBy(News::getPostedByUser, Collectors.counting()));
		long maxval1=(Collections.max(map1.values()));
		for(java.util.Map.Entry<Object, Long> entry1:map1.entrySet()) 
		{
			if(entry1.getValue()==maxval1) 
			{

			System.out.println(entry1.getKey());
			
			}	
		}
		
		System.out.println("---------------Question 7---------------");
		Map<Object, Long> map2 = list.stream().collect(Collectors.groupingBy(News::getCommentByUser, Collectors.counting()));
		System.out.println(map2);
		
	}
	
}
