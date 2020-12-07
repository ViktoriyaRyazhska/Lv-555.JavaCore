import java.util.Scanner;

public class Taska3 {
    public static void main(String[] args) {
        float[] arr = new float[3];
        int i = 0;
        int counter;
        Scanner scanner = new Scanner(System.in);
        for (i = 0; i < arr.length; i++) {
            System.out.println("Type float: ");
            arr[i] = scanner.nextFloat();
        }
    }
    public static void inRange(float[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > -5 && arr[i] < 5) {
                counter++;
                if (counter == 3) {
                    System.out.println("All of your numbers are belong to range [-5,5]");
                } else {
                    System.out.println("Only " + counter + " number(s) belongs to range [-5,5]");
                }
            }
        }
    }
}
