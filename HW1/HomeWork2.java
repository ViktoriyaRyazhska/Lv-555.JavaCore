import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String n = sc.nextLine();
		System.out.println("Where are you live?");
		String a = sc.nextLine();
		
		System.out.println("My name is  " + n);
		System.out.println("I am living in " + a);

	}

}
