package com.homework2;

public class CountFrequencyChar {
	public static void countFrequency(String str1) {
		System.out.println(str1);
		str1 = str1.toLowerCase();
		char ch[] = str1.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			count = 1;
			if (ch[i] == ' ' || ch[i] == '\0')
				continue;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j] = '\0';
				}
			}
			System.out.println(ch[i] + ": " + count);
		}
	}

	public static void main(String[] args) {
		String str = "Gaurav Sunil Hulge";
		countFrequency(str);
	}
}
