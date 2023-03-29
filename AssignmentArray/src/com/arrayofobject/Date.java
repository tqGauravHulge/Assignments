package com.arrayofobject;

public class Date {
	private String day;
	private String month;
	private String year;

	public Date() {

	}

	public Date(String day, String month, String year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getDay(String month) {
		return day;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getMonth() {
		return month;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getYear() {
		return year;
	}

	public String toString() {
		return "Date:" + " " + day + " " + month + " " + year;
	}
}
