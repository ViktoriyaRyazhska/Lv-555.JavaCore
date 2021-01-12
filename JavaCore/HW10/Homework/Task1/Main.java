public class Main {
    public static void main(String[] args){
        Thread runnable1 = new MyThread("Text1",1000);
        Thread runnable2 = new MyThread("Text2",2000);
        Thread runnable3 = new MyThread("Text3",1000);
        runnable1.start();
        runnable2.start();
        try {
            runnable1.join();
            runnable2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        runnable3.start();
    }
}









