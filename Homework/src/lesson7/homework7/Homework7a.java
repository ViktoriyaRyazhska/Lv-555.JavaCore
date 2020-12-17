package lesson7.homework7;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class Homework7a {
    public static void main(String[] args) {

        Set<Integer> set1 = createSet();
        Set<Integer> set2 = createSet();

        union(set1, set2);
        intersection(set1, set2);
    }

    public static Set<Integer> createSet() {

        Set<Integer> set = new HashSet<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            set.add(rand.nextInt(20));
        }
        return set;
    }

    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }
}
