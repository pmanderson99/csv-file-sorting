package com.coderscampus.assignment4;

import java.io.IOException;
import java.io.FileNotFoundException;

public class MainApp {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		StudentService studentService = new StudentService();
		studentService.generateCSVReport();
		
	}
	
}
