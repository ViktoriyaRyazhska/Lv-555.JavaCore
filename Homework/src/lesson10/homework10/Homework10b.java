package lesson10.homework10;

public class Homework10b {
    public static void main(String[] args) throws InterruptedException {
        Object sharedResource = new Object();
        Thread t;
        System.out.println("main: awaiting resource ...");
        synchronized (sharedResource){
            System.out.println("main: resource locked");
            t = new Thread() {
                @Override
                public void run() {
                    System.out.println("thread: awaiting resource...");
                    synchronized (sharedResource) {
                        System.out.println("thread: resource locked");
                    }
                    System.out.println("thread: unlocked resource, exiting");
                }
            };
            // Run the thread
            System.out.println("main: running thread...");
            t.start();

            // Wait for the thread to finish
            System.out.println("main: awaiting thread for 5 seconds...");
            t.join(5000); // The thread is awaiting for the resource, thus never finishes here
            System.out.println("main: wait expired - DEADLOCK !!!");
        }
        System.out.println("main: unlock resource to solve deadlock");
        // Here resource is unlocked, awaiting for the thread to finish
        System.out.println("main: awaiting thread");
        t.join();
        System.out.println("main: done");
    };
}