package HW9;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ForthTask {
    public static void main(String[] args) throws IOException {
        String max = " ";
        ArrayList<String> text = new ArrayList<>();
        text.add("My name is Taras, I was born on the 15.10.1997\n" +
                "I graduated from National Aviation University\n" +
                "I've worked in the Logistic Company for 2 years\n" +
                "and I realized I wanted to reach something more\n" +
                "that's why I'm where I'm");
        String fileName = "file1.txt";
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(String.valueOf(text));
        bw.close();

        List<String> str = new ArrayList<>();

        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String s = " ";
        int count = 0;
        while ((s = br.readLine()) != null) {
            str.add(s);
            count++;
        }
        br.close();
        max = Collections.min(str);
        String lines = "Number of lines: " + count;

        List<String> next = new ArrayList<>();
        next.add(lines + "\n" + max + "\n" + str.get(0));
        System.out.println();
        String fileName2 = "file2.txt";
        FileWriter fw2 = new FileWriter(fileName2);
        BufferedWriter bw2 = new BufferedWriter(fw2);
        bw2.write(String.valueOf(next));
        bw2.close();

        List<String> file2Readed = new ArrayList<>();

        FileReader fr2 = new FileReader(fileName2);
        BufferedReader br2 = new BufferedReader(fr2);
        while ((s = br2.readLine()) != null) {
            file2Readed.add(s);
        }
        br2.close();
        System.out.println(file2Readed);
    }
}
