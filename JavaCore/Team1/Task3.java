import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task3 {
    public final double DOLLAR_RATE = 28.03;
    private double sumGryvna;

    public  void calcSumDollars(Scanner scanner){
        System.out.println("Enter sum of Gryvnas");
        double sumGryvna = scanner.nextDouble();
        double sumDollar = sumGryvna / DOLLAR_RATE;
        double change = sumDollar % DOLLAR_RATE;
        System.out.println("Sum in dollars is " + Math.round(sumDollar) + " and change is " + change);
    }
}
