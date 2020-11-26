
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
	int a,b;
	Scanner in = new Scanner(System.in);
	System.out.println("Введіть 1 число");
	a = in.nextInt();
	System.out.println("Введіть 2 число");
	b = in.nextInt();
	System.out.println(a + "+" + b + "=" + (a + b));
	System.out.println(a + "-" + b + "=" + (a - b));
	System.out.println(a + "*" + b + "=" + (a * b));
	System.out.println(a + "/" + b + "=" + (a / b));
    }
}
