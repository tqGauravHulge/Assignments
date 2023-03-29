package com.homework2;

import java.util.Arrays;

public class CountDuplicateWords {
	public static void countDulicateWords(String ar) {
		int count;
		ar = ar.toLowerCase();
		String words[] = ar.split("\\s");
		System.out.println(Arrays.toString(words));
		for (int i = 0; i < words.length; i++) {
			count = 1;
			if (words[i].equals(" ") || (words[i].equals("visted")))
				continue;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
					words[j] = "visited";
				}
			}
			System.out.println(words[i] + " " + count);
		}
	}

	public static void main(String[] args) {
		String str = "Gaurav Hulge Gaurav Sunil Hulge";
		countDulicateWords(str);
	}
}
