import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car[] cars = {new Car("Truck", 2015, 3999),
                new Car("Pickup", 2020, 2999),
                new Car("Sedan", 2010, 1999),
                new Car("Buggy", 2010, 999)};
        System.out.println(Arrays.toString(cars));

        modelYear(cars,scanner);
        sortByProductionYear(cars);

    }

    public static void modelYear(Car[] cars, Scanner scanner) {
        System.out.println("Enter model year: ");
        int modY = scanner.nextInt();
        int counter = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getProductionYear() == modY) {
                System.out.println("Cars with entered model year: " + cars[i]);
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("There is no cars with entered model year");
        }
    }
    public static void sortByProductionYear(Car[] cars) {
        for (int z = 0; z < cars.length - 1; z++) {
            for (int j = z + 1; j < cars.length; j++) {
                if (cars[z].getProductionYear() < cars[j].getProductionYear()) {
                   Car tmp = cars[z];
                    cars[z] = cars[j];
                    cars[j] = tmp;
                }
            }
        }
        for (int k = 0; k < cars.length; k++) {
            System.out.println(cars[k]);
        }
    }
}
