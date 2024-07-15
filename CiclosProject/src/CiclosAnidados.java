
public class CiclosAnidados {

	public static void main(String[] args) {

		String ast;
		String unidad = "*";
		for (int i = 0; i <= 5; i++) {
			ast = "";
			for (int j = 0; j <= i; j++) {
				ast += unidad;
			}
			System.out.println(ast);
		}

		System.out.println("=================");

		String aste;
		String unidad2 = "*";

		for (int i = 6; i > 0; i--) {
			aste = "";
			for (int j = 0; j < i; j++) {
				aste += unidad2;
			}
			System.out.println(aste);
		}
	}
}
