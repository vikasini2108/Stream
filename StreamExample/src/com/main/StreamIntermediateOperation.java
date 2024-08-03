package com.main;

import java.util.Arrays;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamIntermediateOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   List<List<String>>  listOfLists = Arrays.asList(
		   Arrays.asList("Reflection","Collection","Stream"),
		   Arrays.asList("Structure", "State","Flow"),
		   Arrays.asList("Sorting", "Mapping","Reduction","Stream")
		   );
   
   //create a set  to hold intermediate results
   
   Set<String>  intermediateResults = new HashSet<>();
    
   //Stream pipeline demonstrating various intermediate operations
   
   List<String> result= listOfLists.stream()
		   .flatMap(List::stream)              //flatten the list of lists into a single stream
		   .filter(s ->s.startsWith("S"))      //filter elements starting with"S"
		   
		   .map(String::toUpperCase)           //Transfer each element to uppercase
		   .distinct()                         //remove duplicate elements
		   .sorted()                           //sort elements
		   .peek(s -> intermediateResults.add(s))      //perform an action(add to set) on each element
		    .collect(Collectors.toList());       //collect the final result into a list
   
   //print the intermediate results
   System.out.println("Intermediate Results:");
   intermediateResults.forEach(System.out::println);
   
   //print the final results
   System.out.println("Final Results:");
   result.forEach(System.out::println);
		   
	}

}
