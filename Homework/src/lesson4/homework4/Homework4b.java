package lesson4.homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//read 3 integer numbers and write max and min of them

public class Homework4b {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter three numbers: ");

        int a  = Integer.parseInt(reader.readLine());
        int b  = Integer.parseInt(reader.readLine());
        int c  = Integer.parseInt(reader.readLine());

        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);

        System.out.println("The maximum is " + max);
        System.out.println("The minimum is " + min);
  }
}
