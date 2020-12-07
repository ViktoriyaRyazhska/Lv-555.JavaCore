package lesson5.classwork5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Classwork5 {
    public static void main(String[] args) throws IOException {
        int [] numbers = {-9, 2, 50, -25, 5, 13, 0, 99, -50};

        findBiggestNumber(numbers);
        calcSumPositive(numbers);
        countNegative(numbers);

        Employee [] workers = new Employee[5];
        workers[0] = new Employee("Petrov", 2, 1000);
        workers[1] = new Employee("Sidorov", 5, 2000);
        workers[2] = new Employee("Ivanov", 2, 2500);
        workers[3] = new Employee("Korolov", 1, 3500);
        workers[4] = new Employee("Tuzov", 2, 5500);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter department number:");
        int numDept = Integer.parseInt(reader.readLine());
        for (int i = 0; i < workers.length; i++) {
            if(workers[i].getDepartment() == numDept){
                System.out.println(workers[i].getName());
            }
        }

        //arrange workers by the field salary in descending order
        int tmp;
        for (int i = 0; i < workers.length - 1; i++) {
            for (int j = i + 1; j < workers.length; j++) {
                if (workers[i].getSalary() < workers[j].getSalary()) {
                    tmp = workers[i].getSalary();
                    workers[i].setSalary(workers[j].getSalary());
                    workers[j].setSalary(tmp);
                }
            }
            System.out.println(workers[i]);
        }
        //System.out.println(Arrays.toString(workers));
    }

    public static void findBiggestNumber(int [] numbers){
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("Maximum is: " + max);
    }

    public static void calcSumPositive(int [] numbers){
        int sumPositive = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > 0) {
                sumPositive += numbers[i];
            }
        }
        System.out.println("Sum of positive numbers = " + sumPositive);
    }

    public static void countNegative(int [] numbers){
        int amountNegative = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < 0){
                amountNegative++;
            }
        }
        System.out.println("Amount of negative numbers" + amountNegative);
    }
}
