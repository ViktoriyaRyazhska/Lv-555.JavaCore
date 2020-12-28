public class One extends Thread{

    @Override
    public void run() {
        Thread thread = new Two();
        thread.start();
    }
}
