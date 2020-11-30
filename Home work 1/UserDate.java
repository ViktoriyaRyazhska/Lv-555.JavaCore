import java.util.Scanner;

public class UserDate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name, address;
        System.out.println("What is your name?");
        name = in.nextLine();
        System.out.println("Where are you live, " + name + " ?");
        address = in.nextLine();
        System.out.println("Name - " + name);
        System.out.println("Address - " + address);
    }
}
