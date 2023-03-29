package com.masterassignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Academi {
	private List<Course> courses;
	private Map<Long, List<Student>> enrolledStudents;
	private Map<Long, List<Attendance>> courseAttendence;

	private Map<Long, List<TestResult>> testResult;

	public Academi() {
		this.courses = new ArrayList<>();
		this.enrolledStudents = new HashMap<>();
		this.courseAttendence = new HashMap<>();
		this.testResult = new HashMap<>();
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public Map<Long, List<Student>> getEnrolledStudents() {
		return enrolledStudents;
	}

	public void setEnrolledStudents(Map<Long, List<Student>> enrolledStudents) {
		this.enrolledStudents = enrolledStudents;
	}

	public Map<Long, List<Attendance>> getCourseAttendence() {
		return courseAttendence;
	}

	public void setCourseAttendence(Map<Long, List<Attendance>> courseAttendence) {
		this.courseAttendence = courseAttendence;
	}

	public Map<Long, List<TestResult>> getTestResult() {
		return testResult;
	}

	public void setTestResult(Map<Long, List<TestResult>> testResult) {
		this.testResult = testResult;
	}

	@Override
	public String toString() {
		return "Academi [courses=" + courses + ", enrolledStudents=" + enrolledStudents + ", courseAttendence="
				+ courseAttendence + ", testResult=" + testResult + "]";
	}
}
