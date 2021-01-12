package com.company;

public class Tack1 {

    public static void main(String[] args) {
	    int a = 1;
	    int b = 1;
	    int c;
	    System.out.println(a + " " + b + " ");
	    for(int i = 0; i < 4; i++) {
	        c = a + b;
	        System.out.println(c + " ");
	        a = b;
	        b = c;
        }
	    System.out.println();
    }
}
