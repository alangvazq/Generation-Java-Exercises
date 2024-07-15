import java.util.Scanner;

public class Errores2 {

	public static void main(String[] args) {
		System.out.println("Escribir un número del 1 al 10:");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int cont = 0;
		while (cont < num) {
			System.out.println(num);
			//cont++;
		} // while
		in.close();
	}// main
}// class Errores2
