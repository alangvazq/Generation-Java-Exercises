import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> autos = new HashSet<String>();
		
		// retorna true si se agrega, false si no
		System.out.println(autos.add("Volvo")); // true
		System.out.println(autos.add("BMW")); // true
		System.out.println(autos.add("VW")); // true
		System.out.println(autos.add("Ford")); // true
		System.out.println(autos.add("Audi")); // true
		System.out.println(autos.add("BMW")); // false
		
		System.out.println("BMW".hashCode()); // 65900
		
		System.out.println(autos.size());// 5
		
		System.out.println(autos.contains("Audi")); // true
		
		System.out.println("====================");
		
		for (String string : autos) {
			System.out.println(string);
		}
		
		System.out.println("====================");
		
		autos.forEach((auto)->mostrarAutos(auto));
		
		
		autos.clear();
		System.out.println(autos.isEmpty()); // true
	} // main

	private static void mostrarAutos(String auto) {
		System.out.println("+-------------------");
		System.out.println("| " + auto);		
		System.out.println("+-------------------");
	}

}
