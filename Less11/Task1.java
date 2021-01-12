import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task1 {


    public static void main(String[] args) {
        //Task1
        Random random = new Random();
        random.ints(10, 1, 100).forEach(System.out::println);
        //Task2
        random.ints(10, 1, 100).sorted().forEach(System.out::println);
        //Task3
        IntSummaryStatistics stats = random.ints(10, 1, 100).summaryStatistics();
        System.out.println("Max random int is: " + stats.getMax());
        //Task4
        System.out.println(LocalDate.now().getDayOfWeek());
        LocalDate date = LocalDate.now();
        LocalDate firstMonday = date.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        System.out.println("first Monday of Month :" + firstMonday);
        //Task6
        List<String> str = new ArrayList<>();
        str.add("abcd");
        str.add("lmnop");
        str.add("qrstuv");
        str.add("efg");
        str.add("wxyz");
        str.add("higk");
        List<String> sortedStr = str.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedStr);

        str.sort((s1, s2) -> {
            if (s1.length() > s2.length()) return 1;
            else if (s1.length() < s2.length()) return -1;
            else return 0;
        });
        System.out.println(str);
    }
}
