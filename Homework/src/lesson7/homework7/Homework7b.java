package lesson7.homework7;

import java.util.*;

public class Homework7b {
    public static void main(String[] args) {
        Map<String, String> personMap = createMap();
        printMap(personMap);

        Map<String, Integer> result = getCountWithTheSameFirstName(personMap);
        if(result.size() > 0){
            System.out.println("There are people with the same name in the map: " + result);
        }else {
            System.out.println("There are no people with the same name in the map");
        }

        optimizedSearchSameName(personMap);

        removePersonByName(personMap, "Orest");
        printMap(personMap);

    }

    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Ivanov", "Orest");
        map.put("Petrov", "Petr");
        map.put("Sidorov", "Sidor");
        map.put("Romanov", "Roman");
        map.put("Andreev", "Andrei");
        map.put("Alekseev", "Aleksey");
        map.put("Dmitrov", "Orest");
        map.put("Sergeev", "Sergey");
        map.put("Ostapov", "Petr");
        map.put("Bobrov", "Orest");
        return map;
    }

    public static void printMap(Map<String, String> map){
        for(Map.Entry<String, String> pair: map.entrySet()){
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> getCountWithTheSameFirstName(Map<String, String> map){

        //create a map where key is a name and value is a number of occurrences
        Map<String, Integer> result = new HashMap<>();
        for(String name: map.values()){
            Integer count = result.get(name);
            if(count != null){
                result.put(name, count+1);
            }else {
                result.put(name, 1);
            }
        }

        //only leave names which occur more than ones
        Iterator<Map.Entry<String, Integer>> i = result.entrySet().iterator();
        while (i.hasNext()){
            if(i.next().getValue() < 2){
                i.remove();
            }
        }
        return result;
    }

    public static void optimizedSearchSameName(Map<String, String> map){
        Set<String> setOfFirstNames = new HashSet<String>(map.values());
        if(map.size() > setOfFirstNames.size()){
            System.out.println("NEW There are people with the same first name in the map");
        }else {
            System.out.println("NEW There are NO people with the same name");
        }

    }

    public static void removePersonByName(Map<String, String> map, String firstName){
        Iterator<Map.Entry<String, String>> i = map.entrySet().iterator();
        while (i.hasNext()){
            if(i.next().getValue().equals(firstName)){
                i.remove();
            }
        }
    }
}
