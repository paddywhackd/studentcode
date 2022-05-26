package com.techelevator;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();

	Map<String, Integer> myMap = new HashMap<>();
	myMap.put("A", 100);
	myMap.put("B", 90);
	myMap.put("C", 80);

		System.out.println("retrieving 'A ' " + myMap.get("A"));
		System.out.println("retrieving 'Z ' " + myMap.get("Z"));

		System.out.println("does 'A' exist?" + myMap.containsKey("A"));

		for(String key :  myMap.keySet()) {
			System.out.println(key);
		}

		myMap.remove("c");
		System.out.println("=============");
		for (String key : myMap.keySet()) {
			System.out.println(key);

		}

		for (Map.Entry<String, Integer> entry : myMap.entrySet())
		{
			System.out.printf("Key: %s Value: %s\n", entry.getKey(), entry.getValue());
		}

		myMap.put("C", 70);
		System.out.println("============");
		for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
			System.out.println("Key: %s Value: %S\n", entry.getKey();


	}





		//	Map<String, List<Integer>> anotherList = new HashMap<>();



	}

}
