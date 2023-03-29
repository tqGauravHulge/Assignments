package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class CompareTwoCollection {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();

		list1.add("Orange");
		list1.add("Yellow");
		list1.add("NaviBlue");
		list1.add("White");
		list1.add("Grey");
		list1.add("Black");

		ArrayList<String> list2 = new ArrayList<>();

		list2.add("Orange");
		list2.add("Yellow");
		list2.add("NaviBlue");
		list2.add("White");
		list2.add("Grey");
		list2.add("Black");

		Collections.sort(list1);
		Collections.sort(list2);

		boolean isEqual = list1.equals(list2);

		System.out.println(isEqual);
	}
}
