package com.arraylist;

import java.util.ArrayList;

public class InsertElement {

	public static void main(String[] args) {
		ArrayList<String> list2 = new ArrayList<>();

		list2.add("Orange");
		list2.add("Yellow");
		list2.add("NaviBlue");
		list2.add("White");
		list2.add("Grey");
		list2.add("Black");

		System.out.println(list2);

		list2.add(1, "Pink");
		System.out.println(list2);
	}

}
