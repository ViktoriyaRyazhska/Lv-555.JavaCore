package Homework1;

import java.util.Scanner;

public class Homework12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey!What's your name?");
        String name = scanner.nextLine();
        System.out.printf("Ok,Where are you live, %s ?\n", name);
        String address = scanner.nextLine();
        System.out.printf("Your name is: %s \nYour living address is: %s", name,address);
    }
}
