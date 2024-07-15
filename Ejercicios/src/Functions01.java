import java.util.Scanner;

public class Functions01 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter your name:  ");
		String name = console.next();
		System.out.println("Enter your last name:  ");
		String lastName = console.next();
		printNameCharacters(name);
		printNameLength(name);
		printNameCharacters(lastName);
		printNameLength(lastName);
		printFullName(name, lastName);
		console.close();
	}

	private static void printNameLength(String name) {
		System.out.println(name.length());
	}

	private static void printNameCharacters(String name) {
		for(int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
		}
		
	}
	
	private static void printFullName(String name, String lastName) {
		System.out.println(name + " " + lastName);
	}

}