import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class Homework1 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            division(7, 0);
        }catch (ArithmeticException e){
            e.getMessage();
        }
        int[] rangelist = new int[10];
        int start = 1;
        int end = 100;
        for (int i = 0; i < rangelist.length; i++) {
            System.out.println("Enter number from 1 to 100 with condition: every next one should be bigger than previous," +
                    "so make sure , u left enough space for " + (10 - i) + " next numbers");
            try {
                rangelist[i] = readNumber(start, end, br);
                if (i > 0) {
                    if (rangelist[i] < rangelist[i - 1]) {
                        System.out.println("Less then previous");
//                        break;      ??
                    }
                }
            } catch (IOException | NumberFormatException | InputMismatchException | MyException e) {
                e.getMessage();
                e.printStackTrace();
//                break; ??
            }
        }
    }
         public static double division(double a, double b) throws ArithmeticException {
            if (b == 0) {
            throw new ArithmeticException("Division by zero"); // Division by zero with doubles gives us INFINITY. Program doesn't crush , so do we have to write an exception on it ?
        }
        return a / b;
    }
    public static int readNumber(int start, int end, BufferedReader br) throws IndexOutOfBoundsException, IOException, NumberFormatException, MyException {
        System.out.println("Enter number :");
        int entered = Integer.parseInt(br.readLine());
        if (entered >= start && entered <= end) {
            return entered;
        } else  if (start > end){
            throw new MyException("Start cannot be > than end");
         }else {throw new IndexOutOfBoundsException("Out of range");
        }
    }
}


