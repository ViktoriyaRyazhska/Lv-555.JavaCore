public class Example {
	public final static Object first = new Object();
	public final static Object second = new Object();

	public static void main(String... var) throws InterruptedException
	{
		Thread t1 = new MyThread(1);
        Thread t2 = new MyThread(2);
        Thread t3 = new MyThread(3);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        t3.start();
		Thread t4 = new Thread() {
			public void run() {
				synchronized (first) {
					Thread.yield();
					synchronized (second) {
						System.out.println("Success!");
					}
				}
			}
		};
		Thread t5 = new Thread() {
			public void run() {
				synchronized (second) {
					Thread.yield();
					synchronized (first) {
						System.out.println("Success!");
					}
				}
			}
		};
		t4.start();
		t5.start();
		Thread t6 = new MyThread2();
		t6.start();
	}
}