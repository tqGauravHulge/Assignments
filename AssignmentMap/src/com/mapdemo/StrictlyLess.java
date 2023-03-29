package com.mapdemo;

import java.util.HashMap;
import java.util.Map;

public class StrictlyLess {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		map.put(5, "Five");
		map.put(6, "Six");

		int givenKey = 4;

		HashMap<Integer, String> portionMap = new HashMap<>();

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			if (entry.getKey() < givenKey) {
				portionMap.put(entry.getKey(), entry.getValue());
			}
		}

		System.out.println("Portion of the map with keys less than " + givenKey + ": " + portionMap);
	}
}
