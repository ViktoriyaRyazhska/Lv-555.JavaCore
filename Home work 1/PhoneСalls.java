import java.util.Scanner;

public class PhoneСalls {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        double c1 = 1.50;
        double c2 = 2;
        double c3 = 0.45;
        double t1, t2, t3, v1, v2, v3, vsuma;
        System.out.println("Введіть тривалість прешої розмови");
        t1 = in.nextDouble();
        System.out.println("Введіть тривалість другої розмови");
        t2 = in.nextDouble();
        System.out.println("Введіть тривалість третьої розмови");
        t3 = in.nextDouble();
        v1 = c1 * t1;
        v2 = c2 * t2;
        v3 = c3 * t3;
        vsuma = v1 + v2 + v3;
        System.out.println("Вартість першої розмови становить: " + v1 + " гривень");
        System.out.println("Вартість другої розмови становить: " + v2 + " гривень");
        System.out.println("Вартість третої розмови становить: " +  v3 + " гривень");
        System.out.println("Вартість всіх розмов становить: " + vsuma + " гривень");
    }
}
