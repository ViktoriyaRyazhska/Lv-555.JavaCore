import java.util.InputMismatchException;
import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		int a = 0,b = 0;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter number a:");
			a = sc.nextInt();
			System.out.println("Enter number b:");
			b = sc.nextInt();
		}catch(InputMismatchException e) {
			System.err.println("You enter wrong value!");
		}finally {
			sc.close();
		}
		try {
			System.out.println(squareRectangle(a,b));
		} catch (Exception e) {
			System.err.println("You have negative value");
		}
	}
	public static int squareRectangle (int a, int b) throws Exception {
		if (a < 0 || b < 0)
			throw new Exception();
		return a*b;
	}
}