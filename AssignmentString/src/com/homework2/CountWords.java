package com.homework2;

public class CountWords {
	public static int countWords(String s) {
		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String str = "Gaurav Sunil Hulge";
		int count = countWords(str);
		System.out.println(str);
		System.out.println(count);
	}

}
