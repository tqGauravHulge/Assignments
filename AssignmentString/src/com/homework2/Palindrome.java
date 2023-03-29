package com.homework2;

import java.util.Scanner;

public class Palindrome {

	public static void reverseDisplay(String str1) {

		String rev = "";
		for (int i = str1.length() - 1; i >= 0; i--) {
			rev = rev + str1.charAt(i);
		}
		if (str1.equals(rev)) {
			System.out.println("String is Pallindrome........ ");
		} else {
			System.out.println("String is not pallindrome.......");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str1 = sc.nextLine();

	}

}
