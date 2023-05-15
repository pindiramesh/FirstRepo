package com.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class StreamsDemo {
	public static void main(String[] args) {
	//1:	
		List<String> list=new ArrayList<>();
		list.add("ram");
		list.add("sup");
		list.add("Frut");
		list.add("pindi");
		list.add("pinisup");
		list.stream().forEach(t->System.out.println(t)); //t->s.o.p represents the consumer
	//2:	
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		map.put(5, "e");
		map.forEach((key,value)->System.out.println(key+": "+value));
		map.entrySet().stream().forEach(obj->System.out.println(obj)); // to use stream
	 //3:
	Consumer<String> consumer=t->System.out.println(t);
	 for(String s:list) {
		 consumer.accept(s);
	 }
	 
	 //4:  filter function:we need to write predicate inside filter rather than below if 
	 System.out.println("4---");
	 for(String s:list) {
		if(s.startsWith("p")) {
			System.out.println(s);
		}
		//we can use the predicate to remove above condition
		System.out.println("predicate--");
		list.stream().filter(t->t.startsWith("p")).forEach(t->System.out.println(t));	
		map.entrySet().stream().filter(t->t.getKey()%2==0).forEach(t->System.out.println(t));
	 }
	 
	
	
	}
	

}
