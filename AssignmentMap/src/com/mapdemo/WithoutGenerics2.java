package com.mapdemo;

import java.util.HashMap;

public class WithoutGenerics2 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("One", 1);
		map.put("Two", "too");
		map.put(3, "Three");
		map.put(4, "Four");
		map.put(5, "Five");
		map.put(6, "Six");
		System.out.println(map);

	}

}
