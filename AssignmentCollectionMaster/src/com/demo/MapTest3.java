package com.demo;

import java.util.Iterator;
import java.util.TreeSet;

public class MapTest3 {
	public static void main(String[] args) {
		TreeSet map = new TreeSet();
		map.add("Jan");
		map.add("Feb");
		map.add("Mar");
		map.add("Apr");
		map.add("May");
		Iterator itr = map.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}
}