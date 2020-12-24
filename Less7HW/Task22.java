import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> emploeeMap = new HashMap<Integer, String>();
        emploeeMap.put(1, "Tom");
        emploeeMap.put(2, "Sawyer");
        emploeeMap.put(3, "Huck");
        emploeeMap.put(4, "Finn");
        emploeeMap.put(5, "Chuck");
        emploeeMap.put(6, "Norris");
        emploeeMap.put(7, "Charles");

        System.out.println(emploeeMap);
        output(emploeeMap);

        corespondingName(emploeeMap, scanner);
        corespondingValue(emploeeMap, scanner);

    }
    public  static void output(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> entry : map.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());
    }
    public static void corespondingName(Map<Integer, String> map, Scanner scanner) {
        System.out.println("Enter ID: ");
        int x = scanner.nextInt();
        if (map.containsKey(x)) {
            for (Map.Entry<Integer, String> entry : map.entrySet())
                if (entry.getKey() == x) {
                    System.out.println(entry.getValue() + " is the name of character with key :" + entry.getKey());
                }
        } else {
            System.out.println("There is no such key");
        }
    }
    public static void corespondingValue(Map<Integer, String> map, Scanner scanner) {
        System.out.println("Enter Value: ");
        String z = scanner.next();
        if (map.containsValue(z)) {
            for (Map.Entry<Integer, String> entry : map.entrySet())
                if (entry.getValue().equals(z)) {
                    System.out.println(entry.getKey() + " is the key of character with Name :" + entry.getValue());
                }
        } else {
            System.out.println("There is no such name");
        }
    }
}
