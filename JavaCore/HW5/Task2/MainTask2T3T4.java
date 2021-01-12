
import java.util.Arrays;
import java.util.Scanner;

public class MainTask2T3T4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car[] cars = {new Car("Mashinka1", sc.nextInt(), 1),
                new Car("Mashinka2", sc.nextInt(), 800),
                new Car("Mashinka3", sc.nextInt(), 650),
                new Car("Mashinka4", sc.nextInt(), 600)};
       Car tmp;
        for (int i = 0; i < cars.length; i++) { //від новішої моделі до старішої
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].getYearOfProduction() < cars[j].getYearOfProduction()) {
                    tmp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = tmp;
                  //  Task2 arr = new Task2(sc);
                    //arr.SumOrProd();
                    //Task3 arr1 = new Task3(sc);
                    //arr1.SecPosPosition();
                    //arr1.PosMin();

                }
            }
        }System.out.println(Arrays.toString(cars));
    }
}
