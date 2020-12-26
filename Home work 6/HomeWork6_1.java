import java.util.HashSet;
import java.util.Set;

public class HomeWork6_1 {

        public static void main(String[] args) {
            Set<String> s1 = new HashSet<>();
            s1.add("Oleg");
            s1.add("Anna");
            s1.add("Yura");

            Set<String> s2 = new HashSet<>();
            s2.add("Viktor");
            s2.add("Yura");
            s2.add("Roman");

            System.out.println("1 Map:" + s1);
            System.out.println("2 Map: " + s2);
            System.out.println("Union method " + union(s1, s2));
            System.out.println("Intersect method" + intersect(s1, s2));

        }

        public static Set<String> union(Set<String> s1, Set<String> s2) {
            s1.addAll(s2);
            return s1;
        }

        public static Set<String> intersect(Set<String> s1, Set<String> s2) {
            s1.retainAll(s2);
            return s1;
        }
    }
