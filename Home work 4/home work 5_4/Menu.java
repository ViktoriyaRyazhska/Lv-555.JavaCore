import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Car [] cars = { new Car("t1",2002,5),
                new Car("t3",1995,3),
                new Car("t2",1998,2),
                new Car("t1",2010,8)};
        Scanner y = new Scanner(System.in);
        System.out.println("Вкажіть рік машини. Доступні роки 1995, 1998, 2002, 2010");
        int year  = y.nextInt();
        for (int i = 0; i < cars.length; i++){
            if(cars[i].getYear() == year){
                System.out.println(cars[i]);
            }
        }

        Car tmp;
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].getYear() > cars[j].getYear()) {
                    tmp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(cars));

        }

}
