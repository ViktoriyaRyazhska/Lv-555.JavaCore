public class MyThread2 extends Thread {
    public void run() {
    	for (int i = 0; i < 3; i++) {
			System.out.println("Thread number two");
		}
    	Thread t3 = new MyThread3();
        t3.start();
    }
}