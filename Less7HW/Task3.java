import java.lang.reflect.Array;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter surname, name and patronymic : ");
        String all = scanner.nextLine();
        surnameAndInitials(all);
        name(all);
        nameMiddleLast(all);
    }
    public static void surnameAndInitials(String str) {
        String[] splited = str.split(" ");
        StringBuilder sb = new StringBuilder(splited[0]);
        String point = ".";
        String space = " ";
        sb.append(space).append(splited[1].substring(0,1)).append(point).append(splited[2].substring(0,1)).append(point);
        System.out.println(sb);
    }
    public static void name(String str) {
        String[] splited = str.split(" ");
        System.out.println(splited[1]);
    }
    public static void nameMiddleLast(String str) {
        String[] splited = str.split(" ");
        StringBuilder sb = new StringBuilder(splited[1]);
        String space = " ";
        sb.append(space).append(splited[2]).append(space).append(splited[1]);
        System.out.println(sb);
    }
}
