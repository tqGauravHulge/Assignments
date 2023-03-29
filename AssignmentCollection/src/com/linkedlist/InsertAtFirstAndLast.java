package com.linkedlist;

import java.util.LinkedList;

public class InsertAtFirstAndLast {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();

		list.add("Gaurav");
		list.add("Sahil");
		list.add("Rushikesh");
		list.add("Akash");
		list.add("Mehul");

		System.out.println(list);

		list.addFirst("Omkar");

		System.out.println(list);

		list.offerFirst(null);

		System.out.println(list);

		list.add("Gaurav");

		System.out.println(list);

		list.offerLast("Sahil");

		System.out.println(list);

	}

}
