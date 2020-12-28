import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork7_3 {
    public static void main(String[] args) {

        System.out.println("Enter your text");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\$(\\d*)\\.\\d{2}");
        Matcher matcher = pattern.matcher(line);

        while (matcher.find()){
            System.out.println(line.substring(matcher.start(), matcher.end()));
        }
    }

}
