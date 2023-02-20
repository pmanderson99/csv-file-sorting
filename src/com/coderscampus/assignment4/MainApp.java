package com.coderscampus.assignment4;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MainApp {
	
	public static void main(String[] args) throws FileNotFoundException, IOException{
		StudentService studentService = new StudentService();
		studentService.generateCSVReport();
	}
}
