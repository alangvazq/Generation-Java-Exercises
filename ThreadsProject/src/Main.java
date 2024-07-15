import java.util.Random;

public class Main {

	public static void main(String[] args) {
		CicloThread t1 = new CicloThread("",15);
		CicloThread t2 = new CicloThread("",10);
		CicloThread t3 = new CicloThread("",20);
		CicloThread t4 = new CicloThread("",5);
		
		t1.start(); t2.start(); t3.start(); t4.start();
	}//main

}// class Main

class CicloThread extends Thread{
	private int max;
	private Random random;
	
	public CicloThread(String name, int max) {
		this.max = max;
		this.setName(name);
		random = new Random();
	}
	
	public void run() {
		int cont = 0;
		while(cont < this.max) {
			System.out.println(this.getName()+":"+cont++);
			
			try {
				Thread.sleep(random.nextInt(3000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}// catch
		} //while
		System.out.println("FIN" + this.getName());
	}
}// class CicloThread
