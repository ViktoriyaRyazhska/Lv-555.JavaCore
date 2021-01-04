package zero;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        double a = div(1, 0);
        System.out.println(a);
        int i = 0;
        int[] main = new int[10];
        while (true) {
            main[i] = readNumber(1, 10);
            if(main[i]!=-1&&(i==0||main[i-1]<main[i])) i++;
            if(i >= 9) break;
        }
    }
    private static double div(double x, double y) {
        try {
            return x/y;
        } catch (Exception e) {
            System.err.println("Error 1");
            return 0;
        }
    }

    private static int readNumber(int start, int end) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть число: ");
        try {
            int n = sc.nextInt();
            if(n>start&&n<end) {
                System.out.println(n);
                return n;
            }
        }catch (InputMismatchException e) {
            System.err.println("Error 2");
        }
        sc.close();
        return -1;
    }
}