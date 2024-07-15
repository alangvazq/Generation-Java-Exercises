package com.generation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Classes.Course;
import Classes.Student;
import Exceptions.CourseNotFoundException;
import Exceptions.StudentNotFoundException;

public class StudentService {
	private HashMap<String, Course> courseList = new HashMap<>();

	private HashMap<String, Student> students = new HashMap<>();

	private HashMap<String, List<Course>> coursesEnrolledByStudents = new HashMap<>();

	public StudentService() {
		courseList.put("Math", new Course("Math", 10, "Aurelio Baldor"));
		courseList.put("Physics", new Course("Physics", 10, "Albert Einstein"));
		courseList.put("Art", new Course("Art", 10, "Pablo Picasso"));
		courseList.put("History", new Course("History", 10, "Sima Qian"));
		courseList.put("Biology", new Course("Biology", 10, "Charles Darwin"));
	}

	public void enrollStudents(String courseName, String studentID) throws CourseNotFoundException, StudentNotFoundException  {
		if(!courseList.containsKey(courseName)) {
			throw new CourseNotFoundException();
		}
		
		if (!students.containsKey(studentID)) {
			throw new StudentNotFoundException();
		}
		
		Course course = courseList.get(courseName);

		if (!coursesEnrolledByStudents.containsKey(studentID)) {
			coursesEnrolledByStudents.put(studentID, new ArrayList<>());
		}
		coursesEnrolledByStudents.get(studentID).add(course);
	}

	public void unEnrollStudents(String courseName, String studentID) throws CourseNotFoundException, StudentNotFoundException {
		if(!courseList.containsKey(courseName)) {
			throw new CourseNotFoundException();
		}
		
		if (!students.containsKey(studentID)) {
			throw new StudentNotFoundException();
		}
		
		Course course = courseList.get(courseName);

		if (coursesEnrolledByStudents.containsKey(studentID)) {
			coursesEnrolledByStudents.get(studentID).remove(course);
		}
	}

	public void showEnrolledStudents(String courseId) {
		// TODO implement using collections loops
		System.out.println(courseId + " enrolled");
		Course course = courseList.get(courseId);
		for (String studentId : coursesEnrolledByStudents.keySet()) {
			List<Course> allCourses = coursesEnrolledByStudents.get(studentId);
			if (allCourses.contains(course)) {
				Student student = students.get(studentId);
				System.out.println(student);
			}
		}
	}

	public void showAllCourses() {
		for (String key : courseList.keySet()) {
			System.out.println(courseList.get(key));
		}
	}

	public void addStudent(Student student) {
		students.put(student.getId(), student);
	}

	public HashMap<String, Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(HashMap<String, Course> courseList) {
		this.courseList = courseList;
	}

	public HashMap<String, Student> getStudents() {
		return students;
	}

	public void setStudents(HashMap<String, Student> students) {
		this.students = students;
	}

	public HashMap<String, List<Course>> getCoursesEnrolledByStudents() {
		return coursesEnrolledByStudents;
	}

	public void setCoursesEnrolledByStudents(HashMap<String, List<Course>> coursesEnrolledByStudents) {
		this.coursesEnrolledByStudents = coursesEnrolledByStudents;
	}
}