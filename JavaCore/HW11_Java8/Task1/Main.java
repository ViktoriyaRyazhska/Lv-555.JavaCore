import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Andrew");
        list1.add("Kate");
        list1.add("O");
        list1.add("hahahahahahahah");
        list1.add("like");
        list1.add("text");
        List<String> list2 = new ArrayList<>(list1);
        list2.removeIf(word -> (word.length()) > 4);
        System.out.println(list2);
    }
}

