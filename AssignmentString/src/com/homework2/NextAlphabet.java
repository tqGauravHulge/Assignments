package com.homework2;

import java.util.Arrays;

public class NextAlphabet {
	public static void nextChar(String s) {
		char ch[] = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			ch[i]++;
			System.out.println(Arrays.toString(ch));
		}
	}

	public static void main(String args[]) {
		String str = "java";
		nextChar(str);
	}
}
