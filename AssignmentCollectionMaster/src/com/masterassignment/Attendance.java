package com.masterassignment;

public class Attendance {
	private int presentDays;
	private int absentDays;

	public Attendance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Attendance(int presentDays, int absentDays) {
		super();
		this.presentDays = presentDays;
		this.absentDays = absentDays;
	}

	public int getPresentDays() {
		return presentDays;
	}

	public void setPresentDays(int presentDays) {
		this.presentDays = presentDays;
	}

	public int getAbsentDays() {
		return absentDays;
	}

	public void setAbsentDays(int absentDays) {
		this.absentDays = absentDays;
	}

	@Override
	public String toString() {
		return "Attendance [presentDays=" + presentDays + ", absentDays=" + absentDays + "]";
	}

}
