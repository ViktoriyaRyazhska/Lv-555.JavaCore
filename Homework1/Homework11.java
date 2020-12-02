package Homework1;

import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Specify the radius: ");
        double r = scanner.nextDouble();
        double area = Math.PI * Math.pow(r,2);
        double per = 2 * Math.PI * r;
        System.out.printf("Flower bed's area is %f , perimeter is %f ", area, per);
    }
}
