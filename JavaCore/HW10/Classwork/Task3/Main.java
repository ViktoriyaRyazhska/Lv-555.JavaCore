import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        File fr = new File("src\\mytext.txt");
        FileReader fileReader;
        BufferedReader bufferedReader;
        try {
            fileReader = new FileReader(fr);
            bufferedReader = new BufferedReader(fileReader);
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                System.out.println(s.length() + " " + s);
                list.add(s);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        longestLine(list);
        shortestLine(list);
        findLineByValue(list, "Львів");
    }

    public static void longestLine(List<String> list) {
        String max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (max.length() < list.get(i).length()) {
                max = list.get(i);
            }
        }
        System.out.println("Longest sentence " + max);

    }public static void shortestLine(List<String> list){
        String min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if(min.length() > list.get(i).length()){
                min = list.get(i);
            }
        }
        System.out.println("Shortest sentence: " + min);
    }public static void findLineByValue(List<String> list, String value){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).contains(value)){
                System.out.println("Line which contains " + value + " : " + list.get(i));
            }
        }
    }
}









