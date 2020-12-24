package PW9;

public class Task2 {
    public static void main(String[] args) {
    MyThread1 t1 = new MyThread1();
    MyThread2 t2 = new MyThread2();
    t1.run();
    t2.run();
        Thread.yield();
        System.out.println("My name is Taras");
    }
}

class MyThread1 extends Thread {
    public void run() {
        synchronized (Task2.class){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello, World");
            try {
                sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    }
}
class MyThread2 extends Thread {
    public void run() {
        synchronized (Task2.class) {
            for (int i = 0; i < 5; i++) {
                System.out.println("Peace in the peace");
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}