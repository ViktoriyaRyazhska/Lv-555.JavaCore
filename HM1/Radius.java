package zero;
import java.util.Scanner;

public class Radius {

    public static void main(String[] args)
    {

        System.out.println("Task 1");
        Scanner sc = new Scanner(System.in);
        int r;
        System.out.println("Enter a radius");
        r = sc.nextInt();

        System.out.println("Flower bed perimeter = " + 2*Math.PI*r);
        System.out.println("Flower bed area = " + Math.PI*r*r);


        System.out.println("Task 2");
        System.out.println("What is your name?");
        String name = sc.next();
        System.out.println("Where are you live, "+name+"?");
        String address = sc.next();
        System.out.println("Name = "+name);
        System.out.println("Address = "+address);


        System.out.println("Task 3");
        int c1,c2,c3,t1,t2,t3,s1,s2,s3;
        System.out.println("Enter first cost: ");
        c1 = sc.nextInt();
        System.out.println("Enter second cost: ");
        c2 = sc.nextInt();
        System.out.println("Enter third cost: ");
        c3 = sc.nextInt();
        System.out.println("Enter first time: ");
        t1 = sc.nextInt();
        System.out.println("Enter second time: ");
        t2 = sc.nextInt();
        System.out.println("Enter third time: ");

        t3 = sc.nextInt();
        s1 = c1*t1;
        s2 = c2*t2;
        s3 = c3*t3;

        System.out.println("First call cost = "+s1);
        System.out.println("Second call cost = "+s2);
        System.out.println("Third call cost = "+s3);
        System.out.println("All call cost = "+(s1+s2+s3));

        sc.close();
    }
}
