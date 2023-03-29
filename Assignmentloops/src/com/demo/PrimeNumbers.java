package com.demo;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		int number, square;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number : ");
		number = sc.nextInt();
		for (int i = 1; i <= number; i++) {
			square = i * i;
			System.out.println("The Square of Number  " + i + "  =  " + square);
			sc.close();
		}
	}
}
