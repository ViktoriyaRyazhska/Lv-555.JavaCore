package lesson4.classwork4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Classwork4 {

    public static void main(String[] args) throws IOException, InterruptedException {

        //task 1
        System.out.println("\n\t-----Task 1-----");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int countOdd = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter number:");
            if(Integer.parseInt(reader.readLine()) % 2 == 1){
                countOdd++;
            }
        }
        System.out.println("The amount of odd numbers is: " + countOdd);
        Thread.sleep(2000);


        //task 2
        System.out.println("\n\t-----Task 2-----");
        System.out.println("Enter the number of the day of the week");
        int numberDay = Integer.parseInt(reader.readLine());

        switch (numberDay){
            case 1:
                System.out.println("Monday. Понедельник");
                break;
            case 2:
                System.out.println("Tuesday. Вторник");
                break;
            case 3:
                System.out.println("Wednesday. Среда");
                break;
            case 4:
                System.out.println("Thursday. Четверг");
                break;
            case 5:
                System.out.println("Friday. Пятница");
                break;
            case 6:
                System.out.println("Saturday. Суббота");
                break;
            case 7:
                System.out.println("Sunday. Воскресение");
                break;
            default:
                System.out.println("There is no such day!");
                break;

        }

    }
}
