import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Print sentence of five words:");
		String s = sc.nextLine();
		String[] words = s.split(" ");
		int imax = 0;
		int wordMax = words[0].length();
		for (int i = 1; i < words.length; i++) {
			if (wordMax < words[i].length()) {
				wordMax = words[i].length();
				imax = i;
			}
		}
		System.out.println("The longest word in the sentence is: "+words[imax]);
		System.out.println("The number of its letters is: "+wordMax);
		System.out.println(new StringBuilder(words[1]).reverse());
		System.out.println("Print sentence:");
		s = sc.nextLine();
		System.out.println(s.replaceAll("[\\s]{2,}", " "));
		sc.close();
		s = "I have $20.99. Can you sell it for $0.99?";
		Pattern p = Pattern.compile("\\$(\\d*)(\\.\\d{2})?");
		Matcher m = p.matcher(s);
		while (m.find()) {
		  System.out.println(s.substring(m.start(), m.end()));
		}
	}
}