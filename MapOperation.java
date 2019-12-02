package streamintermediateoperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapOperation {
	public static void main(String[] args) {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");

		memberNames.stream().filter((s) -> s.startsWith("A"))
        .map(String::toUpperCase)
        .forEach(System.out::println);
		
		memberNames.stream().filter((s) -> s.startsWith("A"))
        .map(String::toLowerCase)
        .forEach(System.out::println);
		
		
		List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5");
        
        List<Integer> listOfIntegers = listOfStrings.stream()
                                        .map(Integer::valueOf) //Changing to Integer Type List via Map from String Type List
                                        .collect(Collectors.toList());
         
        System.out.println(listOfIntegers);
        
        
        
	}
	
	

}
