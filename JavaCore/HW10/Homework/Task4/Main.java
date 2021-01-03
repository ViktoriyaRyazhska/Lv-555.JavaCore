import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String originalFile = "src\\file1.txt";
        String endFile = "src\\file2.txt";
        List<String> stringList = new ArrayList<>();
        List<String> myInfo = new ArrayList<>();
        myInfo.add("My name is Andrew");
        myInfo.add("My birthday is 22.12.99");
        FileReader fileReader;
        BufferedReader bufferedReader = null;
        FileWriter fileWriter;
        BufferedWriter bufferedWriter = null;
        try {
            String output;
            fileReader = new FileReader(originalFile);
            bufferedReader = new BufferedReader(fileReader);
            fileWriter = new FileWriter(endFile);
            bufferedWriter = new BufferedWriter(fileWriter);
            while((output = bufferedReader.readLine()) != null){
                stringList.add(output);
            }
            bufferedWriter.write(myInfo + "\n" + "Longest line: " + longestLine(stringList) + "\n" + "Number of lines in file1.txt: " + stringList.size());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static String longestLine(List<String> stringList){
        String max = stringList.get(0);
        for (String string : stringList) {
            if(string.length() > max.length()){
                max = string;
            }
        }return max;
    }
}

