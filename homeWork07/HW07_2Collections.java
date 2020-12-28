package firstPac;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HW07_2Collections {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> personMap = new LinkedHashMap<String, String>();
        personMap.put("Bender", "Ostap");
        personMap.put("Sperrow", "Jack");
        personMap.put("Pushkin", "Alex");
        personMap.put("Daniels", "Jack");
        personMap.put("Sinatra", "Frank");
        personMap.put("Gray", "Sasha");
        personMap.put("Bond", "James");
        personMap.put("Zuckerberg", "Mark");
        personMap.put("Schwarzenegger", "Arnold");
        personMap.put("Lee", "Bruse");
        System.out.println(personMap);
        
        sameName(personMap);
        remove(personMap,sc);
        System.out.println(personMap);
    }                          
    
	public static void sameName(Map<String, String> map) {
       	Set<String> set = new HashSet<>(map.values());
        if (set.size() < map.size()) {
        	System.out.println("SAME NAME");
        } else { 
        	System.out.println("NO SAME NAME");
        	}
	}
    
	
    public static Map<String, String> remove(Map<String, String> map, Scanner sc) {
        System.out.println("Who should to leave?");
        String x = sc.nextLine();
        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<String,String> entry = iter.next();
            if (entry.getValue().equals(x)) {
                iter.remove();
            }
        }
        sc.close();
        return map;

    }
}




