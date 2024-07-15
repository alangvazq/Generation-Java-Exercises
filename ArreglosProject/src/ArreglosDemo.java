
public class ArreglosDemo {

	public static void main(String[] args) {
		String[] months = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Nombiembre","Diciembre"};

		//for (int i = 0; i < months.length; i++) {
		//	System.out.println(months[i]);
		//}
		
		for (String string : months) {
			System.out.println(string);
			if(string == "Abril") {
				break;
			}
		}
	}

}
