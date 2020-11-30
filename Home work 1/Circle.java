import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть радіус круга");
        double radius = in.nextDouble();
        double perimeter, area;
        final double pi = 3.14159;
        perimeter = 2 * pi * radius;
        area = pi * (radius * radius);
        System.out.println("Периметр круга = " + perimeter);
        System.out.println("Площа круга = " + area);

    }
}
