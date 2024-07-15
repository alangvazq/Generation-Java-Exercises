import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Ingresa el número del mes: ");
		int month = in.nextInt();
		String monthString = switch (month) {
		case 1 -> "January";
		case 2 -> "February";
		case 3 -> "March";
		case 4 -> "April";
		case 5 -> "May";
		case 6 -> "June";
		case 7 -> "July";
		case 8 -> "August";
		case 9 -> "September";
		case 10 -> "October";
		case 11 -> "November";
		case 12 -> "December";
		default -> "Número no válido";
		};
		
		System.out.println(monthString);
		in.close();
	}

}
