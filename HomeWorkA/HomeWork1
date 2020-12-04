import java.util.Scanner;

public class Homework {
        public static void main(String[] args) {

            //1
            System.out.println("Введіть радіус:");
            Scanner sc = new Scanner(System.in);
            int radius = sc.nextInt();

            double PCircle;
            PCircle = Math.PI * 2 * radius;
            double SCircle;
            SCircle = Math.PI * radius * radius;
            System.out.println("Периметр кола: " + PCircle + ". Площа кола: " + SCircle);
            //2
            System.out.println("Як вас звати? (введіть ім'я латинськими буквами)");
            String name = sc.nextLine();
            System.out.println("Введіть Ваш адрес, (введіть адрес латинськими буквами)" + name);
            String address;
            address = sc.nextLine();
            System.out.println("Ім'я: " + name + " адресс: " + address);


            //3
            System.out.println("Введіть тариф для 1 країни:");
            int tariff1;
            tariff1 = sc.nextInt();
            System.out.println("Введіть тривалість дзвінка:");
            int duration1;
            duration1 = sc.nextInt();

            System.out.println("Введіть тариф для 2 країни:");
            int tariff2;
            tariff2 = sc.nextInt();
            System.out.println("Введіть тривалість дзвінка:");
            int duration2;
            duration2 = sc.nextInt();

            System.out.println("Введіть тариф для 3 країни:");
            int tariff3;
            tariff3 = sc.nextInt();
            System.out.println("Введіть тривалість дзвінка:");
            int duration3;
            duration3 = sc.nextInt();

            int costCall1 = costCall(tariff1, duration1);
            int costCall2 = costCall(tariff2, duration2);
            int costCall3 = costCall(tariff3, duration3);

            int sumCalls = costCall1 + costCall2 + costCall3;

            System.out.println("Ціна для 1 карїни: " + costCall1);
            System.out.println("Ціна для 2 країни: " + costCall2);
            System.out.println("Ціна для 3 країни: " + costCall3);
            System.out.println("Загальна ціна: " + sumCalls);
        }
    public static int costCall(int tariff, int duration){
        return tariff * duration;
    }

}

