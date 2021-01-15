package com.company;
import java.util.Scanner;

public class Task5 {

    public static void task5() {
	    String a = "";
	    String b = "ABCCBA";
	    Scanner s = new Scanner(System.in);
	    System.out.println("Введіть рядок для перевірки: ");
	    a = s.nextLine();
	    int n = a.length();
	    for(int i = n - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
	    if(a.equalsIgnoreCase(b))
        {
            System.out.println("Рядок вірний " );
        }
	    else
        {

            System.out.println("Рядок не вірний");
        }
    }
}
