package com.arraylist;

import java.util.ArrayList;

public class ExtractArrayList {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();

		list1.add("Orange");
		list1.add("Yellow");
		list1.add("NaviBlue");
		list1.add("White");
		list1.add("Grey");
		list1.add("Black");

		int startIndex = 1;
		int endIndex = 4;
		ArrayList<String> list2 = new ArrayList<>(list1.subList(startIndex, endIndex));

		System.out.println(list2);
	}

}
