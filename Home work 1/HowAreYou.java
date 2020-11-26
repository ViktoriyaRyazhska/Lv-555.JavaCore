package com.company;

import java.util.Scanner;

public class HowAreYou {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	    System.out.println("How are you");
	    String str = in.nextLine();
        System.out.println(str);
    }
}
