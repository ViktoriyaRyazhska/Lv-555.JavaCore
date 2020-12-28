package lesson9.classwork9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class classwork9a {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0, b = 0;
        try {
            System.out.println("Enter number a:");
            a = Integer.parseInt(reader.readLine());
            System.out.println("Enter number b:");
            b = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("You've entered non-numeric value");
        }

        try {
            calcRectangleArea(a, b);
        } catch (InvalidRectangleException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void calcRectangleArea(int a, int b) throws InvalidRectangleException {
        if (a <= 0 || b <= 0) {
            throw new InvalidRectangleException("Rectangle's side must be greater than zero.");
        }
        System.out.println(a * b);
    }
}
