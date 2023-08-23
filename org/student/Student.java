package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("Student Name : Oppenheimer");
	}

	public void studentDept() {
		System.out.println("Student Department : EEE");
	}

	public void studentId() {
		System.out.println("Student Name : 124512");
	}

	public static void main(String[] args) {

		Student studentObject = new Student();

		System.out.println("Example for Multilevel Inheritance");
		System.out.println("Methods in Class College are inherited by Class Department which in turn inherited by Class Studnet and are called");
		studentObject.collegeName();
		studentObject.collegeCode();
		studentObject.collegeRank();
		System.out.println("----------");

		System.out.println("Methods in Class Department are inherited by Class Student and are called");
		studentObject.deptName();
		System.out.println("----------");

		System.out.println("Methods in Class Student are called");
		studentObject.studentName();
		studentObject.studentDept();
		studentObject.studentId();
	}
}
