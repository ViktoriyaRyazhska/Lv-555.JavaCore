import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) throws IOException {
        System.out.println("What is your name?");
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        String name = br.readLine();
        System.out.println("Where are you live, " + name + "?");
        String place = br.readLine();
        System.out.println("Check info:");
        System.out.println("Your name is " + name + ".");
        System.out.println("You live in " + place + ".");
    }
}
