package HW8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW8 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        double a = 0.22;
//        double b = 0.00;
        int start = 0;
        int end = 10;


        for (int i = 0; i < 10; i++) {
            System.out.println("Please enter a number");
        try {System.out.println(readNumber(0,10, bf));}
        catch (NumberFormatException e)
        {
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        }
//        try {
//            div(a,b);
//        }catch (Exception e) {System.err.println(e);}
//
//    }
//    public static double div(double a, double b) throws Exception {
//        if (b == 0) {throw new Exception("Division on zero");}
//        return a/b;
    }
    public static int readNumber (int start, int end, BufferedReader bf) throws IOException {
        int c = Integer.parseInt(bf.readLine());
        if (c < start | c > end){
            throw new IOException("It's not in the range 0-10");
        }
        return c;
    }
}
