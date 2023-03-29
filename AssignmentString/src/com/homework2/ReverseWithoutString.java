package com.homework2;

import java.util.Scanner;

public class ReverseWithoutString {
	public static String revesreString(String str) {
		if (str.isEmpty()) {
			return str;
		} else {
			return revesreString(str.substring(1)) + str.charAt(0);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.next();
		String result = ReverseWithoutString.revesreString(str);
		System.out.println(result);

		sc.close();
	}

}