package com.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchElement {
	public static void searchElement(ArrayList<String> list, String value) {
		boolean status = false;
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).equals(value)) {
					status = true;
					break;
				}
			}
		}
		if (status) {
			System.out.println("Value is present");
		} else {
			System.out.println("Value is not present");
		}
	}

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();

		list1.add("Orange");
		list1.add("Yellow");
		list1.add("NaviBlue");
		list1.add("White");
		list1.add("Grey");
		list1.add("Black");

		System.out.println(list1);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value:");
		String val = sc.next();
		searchElement(list1, val);
	}
}
