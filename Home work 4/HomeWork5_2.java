import java.util.Scanner;

public class HomeWork5_2 {
    public static void main(String[] args) {
        int [] numbers = new int[10];
        Scanner num = new Scanner(System.in);
        for(int n = 0; n < numbers.length; n++){
            System.out.println("Введіть " + (n+1) + " число");
            numbers[n] = num.nextInt();
        }
        int sum = 0;
        int prd = 1;
        boolean positive = true;

        for(int n = 0; n < 5; n++) {
            if (numbers[n] <= 0) {
                positive = false;
            }
        }

        if(positive == true){
            for(int n = 0; n < 5; n++){
                sum+= numbers[n];
            }
            System.out.println("Suma = " + sum);
        }

        if (positive == false){
            for(int n = 5; n < 10; n++){
                prd*= numbers[n];
            }
            System.out.println("Product = " + prd);
        }
    }
}
