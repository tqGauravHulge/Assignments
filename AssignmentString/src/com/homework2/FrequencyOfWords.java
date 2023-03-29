package com.homework2;

import java.util.Arrays;

public class FrequencyOfWords {
	public static void frequencyOfWords(String s) {
		s = s.toLowerCase();
		String words[] = s.split(" ");
		System.out.println(Arrays.toString(words));
		int count;

		for (int i = 0; i < words.length; i++) {
			if (words[i].equals("visited"))
				continue;
			count = 1;
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
		String str = "Gaurav Sunil Hulge Gaurav Sunil Hulge";
		frequencyOfWords(str);
	}
}
