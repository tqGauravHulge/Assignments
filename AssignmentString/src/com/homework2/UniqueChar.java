package com.homework2;

public class UniqueChar {
	public static void uniqueChar(String s) {
		s = s.toLowerCase();
		char ch[] = s.toCharArray();
		int count = 0;
		int ucount = 0;
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
			if (count == 1) {
				ucount++;
				System.out.println(ch[i] + " " + count);
			}
		}
		System.out.println("Number of unique char:" + ucount);
	}

	public static void main(String[] args) {
		String str = "Gaurav Sunil Hulge";
		uniqueChar(str);
	}

}
