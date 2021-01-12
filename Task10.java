import java.util.Scanner;

public class Task10 {
	public void execute() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any the natural number is greater than one: ");
		try {
			int num = sc.nextInt();
			if (num<2) {
				System.out.println("You use wrong number!");
			}else {
				int count = 0;
				while (num != 1) {
					if (num % 2 == 0) {
						num = num/2;
						count++;
					}else {
						num = num*3+1;
						count++;
					}
				}
				System.out.println("The number of steps is :"+count);
			}
		}catch(Exception e) {
			System.err.println("We have error!");
		}
		sc.close();
	}
}