import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    private int sum = 0;
    private int product = 1;
    private int[] arr;

    public Task2(Scanner sc) {
        this.arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element number " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }

    public void SumOrProd() {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
            }
        }
        if (sum >= 5) {
            System.out.println("Sum = " + sum);
        } else {
            for (int j = 5; j < arr.length; j++) {
                product *= arr[j];
            }
            System.out.println("Product = " + product);
        }
    }
}

