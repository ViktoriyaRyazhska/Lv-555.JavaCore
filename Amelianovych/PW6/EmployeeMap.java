package PW6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class EmployeeMap {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, String> map = new HashMap();
        map.put(1, "Tom");
        map.put(2, "Alex");
        map.put(3, "Joe");
        map.put(4, "Nancy");
        map.put(5, "Andy");
        map.put(6, "Kathy");
        map.put(7, "Jon");

        for (Iterator i = map.entrySet().iterator(); i.hasNext();){
            Map.Entry entry = (Map.Entry) i.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("Please enter a key#");
       int m = Integer.parseInt(bf.readLine());
        if (map.containsKey(m)) System.out.println("The value for key " + m + " is " + map.get(m));
        else System.out.println("There is no such key");

        System.out.println("Please enter a name");
        String value = bf.readLine();

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().equals(value))
                System.out.println("The key for value " + value + " is " + entry.getKey());
        }
    }
}
