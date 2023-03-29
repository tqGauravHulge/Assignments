package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SwapTwoElements {

	public static void main(String[] args) {
		ArrayList<String> list2 = new ArrayList<>();

		list2.add("Orange");
		list2.add("Yellow");
		list2.add("NaviBlue");
		list2.add("White");
		list2.add("Grey");
		list2.add("Black");

		System.out.println("Before swapping:" + list2);

		Collections.swap(list2, 2, 3);

		System.out.println("After swapping:" + list2);
	}
}
