import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double numberA;
        double numberB;
        try {
            System.out.println("Enter first number: ");
            numberA = Double.parseDouble(bufferedReader.readLine());
            System.out.println("Enter second number: ");
            numberB = Double.parseDouble(bufferedReader.readLine());
            div(numberA, numberB);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("Oops, please enter a number");
        }
        System.out.println("Like us?");
    }
    //не получилось в мене щоб метод повертав тип double
    //catch не ловив помилку ділення на 0 і результат завжди виводився Infinity
    //Мені не дуже подобається моє рішення, але поки так
    public static void div(double a, double b) {
        if (b == 0) {
            System.err.println("!/0");
        } else {
            System.out.println(a / b);
        }
    }
}