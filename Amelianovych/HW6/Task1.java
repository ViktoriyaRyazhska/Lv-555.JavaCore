package HW6;

import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        Set s = new HashSet();
        Set c = new HashSet();
        s.add("Cat");
        s.add("Dog");
        s.add("Frog");
        c.add("Cow");
        c.add("Bird");
        c.add("Frog");
        System.out.println(s);
        union(s,c);
        System.out.println(s);
        intersect(s,c);
        System.out.println(c);
    }
    public static void union (Set<String> s , Set<String> c) {
        s.addAll(c);
        }
        public static void intersect (Set<String> s, Set<String> c){
        c.retainAll(s);
        }
}
