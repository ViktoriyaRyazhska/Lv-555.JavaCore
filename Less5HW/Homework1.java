import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        int[] arr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner scanner = new Scanner(System.in);
        System.out.println(getNumberOfDays(arr,scanner));
    }
    public static int getNumberOfDays(int arr[],Scanner scanner) {
        System.out.println("Type number of month: ");
        int n = scanner.nextInt();
        return arr[n-1];
    }
}
