package com.coderscampus.assignment4;


public class Student implements Comparable<Student> {
	
	private String studentID;
	private String studentName;
	private String studentCourse;
	private String studentGrade;
	
	public Student(String studentID, String studentName, String studentCourse, String studentGrade ) {
	
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentCourse = studentCourse;
		this.studentGrade = studentGrade;
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
	

	@Override
	public int compareTo(Student that) {
		return that.studentGrade.compareTo(this.studentGrade);
	}

}
