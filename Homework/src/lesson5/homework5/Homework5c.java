package lesson5.homework5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework5c {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 5 integer numbers:>");
        int [] numbers = new int[5];

        int n;
        for (int i = 0; i < numbers.length; i++) {
            if((n = Integer.parseInt(reader.readLine())) < 0) {
                System.out.println("You entered negative number");
                break;
            }
            numbers[i] = n;
        }

        findPosition2Positive(numbers);
        findMin(numbers);
        calcProductEven(numbers);

    }

    public static void findPosition2Positive(int[] numbers){
        int countPositive = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > 0){
                countPositive++;
            }
            if(countPositive == 2){
                System.out.println("The position of second positive  number is: " + (i + 1));
                break;
            }
        }
    }

    public static void findMin(int[] numbers){
        int min = numbers[0];
        int indexMin = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < min){
                min = numbers[i];
                indexMin = i;
            }
        }
        System.out.println("The minimum is: " + min + ", its position is: " + (indexMin +1));
    }

    public static void calcProductEven(int[] numbers){
        int multiply = 1;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0){
                multiply *= numbers[i];
            }
        }
        System.out.println("The product of even numbers is: " + multiply);
    }
}
