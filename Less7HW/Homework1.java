import java.util.HashSet;
import java.util.Set;

public class Homework1 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(3);
        set1.add(5);
        set1.add(7);
        set1.add(9);
        set1.add(12);
        Set<Integer> set2 = new HashSet<Integer>();
        set2.add(1);
        set2.add(2);
        set2.add(5);
        set2.add(6);
        set2.add(4);
        set2.add(13);

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println(union);
        Set<Integer> intersect = new HashSet<>(set1);
        union.retainAll(set2);
        System.out.println(union);
    }
}