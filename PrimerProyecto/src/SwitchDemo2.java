import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Ingresa el número del mes: ");
		int month = in.nextInt();

		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println("31");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30");
			break;
		case 2:
			System.out.println("28/29");
			break;
		default:
			System.out.println("No es un mes válido");
			break;
		}
		in.close();
	}
}
