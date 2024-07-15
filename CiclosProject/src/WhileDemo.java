
public class WhileDemo {

	public static void main(String[] args) {
		// Scanner in = new Scanner(System.in);
		int cont = 0;
		while ( cont < 10) {
			System.out.println(cont);
			cont++;
		}
		
		System.out.println("===========================");
		cont = 0;
		while (cont < 10) {
			if (cont == 8) {
				break;
			}
			System.out.println(cont);
			cont++;
		}
		
		System.out.println("===========================");
		cont = 0;
		while (cont < 10) {
			if (cont == 8) {
				cont++;
				continue;
			}
			
			System.out.println(cont);
			cont++;
		}
		System.out.println("===========================");
	}
		
}
