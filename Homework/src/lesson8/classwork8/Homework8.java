package lesson8.classwork8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework8 {
    public static void main(String[] args) throws IOException {
        System.out.println("-----Task 1 -----");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a five-word sentence:>");
        String sentence1 = reader.readLine();

        String[] arrWords = sentence1.split(" ");

        int maxIndex = 0;
        for (int i = 1; i < arrWords.length; i++) {
            if (arrWords[i].length() > arrWords[maxIndex].length()) {
                maxIndex = i;
            }
        }

        System.out.println("The longest word in the sentence is " + arrWords[maxIndex]);
        System.out.println("The length of the longest word is " + arrWords[maxIndex].length());

        StringBuilder sb = new StringBuilder(arrWords[1]);
        System.out.println("The second word in reverse order is " + sb.reverse());


        System.out.println("\n-----Task2-----");
        String sentence2 = "I    am      learning     Java   Core";
        String[] arr = sentence2.split(" ");
        for (String s : arr) {
            if (!s.isEmpty())
                System.out.print(s + " ");
        }


        System.out.println("\n-----Task3-----");
        System.out.println("Enter the text from the console that contains several occurrences of US currency:>");
        String sentence3 = reader.readLine();
        //example = "I have bought a car for $12000.50. If I had $3000.75 more I‘d buy a better car.";

        String pattern = "\\$(\\d*)(\\.\\d{2})?";
        Pattern p = Pattern.compile(pattern);
        Matcher m  = p.matcher(sentence3);
        while (m.find()){
            System.out.println(sentence3.substring(m.start(), m.end()));
        }
    }
}

