package com.masterassignment;

public class TestResult {
	private int testDate;
	private int testId;
	private int studeId;
	private int courseId;
	private float marks;

	public TestResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TestResult(int testDate, int testId, int studeId, int courseId, float marks) {
		super();
		this.testDate = testDate;
		this.testId = testId;
		this.studeId = studeId;
		this.courseId = courseId;
		this.marks = marks;
	}

	public int getTestDate() {
		return testDate;
	}

	public void setTestDate(int testDate) {
		this.testDate = testDate;
	}

	public int getTestId() {
		return testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public int getStudeId() {
		return studeId;
	}

	public void setStudeId(int studeId) {
		this.studeId = studeId;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "TettReult [testDate=" + testDate + ", testId=" + testId + ", studeId=" + studeId + ", courseId="
				+ courseId + ", marks=" + marks + "]";
	}

}
