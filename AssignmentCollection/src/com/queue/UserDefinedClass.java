package com.queue;

import java.util.LinkedList;
import java.util.Queue;

public class UserDefinedClass implements Comparable<UserDefinedClass> {
	private int id;
	private String name;

	public UserDefinedClass(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(UserDefinedClass o) {
		return this.getName().compareTo(o.getName());
	}

	public static void main(String[] args) {
		Queue<UserDefinedClass> queue = new LinkedList<>();

		UserDefinedClass obj1 = new UserDefinedClass(1, "John");
		UserDefinedClass obj2 = new UserDefinedClass(2, "Jane");
		UserDefinedClass obj3 = new UserDefinedClass(3, "Bob");

		queue.add(obj1);
		queue.add(obj2);
		queue.add(obj3);

		System.out.println("Queue elements:");
		for (UserDefinedClass obj : queue) {
			System.out.println(obj.getId() + " " + obj.getName());
		}

		// Collections.sort((List<T>) queue);
	}

}