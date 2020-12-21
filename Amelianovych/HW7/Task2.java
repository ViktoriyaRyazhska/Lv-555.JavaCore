package HW7;

public class Task2 {
    public static void main(String[] args) {
        String s = "I    am      learning     Java   Core";
        s = s.replaceAll("( )+" , " ");
        System.out.println(s);
    }
}
