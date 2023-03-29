package com.mapdemo;

import java.util.HashMap;
import java.util.Map;

public class StoresAnothermap {
	public static void main(String[] args) {
		Map<String, Map<String, Integer>> outerMap = new HashMap<>();

		Map<String, Integer> innerMap1 = new HashMap<>();
		innerMap1.put("A", 10);
		innerMap1.put("B", 20);

		Map<String, Integer> innerMap2 = new HashMap<>();
		innerMap2.put("C", 30);
		innerMap2.put("D", 40);

		outerMap.put("Map1", innerMap1);
		outerMap.put("Map2", innerMap2);

		System.out.println(outerMap);
	}
}