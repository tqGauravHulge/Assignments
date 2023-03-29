package com.arrayofobject;

public class EmployeeDate {
	private int id;
	private String name;
	private double salary;
	public Date joiningDate;

	public EmployeeDate() {

	}

	public EmployeeDate(int id, String name, double salary, Date joiningDate) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.joiningDate = joiningDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String toString() {
		return "Employee:" + " " + id + " " + name + " " + salary + " " + joiningDate;
	}
}
