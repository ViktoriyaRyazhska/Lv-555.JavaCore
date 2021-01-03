package lesson11.homework11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework11 {
    public static void main(String[] args) {

        System.out.println("----Task1----");
        List<String> list1 = new ArrayList<>(Arrays.asList("hello", "I", "am", "studying", "Java"));
        List<String> list2 = new ArrayList<>(list1);
        list2.removeIf(s -> (s.length() >= 5));
        list2.forEach(System.out::println);

        System.out.println("\n----Task2----");
        String codedString = encrypt("ZOO", 3);
        System.out.println("The result of coding is " + codedString);
        String decodedString = decrypt(codedString, 3);
        System.out.println("The result of decoding is " + decodedString);

        System.out.println("\n----Task3----");
        checkDateForValidity("the 13th of May, 1983"); //invalid - wrong format
        checkDateForValidity("05.13.83"); // valid
        checkDateForValidity("22.33.99"); // invalid - wrong month and day
        checkDateForValidity("02.29.20"); // valid - 2020 is a leap year
        checkDateForValidity("02.29.19"); // valid !!! - will be converted into 28 Feb 2019
    }

    private static String encrypt(String s, int n){
        StringBuilder strBuilder = new StringBuilder();
        char c;
        for (int i = 0; i < s.length(); i++)
        {
            c = s.charAt(i);
            if (Character.isLetter(c))
            {
                c = (char) (s.charAt(i) - n);
                if ((Character.isLowerCase(s.charAt(i)) && c > 'z')
                        || (Character.isUpperCase(s.charAt(i)) && c > 'Z')) {
                    c = (char) (s.charAt(i) - (26 - n));
                }
            }
            strBuilder.append(c);
        }
        return strBuilder.toString();
    }

    public static String decrypt(String s, int n){
        StringBuilder strBuilder = new StringBuilder();
        char c;
        for (int i = 0; i < s.length(); i++)
        {
            c = s.charAt(i);
            if (Character.isLetter(c))
            {
                c = (char) (s.charAt(i) + n);
                if ((Character.isLowerCase(s.charAt(i)) && c > 'z')
                        || (Character.isUpperCase(s.charAt(i)) && c > 'Z')) {
                    c = (char) (s.charAt(i) - (26 - n));
                }
            }
            strBuilder.append(c);
        }
        return strBuilder.toString();
    }

    public static boolean checkDateForValidity(String date){
        try {
            LocalDate d =
                    LocalDate.parse(date, DateTimeFormatter.ofPattern("MM.dd.yy"));
            System.out.println(date + " is a valid date corresponding to " + d.format(DateTimeFormatter.ofPattern("d LLL y")));
        } catch (DateTimeParseException e){
            System.out.println(date + " is an invalid date string: " + e.getMessage());
            return false;
        }
        return true;
    }
}

