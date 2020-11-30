import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        System.out.println("Клумба має форму круга. Введіть радіус: ");
        double radius = Double.parseDouble(br.readLine());;
        double perimeter;
        double area;
        while (radius <= 0){ //radius cannot be less than 0 or equal to 0
                System.out.println("Радіус не може бути менше 0. Введіть число більше 0: ");
                radius = Double.parseDouble(br.readLine());
        }
            perimeter = 2 * 3.14 * radius;
            area = 3.14 * radius * radius;
        System.out.println("Площа клумби з радіусом " + radius + " = " + area);
        System.out.println("Периметр клумби з радіусом " + radius + " = " + perimeter);
    }
}

