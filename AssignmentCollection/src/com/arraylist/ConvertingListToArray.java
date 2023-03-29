package com.arraylist;

import java.util.ArrayList;

public class ConvertingListToArray {

	public static void main(String[] args) {
		ArrayList<String> list2 = new ArrayList<>();

		list2.add("Orange");
		list2.add("Yellow");
		list2.add("NaviBlue");
		list2.add("White");
		list2.add("Grey");
		list2.add("Black");

		String str[] = list2.toArray(new String[0]);

		for (int i = 0; i < str.length; i++) {
			String data = str[i];
			System.out.print(data + " ");
		}
	}

}
