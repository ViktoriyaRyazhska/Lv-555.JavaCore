import java.util.*;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> pers = new LinkedHashMap<String, String>();
        pers.put("Verstappen", "Max");
        pers.put("Albon", "Alex");
        pers.put("Peres", "Sergio");
        pers.put("Sawyer", "Tom");
        pers.put("Finn", "Huck");
        pers.put("Twain", "Mark");
        pers.put("Leclerc", "Charles");
        pers.put("Hulkenberg", "Niko");
        pers.put("Vettel", "Sebastian");
        pers.put("Giovinazzi", "Antonio");
        System.out.println(pers);
//        System.out.println(sameName(pers));
        remove(pers,scanner);
        System.out.println(pers);
    }                          
    public static boolean sameName(Map<String, String> map) {
        for (String key : map.keySet()) {
            String value = map.get(key);
            if (map.containsValue(value)) {
                return true;
            }
        }
        return false;
    }
    public static Map<String, String> remove(Map<String, String> map, Scanner scanner) {
        System.out.println("Who do u want to remove");
        String x = scanner.nextLine();
//        map.entrySet().removeIf(entry -> entry.getValue().equals(x));
//        return map;
//        for (Map.Entry<String, String> entry:map.entrySet()) {
//            if (entry.getValue().equals(x)) {
//                map.remove(entry.getKey());
//                System.out.println(map);
        Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<String,String> entry = itr.next();
            if (entry.getValue().equals(x)) {
                itr.remove();
            }
        }
        return map;

    }
}


