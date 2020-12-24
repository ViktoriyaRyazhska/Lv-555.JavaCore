package PW9;

public class MyThread extends Thread {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.run();
    }
    String s = "I study Java";
    public void run (){
        for (int i = 0; i < 11; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(s);
        }
    }
}

