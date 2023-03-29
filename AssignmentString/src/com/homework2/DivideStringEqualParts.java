package com.homework2;

import java.util.Arrays;

public class DivideStringEqualParts {
	public static void divideString(String s) {
		int len = s.length();
		int n = 2;
		int noOfChar = len / 2;

		String splitStr[] = new String[n];
		int temp = 0;
		if (len % n != 0) {
			System.out.println("cannot divide into equal parts");
		} else {
			for (int i = 0; i < s.length(); i += noOfChar) {
				splitStr[temp] = s.substring(i, i + noOfChar);
				temp++;
			}
		}
		System.out.println(Arrays.toString(splitStr));
	}

	public static void main(String args[]) {
		String str = "Programmings";
		divideString(str);
	}
}
