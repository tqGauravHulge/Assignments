package com.mapdemo;

import java.util.HashMap;
import java.util.Map;

public class IsEmptyOrNot {

	public static void main(String[] args) {
		Map<String, Integer> sourceMap = new HashMap<>();
		sourceMap.put("A", 1);
		sourceMap.put("B", 2);
		sourceMap.put("C", 3);
		System.out.println(sourceMap);
		System.out.println(sourceMap.isEmpty());

		Map<String, Integer> sourceMap1 = new HashMap<>();
		System.out.println(sourceMap1.isEmpty());
	}

}
