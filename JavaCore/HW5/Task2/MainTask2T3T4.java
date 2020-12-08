import java.sql.SQLOutput;
import java.util.Scanner;

public class MainTask2T3T4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Task2 arr = new Task2(sc);
        arr.SumOrProd();
        Task3 arr1 = new Task3(sc);
        arr1.SecPosPosition();
        arr1.PosMin();
    }
}
