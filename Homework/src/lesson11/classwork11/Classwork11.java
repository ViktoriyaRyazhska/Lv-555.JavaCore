package lesson11.classwork11;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class Classwork11 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = 7;
        System.out.println("Task 1");
        random.ints().limit(n).forEach(System.out::println);


        System.out.println("Task 2");
        random.ints().limit(n).sorted().forEach(System.out::println);

        System.out.println("Task 3");
        System.out.println(random.ints().limit(n).max());

        System.out.println("Task 4");
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("The day of week today is " + currentTime.getDayOfWeek());

        System.out.println("Task 5");
        LocalDateTime t = currentTime.with(TemporalAdjusters.dayOfWeekInMonth(1, DayOfWeek.MONDAY));
        System.out.println(t);

        System.out.println("Task 6");
        List<String> strings = Arrays.asList("hello", "", "what", "are", "", "you", "doing");
        sortList(strings);

    }

    public static void sortList(List<String> list) {
        list.stream().sorted().forEach(System.out::println);

    }
}
