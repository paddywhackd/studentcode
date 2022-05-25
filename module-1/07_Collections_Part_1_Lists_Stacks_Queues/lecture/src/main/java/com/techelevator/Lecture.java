package com.techelevator;

import java.lang.module.FindException;
import java.util.ArrayList;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");

		list<Integer> myInts = (list<Integer>) new ArrayList<Object>();
		myInts.add(1, 4);
		myInts.add(2, 4);
		myInts.add(3, 4);
		myInts.add(4, 4);

		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");

		for (int index = 0; index < myInts.size(); index ++) {
			System.out.println(myInts.get(index));
		}



		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");
		myInts.remove(3);

		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");


		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");


		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");


		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");


		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");


		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");
		collections.sort(myInts);
		for (int index = 0; index < myInts.size(); index++) {
			System.out.println(myInts.get(index));
		}

		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");
		collections.reverse(myInts);

		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();


	}
}
