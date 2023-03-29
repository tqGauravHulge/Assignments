package com.mapdemo;

import java.util.HashMap;

public class WithoutGenerics {
	public static void main(String args[]) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		map.put(5, "Five");
		map.put(6, "Six");
		System.out.println(map);

		HashMap<String, Integer> map1 = new HashMap<>();
		map1.put("One", 1);
		map1.put("Two", 2);
		map1.put("Three", 3);
		map1.put("Four", 4);
		map1.put("Five", 5);

		System.out.println(map1);
	}
}
