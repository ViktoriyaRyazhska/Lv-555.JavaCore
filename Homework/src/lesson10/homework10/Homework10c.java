package lesson10.homework10;

public class Homework10c {

    public static void main(String[] args) {
        createAndRunThread(new One());
    }

    private static void createAndRunThread(Runnable run) {
        Thread t = new Thread(run);
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void printThreadMessage(String message, int numTimes) {
        for (int i = 0; i < numTimes; i++) {
            System.out.println(message);
        }
    }

    public static class One implements Runnable {
        @Override
        public void run() {
            createAndRunThread(new Two());
        }
    }

    public static class Two implements Runnable {
        @Override
        public void run() {
            printThreadMessage("Thread number two", 3);
            createAndRunThread(new Three());
        }
    }

    public static class Three implements Runnable {
        @Override
        public void run() {
            printThreadMessage("Thread number three", 5);
        }
    }
}



