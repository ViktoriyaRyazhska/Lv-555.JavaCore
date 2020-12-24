public class runAB implements Runnable {
	private int interval;
	private String text;
	
   public runAB(int interval, String text) {
		this.interval = interval;
		this.text = text;
	}
@Override
   public void run() {
	   for (int i = 0; i < 5; i++) {
		   string(interval,text);
	}
   }
   private void string(int a, String b) {
	   System.out.println(b);
	   try {
		Thread.sleep(a*1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
   }
}
