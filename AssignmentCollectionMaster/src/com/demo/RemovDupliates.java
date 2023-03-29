package com.demo;

import java.util.ArrayList;

public class RemovDupliates {

	public static ArrayList<String> removeDuplicates(ArrayList<String> list) {
		ArrayList<String> newList = new ArrayList<>();
		for (String e : list) {
			if (!newList.contains(e)) {
				newList.add(e);
			}
		}
		return newList;
	}

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();

		al.add("Sun");
		al.add("Mon");
		al.add("Sat");
		al.add("Sun");
		al.add("Mon");
		al.add("Sat");
		al.add("Sun");
		al.add("Sat");
		al.add("Sun");
		al.add("Mon");

		System.out.println(al);

		ArrayList<String> newList = removeDuplicates(al);

		System.out.println("After removing duplicates:" + " " + newList);
	}
}
