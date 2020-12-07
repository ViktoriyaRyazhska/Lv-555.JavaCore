package lesson4.homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//read 3 float numbers and check: are they all belong to the range [-5,5]

public class Homework4a {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter float number: ");
        float f;

        for (int i = 0; i < 3; i++) {
            f = Float.parseFloat(reader.readLine());
            if (-5.0 <= f && f <= 5.0) {
                System.out.println("Value is belong to the range [-5,5]");
            } else {
                System.out.println("Value out of the range [-5,5]");
            }
        }
    }
}
