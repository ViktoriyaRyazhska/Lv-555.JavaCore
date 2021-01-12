public class Main {
    public final static String s = "You should not see this message";
    public static void main(String[] args){
        Thread t;
        synchronized (s){
            t = new Thread(){
                @Override
                public void run(){
                    synchronized (s){
                    }
                }
            };
            t.start();
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(s);
    }
}

