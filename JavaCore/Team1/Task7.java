import java.util.Scanner;
public class Task7 {
	Scanner sc = new Scanner(System.in);
	public int factorial(Scanner sc) {
		int x = sc.nextInt();
		int result = 1;
		for (int i = 1; i <= x; i ++){
			result = result*i;
		}
		return result;
	}

}
