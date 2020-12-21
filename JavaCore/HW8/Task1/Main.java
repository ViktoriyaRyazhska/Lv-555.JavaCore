import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        String longestWord = " ";
        String[] strings;
        String fiveWordsSentence;

        System.out.print("Enter sentence of 5 words: ");
        fiveWordsSentence = scanner.nextLine();
        strings = fiveWordsSentence.split("[ ,]+");

        //перевірка на кількість слів
        //Ну так, бавився
        while (strings.length > 5) {
            System.out.println("No more than 5 words!");
            System.out.println("Try again.");
            fiveWordsSentence = scanner.nextLine();
            strings = fiveWordsSentence.split("[ ,]+");
            count++;

            //вийти якщо користувач введе більше 5 раз неправильно
            //Тут теж трошки бавився
            if (count > 4) {
                System.out.println("Are you kidding me? Ok. I`m done! Bye!");
                break;
            }
        }
        //пошук найдовшого слова
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() > longestWord.length()) {
                longestWord = strings[i];
            }
        }
        System.out.println("Longest word: " + longestWord);
        System.out.println("The number of letters in the longest word: " + longestWord.length());
        System.out.println("Reverse word: " + reverseString(strings[1]));

    }

    public static String reverseString(String string) {
        return new StringBuilder(string).reverse().toString();
    }

}