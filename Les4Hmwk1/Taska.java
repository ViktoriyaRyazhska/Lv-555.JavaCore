import java.util.Scanner;

public class Taska {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        for (i = 0; i < arr.length; i++) {
            System.out.println("Type number: ");
            arr[i] = scanner.nextInt();
        }
    }
    public int maxValue(int[] arr) {
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
        public int minValue ( int[] arr){
            int minValue = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < minValue) {
                    minValue = arr[i];
                }
            }
            return minValue;
        }
    }



