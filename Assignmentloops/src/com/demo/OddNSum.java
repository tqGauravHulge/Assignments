package com.demo;

import java.util.Scanner;

public class OddNSum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= num; i++) {
			if (i != 0)
				sum += i;
		}
		System.out.println("Sum of odd numbers:" + sum);
		sc.close();
	}
}
