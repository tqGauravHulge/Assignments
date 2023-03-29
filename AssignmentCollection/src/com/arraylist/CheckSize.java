package com.arraylist;

import java.util.ArrayList;

public class CheckSize {

	public static void main(String[] args) {
		ArrayList<String> list2 = new ArrayList<>();

		list2.add("Orange");
		list2.add("Yellow");
		list2.add("NaviBlue");
		list2.add("White");
		list2.add("Grey");
		list2.add("Black");

		System.out.println(list2.isEmpty());
		ArrayList<String> list3 = new ArrayList<>();

		System.out.println(list3.isEmpty());
	}
}
