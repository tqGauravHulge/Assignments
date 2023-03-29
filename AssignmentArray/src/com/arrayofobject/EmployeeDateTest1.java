package com.arrayofobject;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeDateTest1 {

	static Scanner sc = new Scanner(System.in);

	public static void getEmployeeDetails(EmployeeDate e) {
		System.out.println("Enter employee id:");
		e.setId(sc.nextInt());

		System.out.println("Enter employee name:");
		e.setName(sc.next());

		System.out.println("Enter Salary:");
		e.setSalary(sc.nextFloat());

		e.setJoiningDate(new Date());
		System.out.println("Enter Day:");
		e.getJoiningDate().setDay(sc.next());

		System.out.println("Enter Month:");
		e.getJoiningDate().setMonth(sc.next());

		System.out.println("Enter year");
		e.getJoiningDate().setYear(sc.next());
	}

	public static void main(String args[]) {
		EmployeeDate empd[] = new EmployeeDate[3];

		for (int i = 0; i < empd.length; i++) {
			empd[i] = new EmployeeDate();
			getEmployeeDetails(empd[i]);
			System.out.println(empd[i]);
		}
		System.out.println(Arrays.toString(empd));
	}
}
