import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        int [] mounthsDays = {31, 28, 31, 30, 31, 30, 31, 31, 31, 30, 31, 30, 31};
        System.out.println("Введіть номер місяця:");
        int number = m.nextInt();
        if (number > 12 || number < 1) {
            System.out.println("Введено некоректний номер місяця. Введіть ще раз:");
            number = m.nextInt();
        } else {
            System.out.println(mounthsDays[number-1]);}

    }
}
