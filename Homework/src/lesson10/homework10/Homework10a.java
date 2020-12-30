package lesson10.homework10;

public class Homework10a {
    public static void main(String[] args) throws InterruptedException {
            Thread t1 = new MyThread("Hello!");
            Thread t2 = new MyThread("Bonjour!");
            Thread t3 = new MyThread("Hola!");

            t1.start();
            t2.start();
            t1.join();
            t2.join();
            t3.start();
    }

    public static class MyThread extends Thread{
        private String text;

        public MyThread( String text) {
            this.text = text;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
               System.out.println(text);
            }
        }
    }
}
