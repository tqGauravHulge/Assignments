package com.demo;

import java.util.Scanner;

public class ProductOfDigit {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int product = 1;

		while (num != 0) {
			product = product * (num % 10);
			num = num / 10;
		}
		System.out.println("product of digit of given number is:" + num);
		sc.close();
	}
}
