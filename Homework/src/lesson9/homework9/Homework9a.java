package lesson9.homework9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework9a {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double a = 0.0, b = 0.0;

        try {
            System.out.print("Enter number a:> ");
            a = Double.parseDouble(reader.readLine());
            System.out.print("Enter number b:> ");
            b = Double.parseDouble(reader.readLine());
            System.out.println("The result of division is " + div(a, b));
        } catch (NumberFormatException e) {
            System.out.println("You've entered non-double numbers");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static double div(double a, double b) throws Exception {
        if (b == 0.0) {
            throw new Exception("You've entered 0.0. Infinity occurred!");
        }
        return a / b;
    }
}
