
public class Main {

	public static void main(String[] args) {
		Student vero = new Student("Vero", "Bellado", 112, 2, 2024);
		
		vero.printFullName();
		
		Courses Java = new Courses("Java", "JC", 2024);
		
		System.out.println(Java.countStudents());
		
		Java.enroll(vero);
		
		System.out.println(Java.countStudents());
	}

}
