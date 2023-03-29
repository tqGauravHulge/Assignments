package com.employee3;

import java.util.HashMap;

public class EmployeeTest {
	public static void main(String args[]) {
		HashMap<Employee, String> map = new HashMap<>();
		map.put(new Employee(1, "Gaurav", 35000), "TQ");
		map.put(new Employee(2, "Sahil", 65000), "TQ");
		map.put(new Employee(3, "Ajay", 45000), "TQ");
		map.put(new Employee(4, "Vivek", 37000), "TQ");
		map.put(new Employee(5, "Suyog", 40000), "TQ");
		map.put(new Employee(6, "Adinath", 37000), "TQ");

		System.out.println(map);

		// Collections.sort(map, new SalaryComparator());

	}
}
