import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void execute() {

        System.out.println(counter(10));
    }
    public static int randomMethod() {
        Random random = new Random();
        return random.nextInt(2);
    }
    public static int counter() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int counter = 0;
        for (int i = 0; i <= n; i++) {
            int z = randomMethod();
            if (z == 1) {
                counter++;
            }
        }return counter;
    }
}
