package com.mapdemo;

import java.util.HashMap;
import java.util.Map;

public class CopyingMap {

	public static void main(String[] args) {

		Map<String, Integer> sourceMap = new HashMap<>();
		sourceMap.put("A", 1);
		sourceMap.put("B", 2);
		sourceMap.put("C", 3);

		Map<String, Integer> destMap = new HashMap<>();
		destMap.put("D", 4);
		destMap.put("E", 6);
		destMap.put("F", 5);
		destMap.putAll(sourceMap);
		System.out.println(destMap);
	}

}
