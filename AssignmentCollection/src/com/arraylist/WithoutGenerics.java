package com.arraylist;

import java.util.ArrayList;

public class WithoutGenerics {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();

		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);

		System.out.println(list1);

		ArrayList list2 = new ArrayList();

		list2.add("A");
		list2.add("B");
		list2.add("C");
		list2.add("D");
		list2.add("E");
		list2.add("F");

		System.out.println(list2);
	}

}
