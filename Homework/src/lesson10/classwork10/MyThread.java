package lesson10.classwork10;

public class MyThread extends Thread{
    private long pause;
    private String text;

    public MyThread(int pause, String text) {
        this.pause = pause;
        this.text = text;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try{
                sleep(pause);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
            System.out.println(text);
        }
    }
}
