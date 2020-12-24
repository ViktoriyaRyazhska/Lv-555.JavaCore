import java.nio.channels.ScatteringByteChannel;
import java.sql.SQLOutput;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        setMyCollection(myCollection, scanner);
//        removeOverTwenty(myCollection);
//        System.out.println(myCollection);
//        System.out.println(removeOverTwenty(myCollection));
        System.out.println(insertElements(myCollection));
        Collections.sort(myCollection);
    }
    public static List<Integer> setMyCollection(List<Integer> list, Scanner scanner) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter number");
            list.add(scanner.nextInt());
        }
        return list;
    }
    public static List<Integer> NewCollection(List<Integer> list) {
        List<Integer> list2 = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 5) {
                list2.add(i);
            }
        }
        return list2;
    }
    public static List<Integer> removeOverTwenty(List<Integer> list) {
        List <Integer> removedTwenty = new ArrayList();
        for (Integer integer : list) {
            if (integer < 20) {
                removedTwenty.add(integer);
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) < 20) {
//                removedTwenty.add(list.get(i));
            }
        }
        return removedTwenty;
    }
    public static List<Integer> insertElements(List<Integer> list) {
        int position = 0;
        List<Integer> listWithInsertedElements = new ArrayList<Integer>(list);
        for (int i = 0; i < listWithInsertedElements.size(); i++) {
            switch (position) {
                case 2:
                    listWithInsertedElements.set(2, 1);
                    System.out.println("position: " + position + " value of element: " + listWithInsertedElements.get(2));
                    break;
                case 8:
                    listWithInsertedElements.set(8, -3);
                    System.out.println("position: " + position + " value of element: " + listWithInsertedElements.get(8));
                    break;
                case 5:
                    listWithInsertedElements.set(5, -4);
                    System.out.println("position: " + position + " value of element: " + listWithInsertedElements.get(5));
            }
            position++;
        }
        return listWithInsertedElements;
    }
}




