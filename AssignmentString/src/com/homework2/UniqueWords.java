package com.homework2;

import java.util.Arrays;

public class UniqueWords {
	public static void uniqueWords(String s) {
		int count = 0;
		int ucount = 0;
		s = s.toLowerCase();
		String words[] = s.split("\\s");
		System.out.println(Arrays.toString(words));
		for (int i = 0; i < words.length; i++) {
			count = 1;
			if (words[i].equals(" ") || words[i].equals("visited"))
				continue;
			for (int j = 0; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
					words[j] = "visited";
				}
			}
			if (count == 1) {
				ucount++;
				System.out.println(words[i] + " " + count);
			}
		}
		System.out.println("Number of unique words:" + ucount);
	}

	public static void main(String[] args) {
		String str = "Gaurav Sunil Hulge gaurav";
		uniqueWords(str);
	}
}
