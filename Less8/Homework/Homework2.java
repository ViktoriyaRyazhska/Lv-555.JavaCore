import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework2 {
    public static void main(String[] args) {
        String str = "I    am      learning     Java   Core";
//        String patt = "[ ]+";
        Pattern p = Pattern.compile("[ ]+");
        Matcher m = p.matcher(str);
        System.out.println(m.replaceAll(" "));
    }
}

