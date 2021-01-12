import java.util.Scanner;

public class Task6 {
	public void execute() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text: ");
		try {
			String s = sc.nextLine();
			String[] words = s.split("\\s+");
			System.out.println("Number of words in this text: "+words.length);
		}catch(Exception e) {
			System.err.println("We have error!");
		}
		sc.close();
	}
}