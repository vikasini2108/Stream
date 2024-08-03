package com.main;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTerminalOperator {
	public static void main(String[]args) {
		//sample data
		List<String> names = Arrays.asList("Reflecation", "Collection","Stream","Structure","Sorting","State");
		
		//forEach: Print each name
		System.out.println("forEach:");
		names.stream().forEach(System.out::println);
		//:: - method call operator
		//collect: Collect names starting with 'S' into list
		List<String> sNames = names.stream()
				.filter(name -> name.startsWith("S"))
				.collect(Collectors.toList());
		System.out.println("\ncollect (names starting with 'S'):");
		sNames.forEach(System.out::println);
		//reduce : String concatenate all names into a single string
		String concatenatedNames = names.stream().reduce(
				"",
				(partialString, element)-> partialString +" "+element);
		System.out.println("\nreduce (concatenated names):");
		System.out.println(concatenatedNames.trim());
		
		// count:count the number of names
		long count = names.stream().count();
		System.out.println("\ncount:" + count);
		
		
		// findFirst: Find the first name
		Optional<String> firstName = names.stream().findFirst();
		System.out.println("\nfindfirst:");
		firstName.ifPresent(System.out::println);
		
		//allMatch: Check if all names start with 'S'
		boolean allStartWithS =names.stream().allMatch(
				name -> name.startsWith("S")
				);
		System.out.println("\nallMatch(all start with 'S' ):");
		System.out.println(allStartWithS);
		
		//allMatch : check if any name start eith 'S'
		boolean anyStartWithS = names.stream().anyMatch(
				name -> name.startsWith("S"));
		System.out.println("\nanyMatch(any start eith 'S'):");
		System.out.println(anyStartWithS);
		
				
		
		
		
	}

}

