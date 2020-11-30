package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class topic1task1 {
    public static void main(String[] args) throws IOException {

        //task 1    some changes
        System.out.println("Enter a radius value:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int radius = Integer.parseInt(reader.readLine());

        double perimeterCircle = (Math.PI * 2 * radius);
        double areaCircle = Math.PI * radius * radius;
        System.out.println("The perimeter of the circle is: " + perimeterCircle + ". The area of the circle is: " + areaCircle);


        //task 2
        System.out.println("What is your name?");
        String name = reader.readLine();
        System.out.println("Where do you live, " + name);
        String address  = reader.readLine();
        System.out.println(name + "'s address is " + address);


        //tasks 3
        System.out.println("Enter the tariff of a call to country 1:");
        int tariff1 = Integer.parseInt(reader.readLine());
        System.out.println("Enter the tariff of a call to country 2:");
        int tariff2 = Integer.parseInt(reader.readLine());
        System.out.println("Enter the tariff of a call to country 3:");
        int tariff3 = Integer.parseInt(reader.readLine());

        System.out.println("Enter the duration of the call to country 1:");
        int duration1 = Integer.parseInt(reader.readLine());
        System.out.println("Enter the duration of the call to country 2:");
        int duration2 = Integer.parseInt(reader.readLine());
        System.out.println("Enter the duration of the call to country 3:");
        int duration3 = Integer.parseInt(reader.readLine());

        int costCall1 = costCall(tariff1, duration1);
        int costCall2 = costCall(tariff2, duration2);
        int costCall3 = costCall(tariff3, duration3);

        int sumCalls = costCall1 + costCall2 + costCall3;

        System.out.println("Call cost to country 1: " + costCall1);
        System.out.println("Call cost to country 2: " + costCall2);
        System.out.println("Call cost to country 3: " + costCall3);
        System.out.println("Sum of all calls: " + sumCalls);
    }

    public static int costCall(int tariff, int duration){
        return tariff * duration;
    }
}
