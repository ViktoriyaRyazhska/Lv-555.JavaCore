package testing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.lang.String;

public class Main {

    public static void main(String[] args) throws IOException {
        Employee p1 = new Employee();
        p1.setName("Igor");
        p1.setRate(100);
        p1.setHours(24);

        Employee p2 = new Employee("Tetiana", 100, 100);
        Employee p3 = new Employee("Ostap", 57, 24);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println("\nTotal Compensation: " + Employee.totalSum);
        p1.changeRate(150);
        System.out.println("\nTotal Compensation: " + Employee.totalSum);
    }
}


