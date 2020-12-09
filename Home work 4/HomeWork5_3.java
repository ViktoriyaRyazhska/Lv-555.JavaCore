import java.util.Scanner;


public class HomeWork5_3 {
    static void secondPositiveNumber( int[] num){
        int chek = 0;
        for(int n = 0; n < num.length; n++) {
            if (num[n] >= 0) {
                chek++;
            }
            if (chek == 2){
                System.out.println("Позиція 2 додатнього сичла = " + (n+1));
            }
        }
    }

    static void minimum(int[] num){
        int minimum = num[0];
        int position = 0;
        for(int n = 1; n < num.length; n++) {
            if (num[n] < minimum){
                minimum = num[n];
                position = n + 1;
            }
        }
        System.out.println("Мінімальне число масива: " + minimum);
        System.out.println("Позиція мінімального число масива: " + position);
    }

    static void productEvenNumbers(int[] num){
        int prdEven = 1;
        for(int n = 0; n < num.length; n++){
          if(num[n] % 2 == 0){
              prdEven *= num[n];
          }
        }
        System.out.println("Добуток всіх додатніх чисел = " + prdEven);
    }

    public static void main(String[] args) {
        int [] numbers = new int[5];
        Scanner num = new Scanner(System.in);
        for(int n = 0; n < numbers.length; n++){
            System.out.println("Введіть " + (n+1) + " число");
            numbers[n] = num.nextInt();
        }
        secondPositiveNumber(numbers);
        minimum(numbers);
        productEvenNumbers(numbers);
    }
}
