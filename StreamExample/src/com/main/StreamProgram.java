package com.main;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamProgram {
  public static void main(String args[])
  {
	  List<Integer> li=Arrays.asList(10, 8, 15,19,22,78,18,8,1);
	  
	  Stream<Integer> sts=li.stream();
	  
	  System.out.println("All avaliale even nos are-");
	  sts.filter(n -> n%2==0).forEach(System.out::print);
	  System.out.println("All integers starts with 1");
	  li.stream().map(no ->no  +"").filter(no ->no.startsWith("1")).forEach(System.out::println);
	   long count=li.stream().count();
	   System.out.println("Count "+count);
	   Optional opt=li.stream().findFirst();
	   
  }
}