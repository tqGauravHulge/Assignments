package com.demo;

import java.util.Iterator;
import java.util.TreeSet;

public class MapTest {
	public static void main(String[] args) {
		TreeSet map = new TreeSet();
		map.add("C");
		map.add("Java");
		map.add("Collection");
		map.add("AngularJs");
		map.add("JQuery");
		Iterator itr = map.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	} // Justify
}