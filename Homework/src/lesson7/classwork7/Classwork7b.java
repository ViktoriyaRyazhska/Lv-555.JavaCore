package lesson7.classwork7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Classwork7b {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Ivan");
        employeeMap.put(2, "Ostap");
        employeeMap.put(3, "Bogdan");
        employeeMap.put(4, "Taras");
        employeeMap.put(5, "Nickolay");
        employeeMap.put(6, "Roman");
        employeeMap.put(7, "Ivan");

        printMap(employeeMap);

        System.out.print("\n Please, enter ID:> ");
        int idNumber = Integer.parseInt(reader.readLine());
        searchByIdNumber(employeeMap, idNumber);
        optimizedSearchById(employeeMap, idNumber);

        searchByName(reader, employeeMap);
    }

    public static void printMap(Map<Integer, String> map){
        for(Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void searchByIdNumber(Map<Integer, String> map, int idNumber){
        System.out.println("Search using function containsKey()");
        if(map.containsKey(idNumber)){
            System.out.println("Entered ID = " + idNumber + ", name is " + map.get(idNumber));
        }
        else {
            System.out.println("There is no such ID");
        }
    }

    public static void optimizedSearchById(Map<Integer, String> map, int idNumber) {
        System.out.println("Optimized search");
        String name = map.get(idNumber);
        if(name != null){
            System.out.println("Entered ID = " + idNumber + ", name is " + name);
        }
        else {
            System.out.println("There is no such ID");
        }
    }

    public static void searchByName(BufferedReader reader, Map<Integer, String> map) throws IOException {
        System.out.print("\n Please, enter name:> ");
        String name = reader.readLine();

        if(!map.containsValue(name)){
            System.out.println("There is no such name");
            return;
        }

        for(Map.Entry<Integer, String> entry: map.entrySet()) {
            if(entry.getValue().equals(name)) {
                System.out.println("Entered name is " + entry.getValue() + ", ID = " + entry.getKey());
            }
        }
    }

}
