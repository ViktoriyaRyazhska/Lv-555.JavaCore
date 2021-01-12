
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.print("Enter sentence: ");
        input = scanner.nextLine();
        System.out.println(input.replaceAll("\\s+"," ").trim().replaceAll(" am", "'m"));
    }
}