import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("A");
        set1.add("D");
        set1.add("C");
        Set<String> set2 = new HashSet<>();
        set2.add("A");
        set2.add("B");
        System.out.println(set1);
        System.out.println(set2);
        //якщо викликати 2 методи одразу, то перший метод перезапише вказаний сет, а інший вже буде порівнювати із перезаписаним
        //треба робити окремий set щоб не перезаписувати вже існуючі
        System.out.println(union(set1,set2));
        //System.out.println(intersect(set1,set2));

    }

    public static Set<String> union(Set<String> set1, Set<String> set2) {
        set1.addAll(set2);
        return set1;
    }

    public static Set<String> intersect(Set<String> set1, Set<String> set2) {
        set1.retainAll(set2);
        return set1;
    }
}
