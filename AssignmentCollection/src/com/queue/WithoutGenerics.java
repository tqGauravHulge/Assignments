package com.queue;

import java.util.LinkedList;
import java.util.Queue;

public class WithoutGenerics {

	public static void main(String[] args) {
		Queue IntegerQueue = new LinkedList();

		IntegerQueue.add("Gaurav");
		IntegerQueue.add("Apurva");
		IntegerQueue.add("Kiran");
		IntegerQueue.add("Pawan");

		System.out.println(IntegerQueue);
	}

}
