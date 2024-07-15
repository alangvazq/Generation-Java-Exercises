import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Escribe el número de tu calificación: ");
		
		int testScore = in.nextInt();
		char grade;

		if (testScore >= 90 && (testScore<=100)) {
			grade = 'A';
		} else if (testScore >= 80 && (testScore<=90)) {
			grade = 'B';
		} else if (testScore >= 70 && (testScore<=80)) {
			grade = 'C';
		} else if (testScore >= 60 && (testScore<=70)) {
			grade = 'D';
		} else if (testScore > 0 && (testScore<60)) {
			grade = 'F';
		} else {
			System.out.println("Calificación no válida");
			grade = ' ';
		}
		System.out.println("Grade = " + grade);
		in.close();
	}
}
