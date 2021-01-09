public class Homework1 {
    public static void main(String[] args) {
    Homework1 o = new Homework1();
        try {
            o.outputMessages();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void outputMessages() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hello from thread 111");
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hello from thread 222");
                }
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hello from thread 333");
                }
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        thread3.start();
    }
}

