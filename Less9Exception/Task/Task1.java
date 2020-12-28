import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
             System.out.println(area(scanner.nextInt(), scanner.nextInt()));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        System.out.println("After catch");
     }
    public static int area (int a, int b) throws IllegalArgumentException{
        if (a<0 | b<0) {
            throw new IllegalArgumentException("Parameters must be >0");
        }
        return a*b;
    }
}
