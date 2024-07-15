import java.util.Scanner;

public class CommissionCalculator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Ingresa número: ");
		float sales = in.nextFloat();
		float commision;
		
		if (sales > 9999) {
			commision = (sales * (float) 0.3);
		} else if (sales > 5001 && sales < 9999) {
			commision = (sales * (float) 0.2);
		} else if (sales > 1001 && sales < 4999) {
			commision = (sales * (float) 0.1);
		} else {
			commision = 0;
		}
		
		System.out.println(commision);
		in.close();
	}
}
