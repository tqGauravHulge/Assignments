package com.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		Iterator<Integer> iterator = list.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			list.remove(0); // Concurrent modification of the list
		}
	}
}
