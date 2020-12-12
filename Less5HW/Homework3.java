import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        int[] arr = {-2, 16, -8, 23, -34};
        Scanner scanner = new Scanner(System.in);
        min(arr);
        System.out.println("the product of all entered even numbers.: " + Homework3.prodOfEntered(scanner));
        System.out.println("Position of second positive for regular user is: " + secondPositivePos(arr));
    }
    public static void min(int[] arr) {
        int min = arr[0];
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                pos = i;
            }
        }
        System.out.println("min is: " + min + " it's position is: " + (pos + 1));
    }
    public static int prodOfEntered(Scanner scanner) {
        int prod = 1;
        int[] arr1 = new int[5];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter number");
            int x = scanner.nextInt();
            if (x > 0) {
                arr1[i] = x;
            } else {
                return prod;
            }
            if (x % 2 == 0) prod *= arr1[i];
        }
        return prod;
    }
    public static int secondPositivePos(int[] arr) {
        int pos2 = 0;
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                pos2++;
            }
            if (pos2 == 2) {
                break;
            }
        }  return (i+1);
    }
}



