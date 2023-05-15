package com.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMapDemo {
	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<>();
		map.put("eight", 8);
		map.put("four", 4);
		map.put("ten", 10);
		map.put("two", 2);
		//for sorting based on key with stream api
	map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
	System.out.println("-----");
	//for sorting based on value with stream api
	map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	}
//---------------------------------------
	
	Map<String, Integer> empMap=new TreeMap<>();
	//empMap.put(new Employee(176,"ramesh","it",100000),60);
	
	

}
