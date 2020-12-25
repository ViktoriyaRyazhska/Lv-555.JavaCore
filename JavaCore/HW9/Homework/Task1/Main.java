import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //Краще не придумав
        int start = 1;
        int end  = 15;
        int[] arr = new int[10];
        System.out.println("Each next number must be greater! Start!");
        for (int i = 0; i < arr.length; i++) {
            try { arr[i] = readNumber(start,end,bufferedReader);
                if(i > 0){
                    if(arr[i] < arr[i-1]){
                        System.err.println("Told ya)");
                        break;
                    }
                }
            } catch (IOException | OutOfIntRange | NumberFormatException e) {
                System.err.println(e.getMessage());
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
        double a = 6;
        double b = 1;
        try {
            System.out.println(a + " / " + b + " = " + div(a,b));
            System.out.print("Try your lucky (tip: try to enter int number): ");
            System.out.println("Nice, your number " + readNumber(10, 1, bufferedReader) + " is in the range ");
        } catch (IOException | OutOfIntRange | ArithmeticException | NumberFormatException e) {
            System.err.println(e.getMessage());
        }
    }
    public static double div(double a, double b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("!/0");
        }
        return a / b;
    }
    //метод для визначення чи знаходиться число у вказаному діапазоні
    public static int readNumber(int start, int end, BufferedReader bufferedReader) throws IOException, OutOfIntRange {
        int value = Integer.parseInt(bufferedReader.readLine());
        //Цей if для того, щоб програма працювала коректно, незалежно від значення start i end
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }
        if (start < value && value < end) {
            return value;
        } else {
            //Написав свій
            throw new OutOfIntRange("Bad day(");
        }
    }
}









