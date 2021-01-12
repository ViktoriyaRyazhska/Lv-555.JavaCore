import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pat = "\\$[0-9]*\\.[0-9]{2}";
        String str = scanner.nextLine();
        Pattern p = Pattern.compile(pat);
        Matcher m = p.matcher(str);
        while (m.find()) {
            System.out.print(str.substring(m.start(), m.end()));
        }
    }
}
