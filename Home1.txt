import java.util.Scanner;

public class Example {
	public static void main(String... var)
	{
		System.out.println("First task");
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter a value");
		a = sc.nextInt();
		System.out.println("Enter b value");
		b = sc.nextInt();
		System.out.println("a + b = " + (a+b));
		System.out.println("a - b = " + (a-b));
		System.out.println("a * b = " + (a*b));
		System.out.println("a / b = " + (a/b));
		System.out.println("Second task");
		System.out.println("How are you?");
		String answer = sc.next();
		System.out.println("You are " + answer);
		sc.close();
	}
}