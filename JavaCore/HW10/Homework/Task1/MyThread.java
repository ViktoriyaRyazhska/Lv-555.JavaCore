public class MyThread extends Thread{
    private String value;
    private int pause;
    public MyThread(String value, int pause){
        this.value = value;
        this.pause = pause;
    }
    public void run(){
        for (int i = 0; i < 5; i++) {
            try {
                sleep(pause);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(value);
        }
    }

}
