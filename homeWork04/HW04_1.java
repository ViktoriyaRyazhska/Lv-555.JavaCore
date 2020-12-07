package firstPac;

import java.util.Scanner;

public class HW04_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       
		
		//1
		System.out.println("Enter 1st number: ");
        float x1 = sc.nextFloat();
        System.out.println("Enter 2nd number: ");
        float x2 = sc.nextFloat();
        System.out.println("Enter 3rd number: ");
        float x3 = sc.nextFloat();

        if((-5f <= x1) && (x1 <= 5f)){
            System.out.println(x1 + " belong to the range [-5,5]");
        }else{
            System.out.println(x1 + " not belong to the range [-5,5]");
        }
        if((-5f <= x2) && (x2 <= 5f)){
            System.out.println(x2 + " belong to the range [-5,5]");
        }else{
            System.out.println(x2 + " not belong to the range [-5,5]");
        }
        if((-5f <= x3) && (x3 <= 5f)){
            System.out.println(x3 + " belong to the range [-5,5]");
        }else{
            System.out.println(x3 + " not belong to the range [-5,5]");
        }
        
        //2
        System.out.println("Enter 1st number: ");
        int z1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int z2 = sc.nextInt();
        System.out.println("Enter 3rd number: ");
        int z3 = sc.nextInt();
      
        if((z1 > z2) && (z1 > z3)){
            System.out.println(z1 + " maximum number");
        }else if (z2 > z3){
            System.out.println(z2 + " maximum number");
        }else{
            System.out.println(z3 + " maximum number");
        }
        
        if((z1 < z2) && (z1 < z3)){
            System.out.println(z1 + " minimum number");
        }else if (z2 < z3){
            System.out.println(z2 + " minimum number");
        }else{
            System.out.println(z3 + " minimum number");
        }
        
        //3
        System.out.print("Enter code of error: ");
        switch (sc.next()){
            case "401": System.out.println("Error type: " + Errors.UNAUTHORIZED); break;
            case "402": System.out.println("Error type: " + Errors.PAYMENT_REQUIRED); break;
            case "403": System.out.println("Error type: " + Errors.FORBIDDEN); break;
            case "404": System.out.println("Error type: " + Errors.NOT_FOUND); break;
            case "405": System.out.println("Error type: " + Errors.METHOD_NOT_ALLOWED); break;
            default: System.out.println("I don't know this error type((");
        }
	}

		    public enum Errors{UNAUTHORIZED, PAYMENT_REQUIRED, FORBIDDEN, NOT_FOUND, METHOD_NOT_ALLOWED}
	
}
