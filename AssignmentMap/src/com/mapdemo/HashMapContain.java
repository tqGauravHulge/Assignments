package com.mapdemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapContain {

	public static void main(String[] args) {
		Map<String, Integer> sourceMap = new HashMap<>();
		sourceMap.put("A", 1);
		sourceMap.put("B", 2);
		sourceMap.put("C", 3);
		System.out.println(sourceMap);
		System.out.println(sourceMap.containsKey("A"));
	}

}
