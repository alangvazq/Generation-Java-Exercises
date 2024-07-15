
public class Calculadora {

	public static void main(String[] args) {
		Calculadora cal = new Calculadora();
		int res = cal.sum(8, 50);
		System.out.println(res);
		
		System.out.println(cal.sum(8.12, 50.55));
		
		res = cal.sum(8, 50, 100);
		System.out.println(res);

		// No se puede acceder
		// int mul = multiplica(5,2);

		res = cal.multiplica(10, 100);
		System.out.println(res);
		
		res = cal.resta(2100, 1345);
		System.out.println(res);
		

	}// main
	
	public double sum(double a, double b) {
		double c = a + b;
		return c;
	}// sum

	public int sum(int a, int b) {
		int c = a + b;
		return c;
	}// sum
	
	public int sum(int a, int b, int c) {
		int d = a + b + c;
		return d;
	}// sum

	public int multiplica(int a, int b) {
		return a * b;
	}// multiplica

	public int resta(int x, int y) {
		return x - y;
	}// resta
}
