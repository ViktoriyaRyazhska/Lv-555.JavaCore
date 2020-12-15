package lesson5.homework5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Homework5d {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Car[] cars = new Car[4];
        cars[0] = new Car("Sedan", 2005, 5);
        cars[1] = new Car("Minivan", 2003, 6);
        cars[2] = new Car("Coupe", 2010, 7);
        cars[3] = new Car("Hatch-back", 2010, 8);

        displayCarByYear(reader, cars);
        orderedByYear(cars);
    }

    public static void displayCarByYear(BufferedReader reader, Car[] cars) throws IOException {
        System.out.println("Enter year of production:>");
        int inputYear = Integer.parseInt(reader.readLine());
        for (int i = 0; i < cars.length; i++) {
            if(cars[i].getYearOfProduction() == inputYear){
                System.out.println(cars[i].getType() + " " + cars[i].getEngineCapacity());
            }
        }
    }

    public static void orderedByYear(Car[] cars){

        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if(cars[i].getYearOfProduction() > cars[j].getYearOfProduction()){
                    Car tmp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(cars));
    }
}
