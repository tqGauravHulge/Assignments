package com.arraylist;

import java.util.ArrayList;

public class ReplaceElement {

	public static void main(String[] args) {
		ArrayList<String> list2 = new ArrayList<>();

		list2.add("Orange");
		list2.add("Yellow");
		list2.add("NaviBlue");
		list2.add("White");
		list2.add("Grey");
		list2.add("Black");

		System.out.println("Before replace:" + list2);

		list2.set(2, "Red");

		System.out.println("After replace:" + list2);
	}
}
