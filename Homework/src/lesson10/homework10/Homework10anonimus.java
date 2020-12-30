package lesson10.homework10;

public class Homework10anonimus {

    // the second variant of task 10b
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

    public static void main(String[] args) {
        createAndRunThread(() -> createAndRunThread(() -> {
            printThreadMessage("Thread number two", 3);
            createAndRunThread(() -> printThreadMessage("Thread number three", 5));
        }));
    }
}
