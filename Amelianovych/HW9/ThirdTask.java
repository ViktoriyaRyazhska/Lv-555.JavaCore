package HW9;

public class ThirdTask {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        thread1.start();
    }

    static class Thread1 extends Thread {
        public void run() {
            Thread2 thread2 = new Thread2();
            thread2.start();
        }
    }

    static class Thread2 extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("I'm a thread #2");
            }
            Thread3 thread3 = new Thread3();
            thread3.start();
        }
    }

    static class Thread3 extends Thread {
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("I'm a thread #3");
            }
        }
    }
}
