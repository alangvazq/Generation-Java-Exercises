
public class Productor extends Thread{
	
	public Productor(String name) {
		this.setName(name);
	}//constructor
	
	@Override
	public void run() {
		System.out.println("INICIO del productor"+this.getName());
		int cont =0;
		while(cont<Almacen.max) {
			int num = (int) Math.random()*300;
			((Object) Almacen.lista).add(num);
			System.out.println(cont + "Producto" + this.getName() + ""+num+" tamaño: "+Almacen.lista.size());
			
			
			Thread.sleep(num);

			
	}

}//class productor
