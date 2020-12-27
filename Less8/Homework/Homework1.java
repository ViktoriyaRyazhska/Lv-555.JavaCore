import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> splitted = new ArrayList<>(splitedStrings(scanner));
        System.out.println(longest(splitted));
        System.out.println(longest(splitted).length());
//        System.out.println(stringLength(longest(splitedStrings(scanner))));
        System.out.println(secondReverse(splitted));
    }

    public static List<String> splitedStrings(Scanner scanner) {
        System.out.println("Enter five words here: ");
        String fivewords = scanner.nextLine();
        List<String> splited = Arrays.asList(fivewords.split(" "));
        return splited;
    }

    public static String longest(List<String> strings) {
        String longest = strings.get(0);
        for (String string : strings) {
            if (string.length() > longest.length())
                longest = string;
        }
        return longest;
    }
//    public static int stringLength(String string) {
//        int lenght = string.length();
//        return lenght;
//}
    public static String secondReverse(List<String> string) {
           String secondReverse = string.get(string.size()-2);
        return secondReverse;
    }
}
