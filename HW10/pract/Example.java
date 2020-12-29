import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Example {
	public static void main(String... var)
	{
		System.out.println("First");
		int n = 5;
		Random random = new Random();
		List<Integer> numbers = random.ints(5,10).limit(n).boxed().collect(Collectors.toList());
		numbers.forEach(System.out::println);
		System.out.println("Second");
		numbers.stream().mapToInt(x->x).sorted().forEach(System.out::println);
		System.out.println("Third");
		IntSummaryStatistics stats = numbers.stream()
			.mapToInt((x) -> x).summaryStatistics();
		System.out.println("The biggest number  : " + stats.getMax());
		System.out.println("Fourth");
		LocalDateTime a = LocalDateTime.now();
		System.out.println(a.getDayOfWeek());
		System.out.println("Fifth");
		LocalDateTime t = a.with(TemporalAdjusters.dayOfWeekInMonth(1, DayOfWeek.MONDAY));
		System.out.println(t);
		System.out.println("Sixth");
		List<String> strs = Arrays.asList("sdgdsf", "fdgsd", "sdfg", "dfg", "ahd");
		List<String> strs2 = strs.stream().sorted().collect(Collectors.toList());
		System.out.println(strs2);
	}
}