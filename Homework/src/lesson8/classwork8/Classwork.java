package lesson8.classwork8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Classwork {
    public static void main(String[] args) throws IOException {
        System.out.println("----Task1----");
        String s1 = "IT";
        String s2 = "IT Academy";
        System.out.println(s2.contains(s1));

        System.out.println("\n----Task2----");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter surname, name and patronymic:>");
        String fio = reader.readLine();

        String[ ] arrFio = fio.split(" ");
        System.out.println("Your name is " + arrFio[1]);
        System.out.println("Your full name is " + arrFio[1] + " " + arrFio[2] + " " + arrFio[0]);

        char firstLetterName = arrFio[1].charAt(0);
        char firstLetterMiddleName = arrFio[2].charAt(0);
        System.out.println("Your surname and initials is " + arrFio[0] + " " + firstLetterName + ". " + firstLetterMiddleName + ".");

        System.out.println("\n----Task3----");



    }
}

