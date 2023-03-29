package com.itemsupplier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemSupplierHashMap {
	public static void createMap(ArrayList<Supplier> al) {
		HashMap<String, ArrayList<Item>> map = new HashMap<>();
		for (Supplier s : al) {
			String sname = s.getSname();
			if (!map.containsKey(sname)) {
				map.put(sname, null);
			}
		}

		for (Map.Entry<String, ArrayList<Item>> en : map.entrySet()) {
			System.out.println(en.getKey());
			for (Item s : en.getValue()) {
				System.out.println(s);
			}
		}
		addStudent(map);
	}

	public static void addStudent(HashMap<String, ArrayList<Item>> map1) {
		ArrayList<Item> list = new ArrayList<>();

		list.add(new Item(01, "item01"));
		list.add(new Item(02, "item02"));

		String d = "CSE";

		if (!map1.containsKey(d)) {
			map1.put(d, list);
		} else {
			list.addAll(map1.get(d));
			map1.put(d, list);
		}

		for (Map.Entry<String, ArrayList<Item>> en : map1.entrySet()) {
			System.out.println(en.getKey());
			for (Item s : en.getValue()) {
				System.out.println(s);
			}
		}
	}

	public static void main(String[] args) {
		List<Item> list1 = new ArrayList<>();
		list1.add(new Item(1, "Item1"));
		list1.add(new Item(2, "Item2"));
		list1.add(new Item(3, "Item3"));
		list1.add(new Item(4, "Item4"));

		ArrayList<Item> list2 = new ArrayList<>();
		list2.add(new Item(1, "Item5"));
		list2.add(new Item(2, "Item6"));
		list2.add(new Item(3, "Item7"));
		list2.add(new Item(4, "Item8"));

		ArrayList<Item> list3 = new ArrayList<>();
		list3.add(new Item(1, "Item9"));
		list3.add(new Item(2, "Item10"));
		list3.add(new Item(3, "Item11"));
		list3.add(new Item(4, "Item12"));

		ArrayList<Supplier> d1 = new ArrayList<>();

		d1.add(new Supplier(101, "CSE", list1));
		d1.add(new Supplier(102, "IT", list2));
		d1.add(new Supplier(103, "ECE", list3));

		createMap(d1);
	}
}
