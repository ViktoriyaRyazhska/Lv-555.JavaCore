package lesson10.homework10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Homework10d {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String fileNameToRead = "src\\file1.txt";
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(fileNameToRead);
            br = new BufferedReader(fr);
            String s = null;

            while ((s = br.readLine()) != null){
                list.add(s);
            }
            br.close();

        }catch (Exception e){
            e.printStackTrace();
        }

        String s1 = "Number of lines is " + list.size() + "\n";
        String max  = list.get(0);
        for(String s: list){
            if(s.length() > max.length()){
                max = s;
            }
        }
        String s2 = "The longest line is " + max + "\n";
        String s3 = "My name is Maya. My birthday is the 5th of May, 1983";


        String fileNameToWrite = "src\\file2.txt";
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(fileNameToWrite);
            bw = new BufferedWriter(fw);
            bw.write(s1 + s2 + s3);

            bw.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
