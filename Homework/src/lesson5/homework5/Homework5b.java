package lesson5.homework5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework5b {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 10 integer numbers:>");
        int [] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        calcSumFirst5Positive(numbers);
        calcProductLast5(numbers);
    }

    public static void calcSumFirst5Positive(int[] numbers){
        int sum = 0;
        int countPositive = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > 0){
                sum += numbers[i];
                countPositive++;
            }
            if(countPositive == 5){
                break;
            }
        }
        System.out.println("The sum of the first 5 positive numbers is: " + sum);
    }

    public static void calcProductLast5(int[] numbers){
        int multiply = 1;
        for (int i = numbers.length-1; i >= 5; i--){
            multiply *= numbers[i];
        }
        System.out.println("The product of last 5 elements is :" + multiply);
    }
}
