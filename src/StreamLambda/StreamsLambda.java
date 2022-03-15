package StreamLambda;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StreamsLambda {
	
//	@Test
	public void regular() {
	
		// Count the number of names starting with alphabet A in list
	
//	public void regular()
	{
		ArrayList<String> names=new ArrayList<String>(); 
		names.add("Ajay");
		names.add("Swati");
		names.add("Aarav");
		names.add("Balaji");
		names.add("Don");
		int count=0;
		
		for (int i=0; i<names.size(); i++)
		{
			String actual = names.get(i);
			if (actual.startsWith("A"))
			{
				count++;
			}
		}
		
		System.out.println(count);
	}
	}
	
//	@Test
	public void streamFilter()
	{
		ArrayList<String> names=new ArrayList<String>(); 
		names.add("Ajay");
		names.add("Swati");
		names.add("Aarav");
		names.add("Balaji");
		names.add("Ajay");
		
		// There is no life for intermediate operation if there is no terminal operation.
		// Terminal operation will execute only, if intermediate operation (filter) returns true.
		// We can create stream.
		// How to use filter in stream API.
		
		Long c = names.stream().filter(s -> s.startsWith("A")).count();  // Lambda Expression - Check all parallaly and
		System.out.println(c);
		
//		Long d = names.stream().filter(s -> s.endsWith("i")).count();
//		System.out.println(d);
		
		long d = Stream.of("Ajay", "Swati", "Aarav", "Balaji", "Ajay").filter(s ->
		{
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(d);
	
		// Print all the names of ArrayList
		
//		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
	}

//	@Test
	public void streamMap() {
		
		
		ArrayList<String> names=new ArrayList<String>(); 
		names.add("Man");
		names.add("Don");
		names.add("Women");

		// Print names which have last letter as "i" with Uppercase - Swati - SWATI & Balaji - BALAJI 
		Stream.of("Ajay", "Swati", "Aarav", "Balaji", "Ajay").filter(s->s.endsWith("i")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
		// Print names which have first letter as "a" with uppercase and sorted
		List<String> names1 = Arrays.asList("Ajay", "Swati", "Aarav", "Balaji", "Ajay");
		names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
		// newStream.sorted().forEach(s->System.out.println(s));
		
		boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Ajay1"));
		System.out.println(flag);
		Assert.assertTrue(flag);
		
	}
	
	@Test
	public void streamCollect()
	{
		//list -> new list -> new list
		
//		List <String> ls = Stream.of("Ajay", "Swati", "Aarav", "Balaji", "Ajay").filter(s->s.endsWith("i")).map(s->s.toUpperCase())
//		.collect(Collectors.toList());
//		System.out.println(ls.get(0));
		
		// 
		
		List <Integer> values = Arrays.asList(3,2,2,7,5,1,9,7);
		
		// Print unique number from this array & sort the array
		
//		values.stream().distinct().forEach(s->System.out.println(s));
		
		// Print in ascending order
		
//		values.stream().distinct().sorted().limit(3).forEach(s->System.out.println(s));
		
		List <Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
		
	}
	
}