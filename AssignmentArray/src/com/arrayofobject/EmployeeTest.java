package com.arrayofobject;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeTest {
	static Scanner sc = new Scanner(System.in);

	public static void enterEmployeeDetails(Employee e) {
		System.out.println("Enter employee id:");
		e.setId(sc.nextInt());

		System.out.println("Enter employee name:");
		e.setName(sc.next());

		System.out.println("Enter Salary:");
		e.setSalary(sc.nextFloat());
	}

	public static void main(String args[]) {
		Employee emp[] = new Employee[3];

		/*
		 * emp[0] = new Employee(101, "Vivek", 75000); emp[1] = new Employee(102,
		 * "Mahesh", 70000); emp[2] = new Employee(103, "ABC", 75000); emp[3] = new
		 * Employee(104, "XYZ", 70000);
		 */

		// System.out.println(emp[0]);
		// System.out.println(emp[1]);

		for (int i = 0; i < emp.length; i++) {
			emp[i] = new Employee();
			enterEmployeeDetails(emp[i]);
		}
		System.out.println(Arrays.toString(emp));
		for (int j = 0; j < emp.length; j++) {
			for (int k = j + 1; k < emp.length; k++) {
				if (emp[j].getSalary() == (emp[k].getSalary())) {
					System.out.println(emp[k].getSalary());
				}
			}
		}

		for (Employee e : emp) {
			System.out.println(e);
		}
	}
}
