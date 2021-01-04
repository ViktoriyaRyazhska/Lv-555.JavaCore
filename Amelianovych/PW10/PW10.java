package PW10;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class PW10 {
    public static void main(String[] args) {

        //        ArrayList<Integer> list;
//        Random rnd = new Random();
//        list = (ArrayList<Integer>) rnd.ints(10,0,20).limit(5).boxed().collect(Collectors.toList());
//        System.out.println(list);
//        ArrayList <Integer> numb = list = (ArrayList<Integer>) rnd.ints(10,0,20).limit(5).sorted().boxed().collect(Collectors.toList());
//        int max = list.stream().mapToInt((x) -> x).summaryStatistics().getMax();
//        System.out.println(numb);
//        System.out.println(max);

//        LocalDateTime currentTime = LocalDateTime.now();
//        System.out.println(currentTime.getDayOfWeek());
//        System.out.println(currentTime.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));


        List<String> s = Arrays.asList("9", "A", "Z", "1", "B", "Y", "4");
        List<String> sSorted = sorting(s);
        System.out.println(sSorted);
    }
    public static List<String> sorting (List<String> s){
        return s.stream().sorted().collect(Collectors.toList());
    }
}
