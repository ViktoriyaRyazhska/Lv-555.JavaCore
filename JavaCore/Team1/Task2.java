import java.util.Scanner;

public class Task2 {
	Scanner sc = new Scanner(System.in);
	public void rozklad(int n) {
		int a = 2;
        while (a <= n) {
            if ((n % a) == 0) {
                if (a != n) {
                    System.out.print(a + " ");
                    rozklad(n / a);
                } else {
                    System.out.print(a);
                }
                return;
            }
            a++;
            sc.close();
        }
	}

}
