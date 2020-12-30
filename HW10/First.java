
public class First implements Runnable{
	private int pause;
	private String s;
	public First(int pause, String s) {
		this.pause = pause * 1000;
		this.s = s;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
	         try { Thread.sleep(pause); } catch (InterruptedException e) {}
	         System.out.println(s);
		}
	
	}
}
