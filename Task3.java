import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
	public void execute() throws IOException {
		double dollar;
		double hryvna;
		double sum;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please input cost of dollar");
		dollar = Double.parseDouble(bf.readLine());
		System.out.println("Please input sum of money in hryvna");
		hryvna = Double.parseDouble(bf.readLine());
		if (hryvna > 0) {
			sum = hryvna / dollar;
			System.out.println("You can buy $" + sum);
		} else {
			System.out.println("You can't change 0, or less");
		}
	}
}
