package com.constructorchaining;

public class CycleTest {

	public static void main(String[] args) {

		Cycle c1 = new Cycle();
		Cycle c2 = new Cycle(5, 5);

		System.out.println(c1);
		System.out.println(c2);

	}

}
