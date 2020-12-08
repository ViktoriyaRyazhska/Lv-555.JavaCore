import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    private int[] arr;
    private int count = 0;
    private int min = 0;
    private int minPosition = 0;
    private int secondPosPosition;
    private int secondPos;
    private int i;

    public Task3(Scanner sc) {
        this.arr = new int[5];
        for (i = 0; i < arr.length; i++) {
            System.out.println("Enter element number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }

    public void PosMin(){
        for (i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minPosition = i;
            }
        }System.out.println("Min: " + min + " " + "position: " + (minPosition+1));
    }

    public void SecPosPosition(){
        for (i = 0; i < arr.length; i++) {
            if(arr[i] > 0){
                count++;
                if(count == 2){
                    secondPos = arr[i];
                    secondPosPosition = i;
                }
            }
        }
        System.out.println("Second Positive is: " + secondPos + " position: " + (secondPosPosition+1));
    }
}



