package com.mapdemo;

import java.util.HashMap;

public class ContainsValueExample {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Gaurav");
		map.put(2, "Sahil");
		map.put(3, "Rushikesh");
		map.put(4, "Akash");

		System.out.println(map);

		System.out.println(map.containsValue("Gaurav"));

	}

}
