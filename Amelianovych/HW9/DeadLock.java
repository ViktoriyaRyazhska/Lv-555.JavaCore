package HW9;

public class DeadLock {
    public static String s1 = "Dead";
    public static String s2 = "Lock";

    static class Dead extends Thread {
        @Override
        public void run() {
            synchronized (s1) {
                System.out.println(s1);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
                synchronized (s2) {
                }
            }
        }
    }

    static class Lock extends Thread {
        @Override
        public void run() {
            System.out.println(s2);
            synchronized (s2) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (s1) {
                }
            }
        }
    }

    public static void main(String[] args) {
        Dead dead = new Dead();
        Lock lock = new Lock();
        dead.start();
        lock.start();
    }
}