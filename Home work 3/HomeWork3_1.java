import java.util.Scanner;

public class HomeWork3_1 {

    static void rangeAll (float a, float b, float c){
        if ((a > 5 || b > 5 || c > 5) || (a < -5 || b < -5 || c < -5)  ){
            System.out.println("Дані числа не входять в межі від -5 до 5");
        } else {
            System.out.println("Дані числа  входить в межі від -5 до 5");
        }

    }

    static void range(float a){
        if(a > 5 || a < -5){
            System.out.println("Дане число не входить в межі від -5 до 5");
        } else {
            System.out.println("Дане число  входить в межі від -5 до 5");
        }

    }

    static void max (int a, int b, int c){
        if (a > b && a > c){
            System.out.println("Максимальне число = " + a);
        } else if (b > c) {
            System.out.println("Максимальне число = " + b);
        } else System.out.println("Максимальне число = " + c);
    }

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Введіть 1 число");
        float number1 = i.nextFloat();
        System.out.println("Введіть 2 число");
        float number2 = i.nextFloat();
        System.out.println("Введіть 3 число");
        float number3 = i.nextFloat();

        range(number1);
        range(number2);
        range(number3);
        rangeAll(number1, number2, number3);

        System.out.println("Введіть 1 число");
        int n1 = i.nextInt();
        System.out.println("Введіть 2 число");
        int n2 = i.nextInt();
        System.out.println("Введіть 3 число");
        int n3 = i.nextInt();

        max(n1, n2, n3);
    }
}
