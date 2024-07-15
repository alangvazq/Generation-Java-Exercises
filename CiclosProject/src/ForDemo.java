
public class ForDemo {

	public static void main(String[] args) {
		// Scanner in = new Scanner(System.in);

		for (int cont = 0; cont < 10; cont++) {
			System.out.println(cont);
		}
		
		System.out.println("===========================");
		for (int cont = 0; cont < 10; cont++) {
			if (cont == 8) {
				break;
			}
			System.out.println(cont);
		}
		System.out.println("===========================");
		for (int cont = 0; cont < 10; cont++) {
			if (cont == 8) {
				continue;
			}
			System.out.println(cont);
		}
	}

}
