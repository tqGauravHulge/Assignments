package com.arraylist;

import java.util.ArrayList;

public class IteratingArrayListForEach {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();

		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);

		for (Integer i : list1) {
			System.out.print(i + " ");
		}

	}

}
