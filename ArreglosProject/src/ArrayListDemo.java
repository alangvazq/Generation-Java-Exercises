import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(35);
		numeros.add(33);
		numeros.add(44);
		numeros.add(10);
		numeros.add(14);
		numeros.add(19);
		numeros.add(27);
		numeros.add(44);
		numeros.add(26);
		numeros.add(31);
		
		System.out.println(numeros.size());
		
		System.out.println(numeros.get(5));
		
		// numeros.clear(); //Elimina todos los elementos de la lista
		
		System.out.println(numeros.size()); // 0 // 10
		System.out.println(numeros.isEmpty()); // true // false
		// ======================= //
		
		System.out.println(numeros.indexOf(44)); // 2
		System.out.println(numeros.lastIndexOf(44)); // 7
		
		System.out.println(numeros.indexOf(1400)); // -1
		System.out.println(numeros.contains(44)); // true
		System.out.println(numeros.remove(8));
		
		System.out.println(numeros.set(0, 7)); // 35 retorna el valor anterior
		
		//for (Integer integer : numeros) {
		//	System.out.println(integer);
		//}
		
		numeros.forEach((num)-> imprimirParesImpares(num));

	}

	private static void imprimirParesImpares(Integer num) {
		if (num%2==0) {
			System.out.println(num + " es par");
		} else {
			System.out.println(num + " es impar");
		}
	}

}
