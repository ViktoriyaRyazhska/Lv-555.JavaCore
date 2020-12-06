import java.lang.reflect.Array;
import java.util.Scanner;

public class Taska {
    public static void main(String[] args) {
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        int[] arr = new int[3];
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        for (i = 0; i < arr.length; i++) {
            System.out.println("Type number: ");
            arr[i] = scanner.nextInt();
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        System.out.println("Min Value is: " + maxValue);
        System.out.println("Max Value is: " + minValue);
    }
}

