import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
	public static void main(String[] args) {
		double c = div(1.2,0);
		System.out.println(c);
		int i = 0;
		int[] main = new int[10];
		while(true) {
			main[i] = readNumber(1,100);
			if (main[i]!=-1&&(i==0||main[i-1]<main[i]))
				i++;
			if (i >= 9)
				break;
		}
		
	}
	private static double div(double a, double b) {
		try {
			return a/b;
		}catch(Exception e) {
			System.err.println("We have error in div()");
			return 0;
		}
	}
	private static int readNumber(int start, int end) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer number");
		try {
			int n = sc.nextInt();
			if (n>start&&n<end) {
				System.out.println(n);
				return n;
			}
		}catch(InputMismatchException e) {
			System.err.println("You use wrong number");
		}
		sc.close();
		return -1;
	}
}