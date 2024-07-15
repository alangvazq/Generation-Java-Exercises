
public class TiposPrimitivos {

	public static void main(String[] args) {
		// -128 a 127
		// Formas de declarar variables
		byte edad = 127, edad2;
		short suma, resta;
		suma = 80 + 80;
		edad = 21;
		edad2 = 100;
		resta = 1000;
		int min = 18;
		System.out.println(edad);
		System.out.println(edad2);
		System.out.println(suma);
		System.out.println(resta);

		char inicial = 'X';
		boolean flag = true; // false

		edad = (byte) suma;
		System.out.println(edad);
		
		edad = (byte)min;
		System.out.println(edad);
	}

}
