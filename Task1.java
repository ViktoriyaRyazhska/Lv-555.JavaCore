public class Task1 {

	public void execute() {
		System.out.println((fibonacci(10)));
	}

	public static int[] fibonacci(int n) {
		int[] fibonacci = new int[n];
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		for (int i = 2; i < n; ++i) {
			fibonacci[i] = (fibonacci[i - 1] + fibonacci[i - 2]);

		}
		return fibonacci;
	}

	public static void fib(int[] n) {
		for (int i = 0; i < n.length; ++i) {
			System.out.println(n[i]);
		}
	}
}
