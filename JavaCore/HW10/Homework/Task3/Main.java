public class Main {
    public static void main(String[] args) {
        Thread thread = new One();
        Thread thread1 = new Three();
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread1.start();
    }
}
