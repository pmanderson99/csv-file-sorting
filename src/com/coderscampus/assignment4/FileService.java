package com.coderscampus.assignment4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileService {

	public final String MASTERLIST = "student-master-list.csv";

	public Student[] readStudentsFromFile() {
		Student[] student = new Student[101];
		try {
			BufferedReader reader = new BufferedReader(new FileReader(MASTERLIST));
			String line = ",";
			int i = 0;
			while ((line = reader.readLine()) != null) {
				if(!line.equals("")) {
					String[] studentData = line.split(",");
					student[i] = new Student(studentData[0], studentData[1], studentData[2], studentData[3]);
					i++;
				}
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return student;
	}

	public void writeStudentsToFile(Student[] student, String fileName) {
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(fileName));
			writer.write("Student ID, Student Name, Student Course, Student Grade\n");
			for(Student stu : student) {
				if(stu != null) {
					writer.write(stu.getStudentID() + "," + stu.getStudentName() + "," + stu.getStudentCourse() +
							"," + stu.getStudentGrade() + "\n");
				}
			}
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
