import java.util.ArrayList;
import java.util.List;

public class Homework1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abcd");
        list.add("jklmno");
        list.add("pqrstu");
        list.add("efg");
        list.add("vwxyz");
        list.add("hi");

        List<String> list2 = new ArrayList<>(list);
        list2.removeIf(n -> (n.length() < 5));
        System.out.println(list2);
    }
}
