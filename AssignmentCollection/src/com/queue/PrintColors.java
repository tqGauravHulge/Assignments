package com.queue;

import java.util.LinkedList;
import java.util.Queue;

public class PrintColors {
	public static void main(String[] args) {
		Queue<String> colorQueue = new LinkedList<>();

		colorQueue.add("Red");
		colorQueue.add("Green");
		colorQueue.add("Blue");
		colorQueue.add("Yellow");
		colorQueue.add("Purple");

		System.out.println("Color Queue: " + colorQueue);
	}
}