
public class Third implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Thread number 2");
		}
		Runnable r2 = new Fourth();
		Thread th2 = new Thread(r2);
		th2.start();
	}

}
