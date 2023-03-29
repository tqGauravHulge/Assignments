package com.studentdepartment;

import java.util.HashMap;
import java.util.Map;

public class StudentDepartment {

	public static void main(String[] args) {
		Department dept1 = new Department(1, "Core JAVA");
		dept1.addStudent(new Student(1, "Vivek"));
		dept1.addStudent(new Student(2, "Suyog"));
		dept1.addStudent(new Student(3, "Omkar"));
		dept1.addStudent(new Student(4, "Aadinath"));

		Department dept2 = new Department(2, "MySQl");
		dept2.addStudent(new Student(5, "Yashank"));
		dept2.addStudent(new Student(6, "Gaurav"));
		dept2.addStudent(new Student(7, "Pritish"));
		dept2.addStudent(new Student(8, "Bhushan"));

		Department dept3 = new Department(3, "ReactJs");
		dept3.addStudent(new Student(9, "Sahil"));
		dept3.addStudent(new Student(10, "Rushikesh"));
		dept3.addStudent(new Student(11, "Akash"));
		dept3.addStudent(new Student(12, "Mehul"));

		Department dept4 = new Department(2, "Angular");
		dept4.addStudent(new Student(5, "Yashank"));
		dept4.addStudent(new Student(6, "Gaurav"));
		dept4.addStudent(new Student(7, "Pritish"));
		dept4.addStudent(new Student(8, "Bhushan"));

		Map<Integer, Department> deptMap = new HashMap<>();
		deptMap.put(dept1.getDeptId(), dept1);
		deptMap.put(dept2.getDeptId(), dept2);
		deptMap.put(dept3.getDeptId(), dept3);
		deptMap.put(dept4.getDeptId(), dept4);

		for (Department dept : deptMap.values()) {
			System.out.println("Department" + dept.getDeptId() + ": " + dept.getName());
			for (Student student : dept.getStudent()) {
				System.out.println("student" + student.getRollNo() + ": " + student.getName());
			}
		}
	}
}
