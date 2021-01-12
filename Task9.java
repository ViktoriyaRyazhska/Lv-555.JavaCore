import java.util.Random;

public class Task9 {
	public void execute() {

		System.out.println(counter(10));
	}

	public static int randomMethod() {
		Random random = new Random();
		return random.nextInt(2);
	}

	public static int counter(int n) {
		int counter = 0;
		for (int i = 0; i <= n; i++) {
			int z = randomMethod();
			if (z == 1) {
				counter++;
			}
		}
		return counter;
	}
}
