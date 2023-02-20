package com.coderscampus.assignment4;

public class Student {
	
	private String studentID;
	private String studentName;
	private String studentCourse;
	private String studentGrade;
	
	public Student(String[] args) {
		setStudentID(args[0]);
		setStudentName(args[1]);
		setStudentCourse(args[2]);
		setStudentGrade(args[3]);
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}

	public String getStudentGrade() {
		return studentGrade;
	}

	public void setStudentGrade(String studentGrade) {
		this.studentGrade = studentGrade;
	}
	
	@Override
	public String toString() {
		return studentID + "," + studentName + "," + studentCourse + "," + studentGrade;
	}
	
}
