package com.demo1;

public class CompareStrings {

	public static void main(String[] args) {
		String s1 = new String("Gaurav");
		String s2 = new String("GAURAV");
		String s3 = new String("Gaurav");
		System.out.println(s2.compareTo(s1));
		System.out.println(s1.compareTo(s3));

	}

}
