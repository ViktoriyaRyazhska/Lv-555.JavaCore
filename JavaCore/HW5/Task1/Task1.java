import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number of month: ");
        switch (br.readLine()){
            case "1", "3", "5", "7","8","10","12":
                System.out.println(Arrays.toString(Month.MonthDay(31)));
                break;
            case "2":
                System.out.println(Arrays.toString(Month.MonthDay(28)));
                break;
            case "4", "6","9", "11":
                System.out.println(Arrays.toString(Month.MonthDay(30)));
                break;
            default:
                System.out.println("There is no such month");
        }
    }
}
