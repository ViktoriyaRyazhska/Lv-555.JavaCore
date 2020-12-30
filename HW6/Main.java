package zero;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 words");

        String line = sc.nextLine();
        String[] words = line.split("[ ]");

        System.out.println("The longest world: " + longestword(words));
        System.out.println("The number of letters in the longest word: " + longestword(words).length());
        System.out.println(reverseWord(words, 2));

    }

    public static String longestword (String s[]){
        String longWord = "";
        for (int i=0; i < s.length; i++){
            if(longWord.length() < s[i].length()){
                longWord = s[i];
            }
        }
        return longWord;
    }

    public static String reverseWord (String s[] , int number){

        return new StringBuilder(s[number-1]).reverse().toString();

    }
}
