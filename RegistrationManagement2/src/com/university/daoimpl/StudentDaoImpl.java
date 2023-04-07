package com.university.daoimpl;

import java.util.ArrayList;
import java.util.Scanner;

import com.university.dao.StudentDao;
import com.university.model.Course;
import com.university.model.Student;
import com.university.model.University;

public class StudentDaoImpl implements StudentDao {

	static Scanner sc = new Scanner(System.in);

	ArrayList<Student> studs;
	ArrayList<Course> course;

	@Override
	public void addStudent(University u, Student s) {

		studs = u.getStud();
		studs.add(s);
		u.setStud(studs);

		System.out.println("Student added..............");

	}

	public void deleteStudent(University u, int id) {
		System.out.print("Enter Student ID: ");
		int cId = sc.nextInt();
		for (int i = 0; i < studs.size(); i++) {
			if (studs.get(i).getSid() == cId) {
				studs.remove(i);
				System.out.println("Student deleted successfully.");
			} else {
				System.out.println("Student not found.");
			}
		}

	}

	@Override
	public void updateStudent(University u, int id) {
		System.out.print("Enter Course ID: ");
		int cId = sc.nextInt();
		for (int i = 0; i < studs.size(); i++) {
			if (studs.get(i).getSid() == cId) {
				System.out.print("Enter Student Id: ");
				studs.get(i).setSid(sc.nextInt());
				System.out.print("Enter Student Name: ");
				studs.get(i).setName(sc.next());
				System.out.println("Enter 12th standard percentage:");
				studs.get(i).setSpercent(sc.nextDouble());
				System.out.println("Course updated successfully.");

				System.out.println("Student added..............");
			}
		}
	}

	@Override
	public Student viewStudentBy(University u, int id) {
		System.out.print("Enter Student ID for Vieweing: ");
		int sId = sc.nextInt();
		for (Student s : u.getStud()) {
			if (s.getSid() == sId) {
				System.out.println("Student ID:-" + s.getSid() + "\nStudent Name:- " + s.getName()
						+ "\nStudent Percentage:- " + s.getSpercent());

			}
		}
		return null;
	}

	@Override
	public void displayAllStudent(University u) {
		for (Student s : u.getStud()) {
			System.out.println(s);
		}

	}

	@Override
	public void displayStudentByCourse(University u, String course) {
		System.out.print("Enter Course for Vieweing: ");
		String Course = sc.next();
		for (Course c : u.getCs()) {
			if (c.getCname() == Course) {
				System.out.println("Course ID:-" + c.getCid() + "\nCourse Name:- " + c.getCname() + "\nCourse Fee:- "
						+ c.getFees());

			}
		}
	}
}
