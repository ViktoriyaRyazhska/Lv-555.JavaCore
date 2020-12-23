import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
//Using this method write a method main(), that has to enter 10 numbers:
//	a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100
//Не розібрався всеодно(
public class Main {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double numberA;
        double numberB;
        List<Integer> list = new ArrayList<>(10);
        try {
            System.out.print("Enter first number: ");
            numberA = Double.parseDouble(bufferedReader.readLine());
            System.out.print("Enter second number: ");
            numberB = Double.parseDouble(bufferedReader.readLine());
            div(numberA, numberB);
            System.out.print("Try your lucky (tip: try to enter int number): ");
            readNumber(10, 1, bufferedReader);

        } catch (IOException | OutOfIntRange e) {
            System.err.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Oops, enter the desired data type");
        }
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
    //метод для визначення чи знаходиться число у вказаному діапазоні
    public static void readNumber(int start, int end, BufferedReader bufferedReader) throws IOException, OutOfIntRange {
        int value = Integer.parseInt(bufferedReader.readLine());
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }
        if (start <= value && value <= end) {
            System.out.println("Congratulations! Your answer " + value + " is in the range!");
        } else {
            throw new OutOfIntRange("Bad day(");
        }
    }
}









