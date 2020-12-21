import java.util.Scanner;
import java.util.regex.*;

public class Less8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String lWord = new String();
		
		System.out.println("Input sentanse1:");
		String s1 = sc.nextLine();
		String[] str = s1.split(" ");
		
		for (int i = 0; i < str.length; i++) {
			if (str[i].length() > lWord.length()) {
				lWord = str[i];
			}
		}
		
		StringBuilder sb = new StringBuilder(lWord);
		System.out.println("Longest word: " + lWord);
		System.out.println("This word contains " + lWord.length() + " letters");
		System.out.println("Reverse :" + sb.reverse());
		
		System.out.println("Input sentanse2:");
		String s2  = sc.nextLine();
		s2 = s2.replaceAll("( )+"," ");
		System.out.println(s2);
		
		String pattern = "[$]\\d{0,10}\\.\\d{2}+";
		System.out.println("Input sentanse3:");
	     String text = sc.nextLine();
	     Pattern p = Pattern.compile(pattern);
	     Matcher m = p.matcher(text);
	     
	     while (m.find()) {
	        System.out.print(text.substring(m.start(), m.end()) + " ");
	  }
	}

 
}


