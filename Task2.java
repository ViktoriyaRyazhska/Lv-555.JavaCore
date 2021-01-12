import java.util.Scanner;

public class Task2 {
	public void execute() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter number: ");
			int num = sc.nextInt(); 
		int k = 2;
		while(num > 1) {
			if (num % k == 0) {
				System.out.print(k+" ");
				num=num/k;
			}else {
				k++;
			}
		}
		}catch(Exception e) {
			System.err.println("We have error!");
		}
		sc.close();
	}
}