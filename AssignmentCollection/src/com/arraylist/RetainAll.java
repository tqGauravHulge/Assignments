package com.arraylist;

import java.util.ArrayList;

public class RetainAll {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();

		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("4");
		list1.add("5");
		list1.add("6");

		System.out.println(list1);

		ArrayList<String> list2 = new ArrayList<>();

		list2.add("Orange");
		list2.add("Yellow");
		list2.add("NaviBlue");
		list2.add("White");
		list2.add("Grey");
		list2.add("Black");

		System.out.println(list2);

		list1.retainAll(list2);
		System.out.println("After retaining");
		System.out.println(list1);
		System.out.println(list2);
	}
}
