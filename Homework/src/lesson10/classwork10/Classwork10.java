package lesson10.classwork10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Classwork10 {
    public static void main(String[] args) throws InterruptedException {

        // Task 1
        for (int i = 0; i < 10; i++) {
           System.out.println("I study Java");
           Thread.sleep(1000);
        }

        //Task2
        Thread t1 = new MyThread(2000, "Hello, world!");
        Thread t2 = new MyThread(3000, "Peace in the peace!");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("My name is Maya");

        //Task3
        ArrayList<String> list = new ArrayList<>();
        String fileName = "src\\myPoem.txt";
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);
            String s = null;

            while ((s = br.readLine()) != null){
                list.add(s);
            }
            br.close();

        }catch (Exception e){
            e.printStackTrace();
        }

        //count and write the number of symbols in every line
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Line " + (i+1) + " contains symbols: " + list.get(i).length());
        }

        //find the longest and the shortest line(string).
        int i = 0;
        int length = 0;
        String min = list.get(0);
        String max = list.get(0);
        for (String s: list) {
            length = s.length();
            if(length > max.length()){
                max = s;
            }

            if(length < min.length()){
                min = s;
            }
        }
        System.out.println("The longest line is " + max);
        System.out.println("The shortest line is " + min);

        //find and write only that lines, which consist of word «var»
        for (String s: list){
            if(s.contains("var")){
                System.out.println("The line, which contains VAR : " + s);
            }
        }
    }
}
