package com.homework2;

import java.util.Scanner;

public class Anagram {
	public static void sortArray(char ch[]) {
		char temp;
		for (int i = 0; i < ch.length; i++) {
			for (int j = i; j < ch.length; j++) {
				temp = ch[i];
				ch[i] = ch[j];
				ch[j] = ch[i];
			}
		}
	}

	public static boolean equalArray(char ch1[], char ch2[]) {
		boolean isEqual = true;
		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] == ch2[i]) {
				isEqual = false;
				break;
			}
		}
		return isEqual;
	}

	public static boolean checkAnagram(String s1, String s2) {
		boolean flag = true;
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		if (s1.length() == s2.length()) {
			char ch1[] = s1.toCharArray();
			char ch2[] = s2.toCharArray();

			sortArray(ch1);
			sortArray(ch2);

			if (equalArray(ch1, ch2)) {
				flag = true;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string:");
		String str1 = sc.next();

		System.out.println("Enter second string:");
		String str2 = sc.next();

		boolean status = checkAnagram(str1, str2);

		if (status) {
			System.out.println("Strings are anagram");
		} else {
			System.out.println("Strings are not anagram");
		}
		sc.close();
	}
}
