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
		Student[] students = new Student[101];
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(MASTERLIST));
			String line = "";
			int i = 0;
			while ((line = reader.readLine()) != null) {
				students[i] = new Student(line.split(","));
				i++;
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return students;
	}

	public void writeStudentsToFile(Student[] students, String fileName) throws IOException {
		BufferedWriter writer;
		try {
			writer = new BufferedWriter(new FileWriter(fileName));
			writer.write("Student ID, Student Name, Student Course, Student Grade\n");
			for (Student student : students) {
				if (students != null) {
					writer.write(student.getStudentID() + "," + student.getStudentName() + ","
							+ student.getStudentCourse() + "," + student.getStudentGrade() + "\n");
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
