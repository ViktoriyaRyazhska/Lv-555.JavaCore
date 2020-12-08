import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    private int sum = 0;
    private int product = 1;
    private int[] arr;
    private int i;

    public Task2(Scanner sc) {
        this.arr = new int[10];
        for (i = 0; i < arr.length; i++) {
            System.out.println("Enter element number " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }

    public void SumOrProd() {
        for (i = 0; i < arr.length / 2; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
            }
        }
        if (sum >= 5) {
            System.out.println("Sum = " + sum);
        } else {
            for (i = 5; i < arr.length; i++) {
                product *= arr[i];
            }
            System.out.println("Product = " + product);
        }
    }
}

