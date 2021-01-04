package zero;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b;
        System.out.println("Enter number");
        a = scan.nextInt();
        System.out.println("Enter second number");
        b = scan.nextInt();
        System.out.println("a + b = " + (a+b));
        System.out.println("a - b = " + (a-b));
        System.out.println("a * b = " + (a*b));
        System.out.println("a / b = " + (a/b));

    }
}
