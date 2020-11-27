import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c1 = 10;
		int c2 = 15;
		int c3 = 20;
		
		System.out.println("Time of first conversation: ");
		int t1 = sc.nextInt();
		System.out.println("Time of second conversation: ");
		int t2 = sc.nextInt();
		System.out.println("Time of third conversation: ");
		int t3 = sc.nextInt();
		
		int p1 = c1 * t1;
		int p2 = c2 * t2;
		int p3 = c3 * t3;
		int sum = p1 + p2 + p3;
		
		System.out.println("Price of first conversation: " + p1);
		System.out.println("Price of second conversation: " + p2);
		System.out.println("Price of third conversation: " + p3);
		System.out.println("Price at all: " + sum);
		
	}

}
