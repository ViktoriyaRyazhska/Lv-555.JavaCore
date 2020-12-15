package PW7;

import java.util.*;

public class MyCollection {
    public static void main(String[] args) {
    Random rand = new Random();
    ArrayList <Integer> list = new ArrayList<>();
    for (int i = 0; i < 10; i++){
        list.add(rand.nextInt(30));
    }
        System.out.println(list);

    for (int j = 0; j < list.size(); j++)
            if (list.get(j) >= 20 ){
        list.remove(list.get(j));
        j--;
    }
        System.out.println(list);
            if (list.size() >= 2) {list.remove( 1); list.add(1,1);}
            if (list.size() >= 5){list.remove( 4);list.add(4,-4);}
            if (list.size() >= 8){list.remove( 7);list.add(7,-3);}
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
