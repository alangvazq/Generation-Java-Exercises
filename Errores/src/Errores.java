
public class Errores {

	public static void main(String[] args) {
		int[] numeros = { 2, 4, 6, 8 };

		try {
			for (int i = 0; i <= numeros.length; i++) {
				System.out.println(numeros[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Se intentó acceder a un índice incorrecto");
			e.printStackTrace();
		}
		System.out.println(numeros.length);
		System.out.println("Prueba Errores en tiempo de ejecución");
	}
}
