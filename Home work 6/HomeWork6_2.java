import java.util.*;

public class HomeWork6_2 {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Lagdan", "Olha");
        personMap.put("Pukaljk", "Orest");
        personMap.put("Yurechko", "Pavlo");
        personMap.put("Ivanov", "Ivan");
        personMap.put("Petrov", "Petro");
        personMap.put("Berezkij", "Bogdan");
        personMap.put("Pavluchlo", "Yana");
        personMap.put("Pavlenko", "Vika");
        personMap.put("Tarasov", "Orest");
        personMap.put("Haj", "Ivanna");
        output(personMap);
        identicalNames(personMap);
        System.out.println("Введіть значення для видалення: ");

        Scanner s = new Scanner(System.in);
        String name = s.nextLine();

        removeByValue(personMap, name);
        System.out.println("Map після видалення");
        output(personMap);
    }

    public static void output (Map<String, String> map){
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Прізвище: " + entry.getKey() + " Ім'я: " + entry.getValue());
        }
    }

    public static void identicalNames(Map<String, String> map) {
        Set<String> copy = new HashSet<>(map.values());
        if (copy.size() < map.size()) {
            System.out.println("Є присутні одинакові імена");
        } else {
            System.out.println("Не має одинакових імен");
        }
    }
    public static void removeByValue(Map<String, String> map, String value) {

        for (Iterator<Map.Entry<String, String> > iterator = map.entrySet().iterator(); iterator.hasNext(); ) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getValue().equals(value)) {
                iterator.remove();
            }
        }
    }
}
