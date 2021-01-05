package HW9;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();

        t2.start();
        t3.start();
        t2.join();
        t3.join();
        t1.join();
        t1.start();
    }

    static class Thread1 extends Thread {
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("1st thread");
            }

        }
    }

    static class Thread2 extends Thread {
        public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("2st thread");
                }
        }
    }

        static class Thread3 extends Thread {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("3st thread");
                }

            }
        }
    }
