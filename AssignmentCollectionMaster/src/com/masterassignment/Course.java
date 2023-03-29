package com.masterassignment;

public class Course {
	private int cid;
	private String cname;
	private String startDate;
	private String subject;
	private float fees;
	private float duration;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(int cid, String cname, String startDate, String subject, float fees, float duration) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.startDate = startDate;
		this.subject = subject;
		this.fees = fees;
		this.duration = duration;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}

	public float getDuration() {
		return duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", startDate=" + startDate + ", subject=" + subject
				+ ", fees=" + fees + ", duration=" + duration + "]";
	}

}
