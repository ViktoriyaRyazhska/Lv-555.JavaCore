package HW6;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("Morano", "Kyle");
        map.put("Drews", "Ann");
        map.put("Rodriges", "Marta");
        map.put("Sikorsky", "Tom");
        map.put("Black", "Steve");
        map.put("Rodri", "Santa");
        map.put("Shevchenko", "Orest");
        map.put("Lasrt", "Ann");
        map.put("Brown", "John");
        map.put("Sanches", "Phil");
        System.out.println(map);
        removeName(map);
        System.out.println(map);
        findDups(map);
    }

    public static void removeName (Map<String, String> map){
        for (Iterator i = map.entrySet().iterator(); i.hasNext(); ) {
            Map.Entry entry = (Map.Entry) i.next();
            if (entry.getValue().equals("Tom")) i.remove();
        }
    }

    public static void findDups(Map<String,String> map) {
        Set<String> valuesSet = new HashSet<String>(map.values());
        if (valuesSet.size()<map.size()){
            System.out.println("There are a duplicates");
        }
    }
}
