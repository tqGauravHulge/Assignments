package com.studentdepartment2;

import java.util.HashMap;
import java.util.Map;

public class StudentDepartmentHashMap {

	public static void main(String[] args) {
		HashMap<Student, Department> map = new HashMap<>();
		Student s1 = new Student(1, "Gaurav");
		Student s2 = new Student(2, "Suyog");
		Student s3 = new Student(3, "Vivek");
		Student s4 = new Student(4, "Pritish");

		Department d1 = new Department(101, "BCA");
		Department d2 = new Department(102, "BCS");
		Department d3 = new Department(103, "BE");
		Department d4 = new Department(104, "BSC");

		map.put(s1, d1);
		map.put(s2, d2);
		map.put(s3, d3);
		map.put(s4, d4);

		for (Map.Entry<Student, Department> en : map.entrySet()) {
			System.out.println(en.getKey() + " " + en.getValue());
		}
	}

}
