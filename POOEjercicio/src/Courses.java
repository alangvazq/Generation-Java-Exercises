import java.util.ArrayList;

public class Courses {
	String courseName;
	String professorName;
	int year;
	
	public Courses(String courseName, String professorName, int year) {
		this.courseName = courseName;
		this.professorName = professorName;
		this.year = year;
	}
	
	ArrayList<Student> students = new ArrayList<Student>();

	public void enroll(Student student) {
		// TODO add the student to the collection
		students.add(student);
	}

	public void unEnroll(Student student) {
		// TODO remove this student from the collection
		// Hint: check if that really is this student
		students.remove(student);
	}

	public int countStudents() {
		return students.size();
	}

	public int bestGrade() {
		// TODO implement
		int best=0;
		for (Student student : students) {
			if (student.grade>best) {
				best=student.grade;
			}
		}
		return best;
	}
	
}
