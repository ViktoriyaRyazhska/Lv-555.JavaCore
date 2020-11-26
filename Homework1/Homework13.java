package Homework1;

import java.util.Scanner;

public class Homework13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the price of phone call in country 1?");
        double c1 = scanner.nextDouble();
        System.out.println("What was the  duration of first telephone call?");
        double t1 = scanner.nextDouble();
        System.out.println("What is the price of phone call in country 2?");
        double c2 = scanner.nextDouble();
        System.out.println("What was the  duration of second telephone call?");
        double t2 = scanner.nextDouble();
        System.out.println("What is the price of phone call in country 3?");
        double c3 = scanner.nextDouble();
        System.out.println("What was the third duration of telephone call?");
        double t3 = scanner.nextDouble();
        double p1 = c1*t1;
        System.out.println("The price for call in country 1 was " + p1 + "units");
        double p2 = c2*t2;
        System.out.println("The price for call in country 2 was " + p2 + "units");
        double p3 = c3*t3;
        System.out.println("The price for call in country 3 was " + p3 + "units");
        double sum = p1+p2+p3;
        System.out.println("Total price for all conversations vas: " + sum);
    }
}
