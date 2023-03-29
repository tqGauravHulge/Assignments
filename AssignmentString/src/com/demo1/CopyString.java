package com.demo1;

public class CopyString {

	public static void main(String[] args) {
		String str = "abc";

		String strCopy = str;
		str = "def";
		System.out.println(strCopy);

	}

}
