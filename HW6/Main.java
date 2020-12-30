package zero;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        List<Integer> set1 = new ArrayList<Integer>();
        set1.add(1);
        set1.add(4);
        set1.add(12);
        set1.add(2);
        set1.add(5);
        List<Integer> set2 = new ArrayList<Integer>();
        set2.add(1);
        set2.add(3);
        set2.add(7);
        set2.add(9);
        set2.add(11);
        set2.add(12);

        System.out.println(new Main().intersection(set1, set2));
        System.out.println(new Main().union(set1, set2));
    }

    public <T> List<T> union(List<T> set1, List<T> set2) {
        Set<T> set = new HashSet<T>();

        set.addAll(set1);
        set.addAll(set2);

        return new ArrayList<T>(set);
    }

    public <T> List<T> intersection(List<T> set1, List<T> set2) {
        List<T> list = new ArrayList<T>();

        for (T t : set1) {
            if(set2.contains(t)) {
                list.add(t);
            }
        }

        return list;
    }
}