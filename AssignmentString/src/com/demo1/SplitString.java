package com.demo1;

public class SplitString {

	public static void main(String[] args) {
		String str = "HELLO,WORLD";
		String[] stringarray = str.split(",");

		for (int i = 0; i < stringarray.length; i++) {
			System.out.println(stringarray[i]);
		}

	}

}
