public class MyThread extends Thread {
    private int num;
    public MyThread(int num) {
    	this.num=num;
    }
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(num);
        }
    }
}