package com.coderscampus.assignment4;

import java.io.IOException;
import java.util.Arrays;


public class StudentService {

	Student[] students = new Student[101];
	Student[] compSciStudents = new Student[101];
	Student[] statStudents = new Student[101];
	Student[] apMthStudents = new Student[101];

	FileService fileService = new FileService();

	public void generateCSVReport() throws IOException {
		students = fileService.readStudentsFromFile();
		Arrays.sort(students);
		int csStu = 0;
		int stStu = 0;
		int apMthStu = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i].getStudentCourse().matches("COMPSCI")) {
				compSciStudents[csStu++] = students[i];
			} else if (students[i].getStudentCourse().matches("STAT")) {
				statStudents[stStu++] = students[i];
			} else {
				apMthStudents[apMthStu++] = students[i];
			}
		}

		fileService.writeStudentsToFile(compSciStudents, "course1.csv");
		fileService.writeStudentsToFile(statStudents, "course2.csv");
		fileService.writeStudentsToFile(apMthStudents, "course3.csv");

	}

}

