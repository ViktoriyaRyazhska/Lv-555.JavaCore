import java.util.Scanner;

public class HomeWork7_1 {
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
        String lWord = "";
        for (int i=0; i < s.length; i++){
            if(lWord.length() < s[i].length()){
                lWord = s[i];
            }
        }
        return lWord;
    }

    public static String reverseWord (String s[] , int number){
               return new StringBuilder(s[number-1]).reverse().toString();
    }

}
