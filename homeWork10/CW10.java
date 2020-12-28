package firstPac;

//import java.io.*;
//import java.util.*;

public class CW10 {

	public static void main(String[] args) throws Exception {
		
		
		
		//TASK 1
		for(int i = 0; i < 10; i++) {
            System.out.println("I study Java");
            Thread.sleep(1000);
        }

		//TASK 2
		Thread t1 = new MyThread("Hello, world", 2000);
        Thread t2 = new MyThread("Peace in the peace", 3000);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("My name is...");
		
		//TASK 3


		
		
		
		
		

        
        
		
	}
}

//TO TASK 2
class MyThread extends Thread {
    private String name;
    private int delay;
    public MyThread(String name, int delay) {
        this.name = name;
        this.delay = delay;
    }
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name);
        }
    }
}

