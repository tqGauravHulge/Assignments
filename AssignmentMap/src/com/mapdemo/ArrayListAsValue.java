package com.mapdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayListAsValue {

	public static void main(String[] args) {
		Map<String, ArrayList<Integer>> map = new HashMap<>();

		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);

		map.put("list1", list1);

		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(3);
		list2.add(4);

		map.put("list2", list2);

		ArrayList<Integer> retrievedList = map.get("list1");
		System.out.println("List 1: " + retrievedList);

		retrievedList = map.get("list2");
		System.out.println("List 2: " + retrievedList);
	}

}
