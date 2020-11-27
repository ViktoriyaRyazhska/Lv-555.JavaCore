import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Radius is ");
		int r = input.nextInt();
		
		double P = 2 * 3.14 * r;
		
		double S = 3.14 * r * r;
		
		System.out.println("Perimetr is " + P);
		System.out.println("Area is " + S);

	}

}
