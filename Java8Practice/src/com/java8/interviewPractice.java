package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class interviewPractice {
	public static void main(String[] args) {
		String input="ilovejava";
		String[] results=input.split("");
		System.out.println(Arrays.toString(results));
	Map<String, List<String>> map=Arrays.stream(input.split("")).collect(Collectors.groupingBy(s->s));
		System.out.println(map);
		
		//to find out count the occuerence of each character in string
		
		Map<String, Long> map1=Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())) ;
				
		System.out.println(map1);
		
		//to find duplicate elements from string
		

	Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(x->x.getValue()>1).forEach(System.out::println);
	//to copy to list
	
	List<String> a= Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(x->x.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
	
	System.err.println(a);
	
	//find whose character occured once
	
	Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(x->x.getValue()==1).forEach(System.out::print);
	
	
	//find second highest number from array
	
	int[] number= {25,15,50,1,2,5,10};
	Integer secondhighest= Arrays.stream(number).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	System.out.println("secondhighest::"+secondhighest);
	
	
	//longest string
	String[] s1={"java","Microservice","pindi"};
	String longeststring= Arrays.stream(s1).reduce((Word1,word2)->Word1.length()>word2.length()?Word1:word2).get();
	System.out.println(longeststring);
	
	
	}

}
