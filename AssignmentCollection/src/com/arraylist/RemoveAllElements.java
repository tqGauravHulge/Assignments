package com.arraylist;

import java.util.ArrayList;

public class RemoveAllElements {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();

		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);

		System.out.println(list1);

		list1.clear();
		System.out.println(list1.isEmpty());
		System.out.println(list1.size());

	}
}
