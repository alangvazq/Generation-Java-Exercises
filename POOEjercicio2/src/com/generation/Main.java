// https://github.com/generation-org/JAVA/tree/master/Object%20Oriented%20Programming%20-%20Advanced

package com.generation;

import Classes.Student;
import Exceptions.CourseNotFoundException;
import Exceptions.StudentNotFoundException;

public class Main {

	public static void main(String[] args) {
		StudentService studentService = new StudentService();
		// TODO refactor this code to use encapsulation inside studentsService
		//studentService.students.put("1030", new Student("Carlos", "1030", 31));
		//studentService.students.put("1040", new Student("Ian", "1040", 28));
		//studentService.students.put("1050", new Student("Elise", "1050", 26));
		//studentService.students.put("1020", new Student("Santiago", "1020", 33));

		studentService.addStudent(new Student("Carlos", "1030", 31));
		studentService.addStudent(new Student("Ian", "1040", 28));
		studentService.addStudent(new Student("Elise", "1050", 26));
		studentService.addStudent(new Student("Santiago", "1020", 33));
		
		try {
			studentService.enrollStudents("Math", "1030");
		} catch (CourseNotFoundException | StudentNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		studentService.showAllCourses();
	}
}