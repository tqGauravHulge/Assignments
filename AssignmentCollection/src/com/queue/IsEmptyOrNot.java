package com.queue;

import java.util.LinkedList;
import java.util.Queue;

public class IsEmptyOrNot {

	public static void main(String[] args) {
		Queue<String> colorQueue = new LinkedList<>();

		colorQueue.add("Red");
		colorQueue.add("Green");
		colorQueue.add("Blue");
		colorQueue.add("Yellow");
		colorQueue.add("Purple");

		System.out.println(colorQueue);
		System.out.println(colorQueue.isEmpty());

		Queue<String> colorQueue1 = new LinkedList<>();

		System.out.println(colorQueue1.isEmpty());
	}

}
