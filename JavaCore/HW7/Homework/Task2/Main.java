import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, String> personMap = new HashMap<>();
        personMap.put("Pavlov", "Orest");
        personMap.put("Pavlenko", "Orest");
        personMap.put("Orestov", "Pavlo");
        personMap.put("Kos", "Kate");
        personMap.put("Marki", "Yan");
        personMap.put("Momo", "Ya");
        personMap.put("Momomo", "Yana");
        personMap.put("Mimimi", "Anna");
        personMap.put("Mim", "Hlop");
        personMap.put("Mima", "Popala");
        System.out.println(personMap);
        duplicate(personMap);
        removeByValue(personMap, "Orest");
        System.out.println(personMap);
    }

    public static void duplicate(Map<String, String> map) {
        Set<String> set = new HashSet<>(map.values());
        if (set.size() < map.size()) {
            System.out.println("There are duplicates");
        } else {
            System.out.println("There is no duplicates");
        }
    }

    public static void removeByValue(Map<String, String> map, String value) {
        // map.entrySet().removeIf(entry -> entry.getValue().equals(value));
        //IDE пропонує замінити for на попередню лямбду. Мені просто дуже подобається)
        for (Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator(); iterator.hasNext(); ) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getValue().equals(value)) {
                iterator.remove();
            }
        }
    }
}






