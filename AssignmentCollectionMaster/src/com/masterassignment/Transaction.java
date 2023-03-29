package com.masterassignment;

public class Transaction {
	private String studentName;
	private int amountPaid;

	public Transaction(String studentName, int amountPaid) {
		this.studentName = studentName;
		this.amountPaid = amountPaid;
	}

	public String getStudentName() {
		return studentName;
	}

	public int getAmountPaid() {
		return amountPaid;
	}
}