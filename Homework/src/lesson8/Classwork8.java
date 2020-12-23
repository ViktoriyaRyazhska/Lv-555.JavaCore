package lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Classwork8 {
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
        checkNameForValidity("Maya");
        checkNameForValidity("Ma");
        checkNameForValidity("Mayajfdljgifdjgijdfigji");
        checkNameForValidity("%@Maya");
        checkNameForValidity("_Maya");

    }

    public static void checkNameForValidity(String name){
        Pattern p = Pattern.compile("[a-zA-Z_0-9]{3,15}");
        Matcher m = p.matcher(name);
        if(m.matches()){
            System.out.println(name + " is a valid name");
        }else {
            System.out.println(name + " is an invalid name");
        }
    }
}

