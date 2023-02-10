package com.demo;

public class Cycle {
	private int accountNo;
	private int noOfWheels;

	public Cycle() {
		System.out.println("I am in default constructor:");
	}

	public Cycle(int accountNo, int noOfWheels) {
		this();
		System.out.println("I am in another Constructor:");
		this.accountNo = accountNo;
		this.noOfWheels = noOfWheels;
	}

	public void display() {
		System.out.println(accountNo + " " + noOfWheels);
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public String toString() {
		return "Cycle [accountNo=" + accountNo + ", noOfWheels=" + noOfWheels + "]";
	}

}
