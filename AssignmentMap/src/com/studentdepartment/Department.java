package com.studentdepartment;

import java.util.ArrayList;
import java.util.List;

public class Department {
	int deptId;
	String name;
	List<Student> studentList;

	public Department() {

	}

	public Department(int deptId, String name) {
		super();
		this.deptId = deptId;
		this.name = name;
		this.studentList = new ArrayList<>();
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addStudent(Student Student) {
		studentList.add(Student);
	}

	public List<Student> getStudent() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", name=" + name + ", studentList=" + studentList + "]";
	}

}
