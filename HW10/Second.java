
public class Second implements Runnable {

	@Override
	public void run() {
		Runnable r1 = new Third();
		Thread th1 = new Thread(r1);
		
		System.out.println("Thread number 1");
		
		th1.start();
		
			
	}
	
	

}