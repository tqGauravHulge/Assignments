package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class OneToFiftyEven {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i <= 50; i++) {
			list.add(i);
		}
		System.out.print(list + " ");
		System.out.println();

		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {
			Integer num = itr.next();
			if (num % 2 == 0) {
				System.out.print(num + " ");
			}
		}
	}

}
