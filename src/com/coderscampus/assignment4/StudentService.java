package com.coderscampus.assignment4;

import java.io.IOException;
import java.util.Arrays;

public class StudentService {
	
	private Student[] students = new Student[100];
	private Student[] compSciStudents = new Student[100];
	private Student[] statStudents = new Student[100];
	private Student[] apMthStudents = new Student [100];
	
	FileService fileService = new FileService();
	
	public StudentService() {
		students = fileService.readStudentsFromFile();
		Arrays.sort(students);
	}
	
	public void generateCSVReport() throws IOException {
		int csStu = 0, stStu = 0, apMthStu = 0;
		for(int i = 0; i < students.length; i++) {
			if(students[i].getStudentCourse().matches("COMPSCI")) {
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
